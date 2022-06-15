# Spring backend-Xaldigital Sample Application Build Status

Backend Sping Java Api Rest

Running backend-Xaldigital
backend-Xaldigital is a Spring Boot application built using Maven. You can build a jar file and run it from the command line (it should work just as well with Java 11 or newer):

git clone https://github.com/RepIvan84/backend-Xaldigital.git

cd backend-Xaldigital/

git checkout master

./mvnw clean package -DskipTests

java -jar target/*.jar


# Building a Container with BD Postgres and populate info

You can build a container image (if you have a docker daemon) using :

docker-compose up

You can then access Documentation backend-Xaldigital here: http://localhost:8080/swagger-ui/index.html#/

![image](https://user-images.githubusercontent.com/67239143/173843147-db63f35a-fff2-4fee-95ee-d9db171a6eb5.png)

1. Obtener el número de respuestas contestadas - http://localhost:8080/Api/respondidos

  1.1 Obtener el número de respuestas no contestadas - http://localhost:8080/Api/NoRespondidos

2. Obtener la respuesta con mayor reputación - http://localhost:8080/Api/mayorReputacion

3. Obtener la respuesta con menor número de vistas  - http://localhost:8080/Api/menorNumeroVisitas

4. Obtener la respuesta más vieja  - http://localhost:8080/Api/respuestaMasAntigua
  
  4.1 Obtener la respuesta más actual - http://localhost:8080/Api/respuestaMasActual

5. ¿Cuál es el nombre aeropuerto que ha tenido mayor movimiento durante el año? - http://localhost:8080/vuelos/sql/1

6. ¿Cuál es el nombre aerolínea que ha realizado mayor número de vuelos durante el - http://localhost:8080/vuelos/sql/2
año?

7. ¿En qué día se han tenido mayor número de vuelos? - http://localhost:8080/vuelos/sql/3

8. ¿Cuáles son las aerolíneas que tienen mas de 2 vuelos por día? - http://localhost:8080/vuelos/sql/4
