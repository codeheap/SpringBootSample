# SpringBootSample

This is a personal sample of a SpringBoot powered REST-ful Webservice. The Application can be build and run using *Gradle*. 
Gradle installation is not required, because the project contains a Gradle wrapper.

##Build and Run

To build and run the Application run the following Command in a shell:

./gradlew bootRun

Default is listening on port 8080.
To check the service is running check: [Health monitor](http://localhost:8080/health/)

##Service method

The service named "/greeting" sends a JSON - File back containing an ID and a string namend "content". 
If you pass a parameter named "name" as a string, the content will be modified.

[Default request](http://localhost:8080/greeting)
[Modified request](http://localhost:8080/greeting?name=Stranger)

##Additional information

If you want to see which task's are available for the project:

./gradlew tasks 