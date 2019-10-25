# cookie-test
One spring boot producer app
One spring boot consumer app

Followed this example - https://dzone.com/articles/spring-cloud-stream-with-kafka

Used Kafka 2.11-2.2.0

In server.properties uncommented this line:
listeners=PLAINTEXT://127.0.0.1:9092

to run the apps:
mvn spring-boot:run

then:

http://localhost:8080/greetings?message=hello -> launch a greeting message in the producer

Both apps use spring cloud stream 2.2.0.RELEASE
