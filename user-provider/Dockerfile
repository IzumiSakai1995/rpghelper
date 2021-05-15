FROM maven:3-openjdk-8
RUN mkdir -p /source/dubbo-admin-snapshot
ADD . /source/dubbo-admin-snapshot
WORKDIR /source/dubbo-admin-snapshot
RUN mvn --batch-mode clean package -Dmaven.test.skip=true

FROM openjdk:8-jre
LABEL maintainer="dev@dubbo.apache.org"
RUN apt-get update && apt-get install -y tini
COPY --from=0 /source/dubbo-admin-snapshot/dubbo-admin-distribution/target/dubbo-admin-0.3.0-SNAPSHOT.jar /app.jar
COPY entrypoint.sh /usr/local/bin/entrypoint.sh

ENV JAVA_OPTS = ""

#ENTRYPOINT ["tini", "--", "/usr/local/bin/entrypoint.sh"]

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]

EXPOSE 8080