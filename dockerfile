FROM openjdk:11.0.8-jdk
MAINTAINER inamkadirov
VOLUME /tmp
EXPOSE 8080
ADD target/docker-tutorial-0.0.1-SNAPSHOT.jar docker-tutorial-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/docker-tutorial-0.0.1-SNAPSHOT.jar"]
