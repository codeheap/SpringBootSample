FROM frolvlad/alpine-oraclejdk8:slim
LABEL maintainer "Thomas Hasler (froorider@gmail.com)"
VOLUME /tmp
EXPOSE 8080:8080
ADD SpringBootSample-0.4.0.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
HEALTHCHECK --interval=1m --timeout=5s CMD curl -f http://localhost:8080/tron || exit 1
