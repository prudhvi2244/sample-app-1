FROM openjdk:8
EXPOSE 8080
ADD target/Sample-App-1.jar Sample-App-1.jar
ENTRYPOINT ["java","-jar","/Sample-App-1.jar"]