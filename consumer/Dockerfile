FROM maven:3-openjdk-8
ADD ./consumer/target/consumer.jar /app.jar

ENV JAVA_OPTS = ""

#ENTRYPOINT ["tini", "--", "/usr/local/bin/entrypoint.sh"]

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]

EXPOSE 8083