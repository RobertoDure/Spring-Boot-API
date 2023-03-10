FROM openjdk:8
EXPOSE 8080
ADD target/springboot-api.jar springboot-api.jar
ENTRYPOINT ["java","-jar","/springboot-api.jar"]