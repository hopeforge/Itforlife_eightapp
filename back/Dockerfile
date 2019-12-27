FROM anapsix/alpine-java
WORKDIR /
ADD /target/graaccapi-*.jar graaccapi.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "graaccapi.jar"]
