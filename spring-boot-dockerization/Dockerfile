FROM openjdk:11

LABEL maintainer="javaguides.com"

ADD target/spring-boot-dockerization-0.0.1-SNAPSHOT.jar springboot-docker.jar

ENTRYPOINT ["java", "-jar", "springboot-docker.jar"]