FROM maven:3.6.1-ibmjava-8-alpine
COPY . .
RUN mvn clean install
CMD ./mvnw spring-boot:run
EXPOSE 8080