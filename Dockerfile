FROM openjdk:8-jre-alpine
EXPOSE 8082
ADD target/parcial2_factura-0.0.1-SNAPSHOT.jar factura.jar
ENTRYPOINT ["java","-jar","factura.jar"]