#include <stdio.h>
#include <string.h>
#include <sys/types.h> 
#include <sys/socket.h>
#include <sys/types.h>
#include <netinet/in.h>
#include <netdb.h>
#include <math.h>
#include <stdlib.h>
#include <assert.h>
#include <ClientServer.h>

#define MAX_BUFFER 512

int get_random_number(void);
int toBinary(int decimal);
uint8_t * enodeASN(long bcoded, char*message, int printHex);
ClientServer_t * decodeASN(uint8_t * message, int size, int printHex);
char* upperToLowerAndLowerToUpper(char* original);


int getMsgLength(uint8_t *msg_addr) {
  return msg_addr[1]+2;
}



int main(int argc, char *argv[])
{   
    int printHex = atoi(argv[2]);
    char *message = "";

    uint8_t * sendBuffer;
    uint8_t recvBuffer[32];


    int sockfd, portno, n, ran,i, rcv_msg=0;
    struct sockaddr_in serv_addr;
    struct hostent *server;
    char buffer[MAX_BUFFER];

    /*Getting Server parameters*/
    portno = 22011;
    /************************/

    memset(&sendBuffer, 0, sizeof(sendBuffer)); 
    memset(&recvBuffer, 0, sizeof(recvBuffer));

    /* Create a socket point */
    sockfd = socket(AF_INET, SOCK_STREAM, 0);
    if (sockfd < 0) 
    {
        perror("ERROR opening socket");
        exit(1);
    }
    server = gethostbyname(argv[1]);
    if (server == NULL) {
        fprintf(stderr,"ERROR, no such host\n");
        exit(0);
    }

    bzero((char *) &serv_addr, sizeof(serv_addr));
    serv_addr.sin_family = AF_INET;
    serv_addr.sin_addr.s_addr = inet_addr(argv[1]);
    serv_addr.sin_port = htons(portno);
    

    if (connect(sockfd,(struct sockaddr *)&serv_addr,sizeof(serv_addr)) < 0) 
    {
         perror("ERROR connecting");
         exit(1);
    }	
    printf("-----------socket connected------\n\n");

    /*Encode message*/  
    sendBuffer =  enodeASN(toBinary(get_random_number()),message, printHex);
    int msg_len = getMsgLength(sendBuffer);

    /* Send message to the server */
    if ((n = write(sockfd, sendBuffer, (int)msg_len)) < 0) 
    {
         perror("ERROR writing to socket");
         exit(1);
    }

	if ((n = read(sockfd, recvBuffer, sizeof(recvBuffer))) < 0) 
	{
	    perror("ERROR reading from socket");
	    exit(1);
	}


  /*Decode message*/
  int size = getMsgLength(recvBuffer);

  ClientServer_t *asnReceived;
  memset(&asnReceived, 0, sizeof(ClientServer_t));
  asnReceived = decodeASN(recvBuffer, size, printHex);

  char * stringReceived = (char *) calloc(1, sizeof(ClientServer_t)); 
  stringReceived = asnReceived->randomStringOrVerification.buf;
  int intReceived =(int) asnReceived-> binaryCodedInteger;
  printf("2nd: Server replied: %d %s\n",intReceived,stringReceived);

  /*Convert received String*/
  char* regexConverted= calloc(0, sizeof(stringReceived));
  regexConverted = upperToLowerAndLowerToUpper(stringReceived);

  /*Encode the info with ASN*/
  sendBuffer =  enodeASN(0, regexConverted, printHex);
  msg_len = getMsgLength(sendBuffer);

  /*Send to server*/
	if ((n = write(sockfd, sendBuffer, (int)msg_len)) <0) 
	{
	   perror("ERROR writing to socket");
	   exit(1);
	}

  /*Receive from Server*/
  if ((n = read(sockfd, recvBuffer, sizeof(recvBuffer))) < 0) 
  {
      perror("ERROR reading from socket");
      exit(1);
  }
  size = getMsgLength(recvBuffer);
  asnReceived = decodeASN(recvBuffer, size, printHex);
  stringReceived = asnReceived->randomStringOrVerification.buf;
  printf("Answer from server: %s\n", stringReceived);

  return 0;
} 


int get_random_number()
{
    int seed;
    srand(time(NULL));
    seed = rand();

    int decimal =  seed % 1000;
    //r = min + uniform_deviate ( rand() ) * ( max - min );
    return (decimal);
}

int toBinary(int decimal)
{
    int rem, i=1, binary=0;
    while (decimal!=0)
    {
        rem=decimal%2;
        decimal/=2;
        binary+=rem*i;
        i*=10;
    }
    printf("1st: sending binary number to server: %d\n", binary);
    return binary;
}


char* upperToLowerAndLowerToUpper(char* expr)
{
  //the same size
  char *temp = (char*)malloc(strlen(expr)+1);
  int k=0;
  
  for (k;k<strlen(expr);k++)
  {
    if (expr[k]>=65 && expr[k]<=90) temp[k]=expr[k]+32;
    else if (expr[k]>=97 && expr[k]<=122) temp[k]= expr[k]-32;
    else temp[k]=expr[k];
  }
  printf("\nNew regex I send: %s\n", temp);
  
  return temp;
}


uint8_t* enodeASN(long bcoded, char*message, int printHex){
	ClientServer_t *myClient;
  asn_enc_rval_t er; //encoded return value

  uint8_t *buf;
  buf = calloc(1, sizeof(ClientServer_t));
	myClient = calloc(1, sizeof(ClientServer_t));

  myClient->binaryCodedInteger = bcoded;
  myClient->randomStringOrVerification.buf  = calloc(1, strlen(message));
  memcpy(myClient->randomStringOrVerification.buf, message, strlen(message));
  myClient->randomStringOrVerification.size = strlen(message);

  er = der_encode_to_buffer(&asn_DEF_ClientServer, myClient,
      buf, sizeof(ClientServer_t));

  int msglen = getMsgLength(buf);
    if(printHex == 1){
    int j;
    printf("Message in hexadecimal I send:  ");
    for (j = 0; j < msglen; j++) {
      printf("%x ", buf[j]);
    }
    printf("\n\n");
    }

  return buf;	
}

ClientServer_t * decodeASN(uint8_t * message, int size, int printHex){
    ClientServer_t * ASNReceived = 0;
    asn_dec_rval_t rval;

    rval = ber_decode(0, &asn_DEF_ClientServer, (void **)&ASNReceived, message, size);
    if(rval.code != RC_OK) {
      printf("Decoding failed !\n");
    }
    if(printHex == 1 ){
    int j;
    printf("Message in hexadecimal received:  ");
    for (j = 0; j < size; j++) {
      printf("%x ", message[j]);
    }
    printf("\n");
    }
    return ASNReceived;
}


