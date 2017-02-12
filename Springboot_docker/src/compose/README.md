#DOCKER COMPOSE

Docker compose permite compilar las imagenes (a diferencia de swarm que solo funciona con imagenes precompiladas)

> docker-compose build --pull [service]

opcionalmente puedes indicar uno de los servicios que forman parte de la coposicion por ejemplo "eureka" o "hello"

Para lanzar todos los sercicios:

> docker-compose up

el mapeo de puertos está definido dentro del docker-compose.yml

Se crea una instanca de red automaticamente 'compose_default' que comparten todos los servicios.

En mi caso se crea con el driber 'bridge' así que se le asigna una ip diferente a la del host, del rango 192.168.99.100
 (seguramente esto depende de si ejecutas el ejemplo sobre un docker nativo (p.e. Win10) o si lo haces sobre VBox :-(
