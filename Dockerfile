FROM frolvlad/alpine-java:jre8-slim
COPY target/Calculator-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]