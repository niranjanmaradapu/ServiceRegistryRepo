FROM openjdk:8
COPY  target/*  target/
RUN  mv target/*.jar   target/service-registry.jar
ENTRYPOINT ["java", "-Dspring.profiles.active=cloud", "-jar", "target/service-registry.jar"]
