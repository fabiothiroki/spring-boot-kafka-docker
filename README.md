# Spring Boot Kafka Docker
Sample application on how to setup a spring boot with kafka for local development.

# Run
1. On Mac OS you need to start `docker-machine`:
```
docker-machine start default
```

2. Start kafka:
```
docker-compose up
```


3. Start Spring Boot application:
```
./mvnw spring-boot:run
```
