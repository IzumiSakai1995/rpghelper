FROM openjdk:8-jre
MAINTAINER  IzumiSakai1995@gmail.com

WORKDIR /app
ADD ../rh-provider-0.0.1-SNAPSHOT.jar app.jar



ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","app.jar"]

EXPOSE 8886