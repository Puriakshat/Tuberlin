Ásgeir Bjarnson - 0359535
Akshat Puri - 0359766
David Farache - 0359922

a) Executing the assignment
b) Executing the server
c) Executing the client


a) Executing the code

Type in the following command from the Assignment1 folder. Make sure to always introduce one argument specifying whether you'd like to execute the code for the client or for the server

sh runAssignment1.sh [clientOK/clientFail/server] 

Executing "sh runAssignment1.sh clientOK" will execute a normal transaction. 

On the onther hand, executing "sh runAssignment1.sh clientFail" will force the FAIL message in the transaction. 





b) Executing the server

The server should be executed before the client. No arguments are necessary. Once executed the server will wait for clients. The server will print out every step throughout the transaction.





c) Executing the client

Once executed, the client will ask the user to type in the IP address of the server. Once done, the transaction will commence.The client will only print out the final
result being that OK or FAIL




