cd ./src
chmod -R 777 *

javac -classpath ../lib/apache-activemq-5.9.1/activemq-all-5.9.1.jar ./middleware_assignment4/*.java stock/*.java stockSubscriber/*.java StockPublisher/*.java

if [ $# = 1 ] 
then

	if [ "$1" = "publish" ]
	then
		../lib/apache-activemq-5.9.1/bin/activemq restart
		echo "\n\nActiveMQ Initialized!\n\n"
		sleep 2s
	fi

	java -classpath ":../lib/apache-activemq-5.9.1/activemq-all-5.9.1.jar:" middleware_assignment4.Middleware_Assignment4 "$1"

fi



