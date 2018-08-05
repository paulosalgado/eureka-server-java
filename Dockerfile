FROM openjdk:8-jre-alpine
LABEL MAINTAINER Paulo Salgado <pjosalgado@gmail.com>

EXPOSE 8761

ADD build/libs/eureka-server-java-0.0.1-SNAPSHOT.jar /
ENTRYPOINT java -jar eureka-server-java-0.0.1-SNAPSHOT.jar
