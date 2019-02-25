FROM openjdk:8
ARG VCS_REF
LABEL maintainer "Thomas Hasler (froorider@gmail.com)"
LABEL org.label-schema.vcs-ref=$VCS_REF \
          org.label-schema.vcs-url="https://github.com/codeheap/SpringBootSample"
VOLUME /tmp
EXPOSE 8080:8080
ADD SpringBootSample-0.4.1.jar app.jar
RUN sh -c 'touch /app.jar'
RUN apt-get update
RUN apt-get install curl -y -q
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
HEALTHCHECK --interval=1m --timeout=5s CMD curl -f http://localhost:8080/tron || exit 1
