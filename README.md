# cookie-test
One spring boot cloud stream producer app
One spring boot cloud stream consumer app
Kafka
AppDynamics

# Pre-requisites:
- maven 
- JDK 8
- AppD controller

Followed and modified this example - https://dzone.com/articles/spring-cloud-stream-with-kafka



# 1. Setup Kafka
Download Kafka from here and untar it:
> tar -xzf kafka_2.11-1.0.0.tgz
> cd kafka_2.11-1.0.0

In config/server.properties I uncommented this line:
listeners=PLAINTEXT://127.0.0.1:9092

Start Zookeeper and Kafka

> bin/zookeeper-server-start.sh config/zookeeper.properties
> bin/kafka-server-start.sh config/server.properties

If Kafka is not running and fails to start after your computer wakes up from hibernation, delete the <TMP_DIR>/kafka-logs folder and then start Kafka again.

# 2. Configure AppD and run the apps
1. Replace AppD controller access key with the one of your controller in AppServerAgent-4.5.15.28231/conf/controller-info.xml
2. Go to each app's target folder
3. Run Consumer spring app:
> java -javaagent:../../AppServerAgent-4.5.15.28231/javaagent.jar -Dappdynamics.agent.tierName=consumer -Dappdynamics.agent.nodeName=consumernode -jar cookie-consumer-0.0.1-SNAPSHOT.jar
4. Run Producer spring app:
> java -javaagent:../../AppServerAgent-4.5.15.28231/javaagent.jar -Dappdynamics.agent.tierName=producer -Dappdynamics.agent.nodeName=producernode -jar cookie-producer-0.0.1-SNAPSHOT.jar

# 3. Test the app
Hit 
> http://localhost:8080/greetings?message=hello 
in a browser to launch a greeting message in the producer


