# Sample Java EE application
# Sample Java EE application
The purpose of this repository is to serve as a personal reference. This is a Java application that can be hosted on an Wildfly 10. Technologies currently implemented in this repository:

+ Spring MVC
+ RESTful webservices via JAX-RS
+ Statless EJB
+ JPA


##Getting started
The following software is required to run this application:

+ Java 1.8
+ Maven 3
+ Wildfly 10.1.0 application server
+ ~~Oracle XE ~~ - Moved to embedded Wildfly H2 database
+ [Insomnia REST API client] (https://insomnia.rest/)  - currently required to interact all CRUD operations of webservices]


##TODO
1. Support full crud via the UI. Currently only a list of users is prented at: http://<Server-address>:8080/dwk/users/home