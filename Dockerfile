FROM openjdk:8-jre-alpine
EXPOSE 8081
ADD target/parcial2_inventario-0.0.1-SNAPSHOT.jar inventario.jar
ENTRYPOINT ["java","-jar","inventario.jar"]