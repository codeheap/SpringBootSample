# SpringBootSample 

Build Status [![Build Status](https://travis-ci.org/codeheap/SpringBootSample.svg?branch=master)](https://travis-ci.org/codeheap/SpringBootSample) 
Docker  [![Docker](https://images.microbadger.com/badges/version/codeheap/springbootsample:0.4.svg)](https://microbadger.com/images/codeheap/springbootsample:0.4 "Get your own version badge on microbadger.com")

This is a personal sample of a SpringBoot powered REST-ful Webservice. The Application can be build and run using *Gradle*. 
Gradle installation is not required, because the project contains a Gradle wrapper.

## Build and Run

To build and run the Application run the following Command in a shell:
```bash
./gradlew bootRun
```

Default is listening on port 8080.
To check the service is running check: [Health monitor](http://localhost:8080/health/)

## Service method

The service named "/greeting" sends a JSON - File back containing an ID and a string namend "content". 
If you pass a parameter named "name" as a string, the content will be modified.

[Default request](http://localhost:8080/greeting)

[Modified request](http://localhost:8080/greeting?name=Stranger)

## Deployments

The app is available live on [Google container engine](http://35.189.250.127:8080/greeting)

The swagger-ui should also be on [Live Swagger-UI](http://35.189.250.127:8080/swagger-ui.html)

App is also available as docker image [Docker Hub Image](https://hub.docker.com/r/codeheap/springbootsample/)

## Postman Collection

In the folder /src/test/postman you can find a file containing a collection which can be imported into *postman*. 
The collection has also embedded some test's. 

## Additional information

If you want to see which task's are available for the project:

```bash
./gradlew tasks
``` 