From openjdk:8
copy ./target/springmysqlapp-0.0.1-SNAPSHOT.jar springmysqlapp-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","springmysqlapp-0.0.1-SNAPSHOT.jar"]