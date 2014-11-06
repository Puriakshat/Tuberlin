
if [ $# > 1 ] 
then
	if [ "$1" = "server" ]
	then
		java -jar ./server/jar/Assignment1.jar
	

	elif [ "$1" = "clientOK" ]
	then
		g++ ./client/source/main.cpp -o ./client/build/client
		./client/build/client	
	

	elif [ "$1" = "clientFail" ]
	then 
		g++ ./client/source/mainFail.cpp -o ./client/build/clientFail	
		./client/build/clientFail

	else
		echo "Not a valid argument. Only clientOK/clientFail/server accepted as argument"
	fi
else
	echo "the program needs one client/server argument"
fi
