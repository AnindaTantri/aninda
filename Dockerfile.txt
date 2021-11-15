FROM openjdk:8-jdk-alpine
MAINTAINER aninda14 <anindatantri25@gmail.com>
RUN mkdir -p /app
WORKDIR /app

COPY sortAngka.java /app

#compile file java 
RUN javac sortAngka.java

#running java
ENTRYPOINT java sortAngka