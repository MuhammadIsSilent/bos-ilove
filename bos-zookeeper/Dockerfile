FROM openjdk:8
ADD target/app.jar  /usr/share/app.jar
#RUN chmod +"/usr/share/app.jar"
EXPOSE 10104
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]




