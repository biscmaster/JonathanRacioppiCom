FROM maven:3.8.5-openjdk-17
COPY . .
ENV mysqladdress=$mysqladdress mysqlpassword=$mysqlpassword mysqlusername=$mysqlusername mysqlport=$mysqlport
RUN mvn clean install
ENTRYPOINT java ./JonathanRacioppiCom/target/JonathanRacioppiCom-0.0.1-SNAPSHOT.jar

