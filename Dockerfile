FROM openjdk:8
VOLUME /tmp
EXPOSE 8080
ADD target/SpringBootDockerDemo-1.0.jar SpringBootDockerDemo-1.0.jar
ENTRYPOINT ["java","-jar","/SpringBootDockerDemo-1.0.jar"]