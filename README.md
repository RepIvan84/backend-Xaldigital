# Spring backend-Xaldigital Sample Application Build Status
Backend Sping Java Api Rest

Running backend-Xaldigital
backend-Xaldigital is a Spring Boot application built using Maven. You can build a jar file and run it from the command line (it should work just as well with Java 11 or newer):

git clone https://github.com/RepIvan84/backend-Xaldigital.git
cd backend-Xaldigital/
git checkout master
./mvnw clean package -DskipTests
java -jar target/*.jar


# Building a Container
You can build a container image (if you have a docker daemon) using :

docker-compose up

You can then access Documentation backend-Xaldigital here: http://localhost:8080/swagger-ui/index.html#/

![image](https://user-images.githubusercontent.com/67239143/173843147-db63f35a-fff2-4fee-95ee-d9db171a6eb5.png)
