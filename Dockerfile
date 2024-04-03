#Versao do java
FROM openjdk:18-jdk-slim
#declarando tudo da pasta target vai esta na variavel JAR_FILE
ARG JAR_FILE=target/*.jar
#renomeando o jar file para app.jar
COPY ${JAR_FILE} app.jar
#tudo que vai executado assim que o container iniciar
#se tiver o parametro "-Djava.security.egd=file:/dev/.urandom" é para compatibilidade inferiores ao java 8
ENTRYPOINT ["java","-jar","/app.jar"]