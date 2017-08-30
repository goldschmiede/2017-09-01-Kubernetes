FROM alpine
RUN apk --update add openjdk8-jre
ENTRYPOINT ["/usr/bin/java", "-jar", "/usr/share/greeting/greeting-service.jar"]

# Add Maven dependencies (not shaded into the artifact; Docker-cached)
# ADD target/lib           /usr/share/greeting/lib
# Add the service itself
ADD target/greeting-service.jar /usr/share/greeting/greeting-service.jar
