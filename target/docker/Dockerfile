FROM java:7
VOLUME /tmp
ADD dockerboot-1.0.jar app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-jar","/app.jar"]