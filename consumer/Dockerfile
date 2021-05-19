FROM maven:3-openjdk-8
RUN mkdir -p /source/consumer
ADD . /source/consumer
WORKDIR /source/consumer
RUN mvn --batch-mode clean package -Dmaven.test.skip=true

FROM openjdk:8-jre
LABEL maintainer="dev@dubbo.apache.org"
COPY --from=0 /source/consumer/dubbo-admin-distribution/target/dubbo-admin-0.3.0-SNAPSHOT.jar /app.jar


ENV JAVA_OPTS = ""

#ENTRYPOINT ["tini", "--", "/usr/local/bin/entrypoint.sh"]

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]

EXPOSE 8083