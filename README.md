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


3. Start Spring Boot application:
```
./mvnw spring-boot:run
```
