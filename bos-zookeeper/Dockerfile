FROM openjdk:8
ADD target/bos-zookeeper-0.0.1-SNAPSHOT.jar  app.jar
RUN chmod +"/usr/share/app.jar"
EXPOSE 10104
ENTRYPOINT ["/usr/bin/java","-XX:+UnlockExperimentalVMOptions","-jar","/usr/share/app.jar"]





