FROM maven:3.8.5-openjdk-17 as build
COPY ./pom.xml .
CMD ["mvn", "dependency:go-offline"]
COPY . .
RUN mvn clean install


FROM openjdk:17-alpine
COPY --from=build ./target/JonathanRacioppiCom-0.0.1-SNAPSHOT.jar .
ENV mysqladdress=$mysqladdress mysqlpassword=$mysqlpassword mysqlusername=$mysqlusername mysqlport=$mysqlport
EXPOSE 6060
ENTRYPOINT ["java","-jar", "./JonathanRacioppiCom-0.0.1-SNAPSHOT.jar"]

