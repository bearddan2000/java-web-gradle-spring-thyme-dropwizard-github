# java-web-gradle-spring-thyme-dropwizard-github

## Description
A portal to classify and filter all my repos.
[Previous version](https://github.com/bearddan2000/java-web-gradle-spring-thyme-github)

### web service
Serves a thyme based web page which uses
bootstrap + jquery to render repos and filters.

Uses RestTemplate calls from spring to dropwizard api.

### api service
Generic api the returns static list of filters.

## Tech stack
- java
- design patterns
  - bridge
  - composit
  - strategy
  - template
- microservice design patterns
  - gateway
- generics
- gradle
  - spring
  - RestTemplate
  - logback
- maven
  - dropwizard

## Docker stack
- gradle:jdk11
- maven:3-openjdk-17

## To run
`sudo ./install.sh -u`

## To stop
`sudo ./install.sh -d`

## For help
`sudo ./install.sh -h`
