FROM maven:3-openjdk-8
RUN mkdir -p /source/provider
ADD . /source/provider
WORKDIR /source/provider

RUN mvn --batch-mode clean package -Dmaven.test.skip=true

FROM openjdk:8-jre
LABEL maintainer="dev@dubbo.apache.org"
RUN pwd && ls -a
COPY --from=0 /source/provider/user-provider/target/user-provider.jar /app.jar

ENV JAVA_OPTS = ""

#ENTRYPOINT ["tini", "--", "/usr/local/bin/entrypoint.sh"]

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]

EXPOSE 8085