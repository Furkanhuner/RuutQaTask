# Ruut

TEST AUTOMATION PROJECT
--------------------
This test project writed by Furkan Hüner on 14.03.2022

This project was written using the selenium-cucumber bdd structure. Junit, Bonigarcia Web Driver Manager and Log4j libraries were used in the project by using maven infrastructure.

Project logging all steps in test under src/logs folder. 

Project Structure
-----------------

~~~~
│config.properties
│   pom.xml
│   ReadMe.md
│
└───src
└───test
├───java
│   ├───base
│   │       Driver.java
│   │
│   ├───pages
│   │       HomePage.java
│   │
│   ├───steps
│   │       HomePageSteps.java
│   │       HomePageStepDefinitions.java
│   │
│   └───testsuites
│           RuutTestTestSuite.java
│
└───resources
│   log4j.properties
│
└───features
            RuutTest.feature
~~~~

* config.properties - Web Driver and Base url here.
* src/test/java/base - Base Driver here.
* src/test/java/pages - Home pages element information
* src/test/java/steps - Home page steps and page steps defined 
* src/test/java/testsuites - Glued testsuites for features
* src/test/java/resources/features - Test scenarios writed here