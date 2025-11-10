FROM eclipse-temurin:17-jdk

EXPOSE 5000

COPY build/libs/*.jar .
COPY build/resources/main/keystore.jks .
CMD java -jar ph-ee-connector-ams-mifos-1.0.0-SNAPSHOT.jar

