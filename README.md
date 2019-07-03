# Spring Boot Kafka Docker
Sample application on how to setup a spring boot with kafka for local development.

# Run
1. On Mac OS/Windows you need to start a previously created `docker-machine`:
```
docker-machine start <machine-name>
```

2. Start kafka:
```
docker-compose up
```

3. Edit [docker-compose.yml](docker-compose.yml) file to set your Kafka IP exposed through Docker:
```
- ADV_HOST=192.168.99.100
```

4. Edit [application.properties](src/main/resources/application.properties) file to set your Kafka IP exposed through Docker:
```
spring.kafka.bootstrap-servers=192.168.99.100:9092
```


5. Start Spring Boot application:
```
./mvnw spring-boot:run
```
