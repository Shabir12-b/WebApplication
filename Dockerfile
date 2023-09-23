FROM eclipse-temurin:17
COPY target/smile.jar smile.jar
CMD [ "java", "-jar", "smile.jar" ]