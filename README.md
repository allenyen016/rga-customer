RGA Customer Module
===================

##Instructions
This project is a simple REST application. wihch use authentication in two way, HTTP Basic authentication and token based authentication.

which provide login with a customer domain by HTTP Basic authentication.

which provide logout and Basic operating by token Basic authentication.

Which is implemented by Spring Boot, Spring Data Rest and Spring Security. 
And tests is written by Rest Assured.


---------------------------------------------------------------

##What you need 

This project develop based on java 8 and use Maven to mange related dependencies, moreover, Which use Redis to store status of collaborators, so to run this project you also need Redis server installed on your machine.

You need the following tools:

A favorite text editor or IDE
JDK 1.8 or later
Maven 3.0+
Redis Server

----------------------------------------------------------------

##How to run it

To run this project, execute mvn spring-boot:run   root folder of the repository, then checkout localhost:8080

-----------------------------------------------------------------

##How to use it

Invoke login API with HTTP Basic authentication to get an access token.
Access cutromer data with token based authentication.
you need place token in the header when requesting customer APIs.
Now invoke customer APIs following URLs:

localhost:8080/customer/list	GET

localhost:8080/customer/		POST

localhost:8080/customer/		PUT

localhost:8080/customer/{id}	GET

localhost:8080/customer/{id}	DELETE

Notice:request and response are Json format by 
Cutromer class
	
Have fun!

-------------------------------------------------------------------

##Reference

Read "http://docs.spring.io/spring-session/docs/current/reference/html5/guides/rest.html" finging find how Authentication implemented by spring session.

Read "https://code.google.com/p/rest-assured/wiki/GettingStarted" for finging how and what Rest-Assured do test and validation  of REST services.


