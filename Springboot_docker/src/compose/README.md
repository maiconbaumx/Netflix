#DOCKER COMPOSE

Docker compose permite compilar las imagenes (a diferencia de swarm que solo funciona con imagenes precompiladas)

> docker-compose build --pull [service]

opcionalmente puedes indicar uno de los servicios que forman parte de la coposicion por ejemplo "eureka" o "hello"

Para lanzar todos los sercicios:

> docker-compose run -p 7979:7979 -p 8765:8765 -p 8761:8761 -p 8762:8762

donde '-p port:port' se usa para mapear los puertos del docker con los del host
