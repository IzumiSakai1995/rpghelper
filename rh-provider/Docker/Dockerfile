FROM maven:3-openjdk-8
MAINTAINER  IzumiSakai1995@gmail.com

WORKDIR /app
ADD ../rh-provider-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8886

ENTRYPOINT ["java","‐jar"]
CMD ["/app.jar"]