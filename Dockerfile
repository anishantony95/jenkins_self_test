FROM  eclipse-temurin:17
COPY target/anish.jar anish.jar
CMD [ "java","-jar","anish.jar" ]