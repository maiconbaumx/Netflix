para inicializar un nodo de swarm (modo single-node)
> docker swarm init

para ver el estado  del swarm
> docker info

para ver los nodos que forman el cluster
> docker node ls

para añadir más nodos (NOTA: se usa en este ejemplo)
https://docs.docker.com/engine/swarm/swarm-tutorial/add-nodes/

con la version 2+ del docker-compose.yml puedes hacer funcionar varios servicios deplegados simultaneamente y en lazados con 'link', pero para ello tienes que configura una red 'overlay'
> docker network create --driver overlay --subnet 10.0.9.0/24 my-multi-host-network
(que asigna un rango de IP a los diferentes servicios que se desplieguen)

para lanzar un servicio sobre el cluster de swarm
(swarn no permite 'build' de imagenes, tienes que usar imagenes pre-generadas)
(el parametro '--update-delay 10s' permite definir el ritmo de renovacion que tendrán un servicio que cambia de imagen... ver más adelante)
(el parametro '--network my-multi-host-network' permite utilizar el driver overlay para estos servicios)
> docker service create --replicas 1 --name helloworld [opcional --update-delay <N>s] jiglesgom/hello[:<tag>] [opcional CMD]

con un fichero de 'compose' funciona simplemente:
> docker stack deploy --compose-file .\swarm\docker-compose.yml demo (donde 'demo' es el nombre del stack de servicios que se depliega) 

para inspecionar los detalles del servicio que está corriendo ('--pretty' cambia el formato JSON por uno más legible en pantalla)
> docker service ls (lista los servicios)
> docker service inspect --pretty helloworld (detalle de un servicio)

para saber en qué nodo/s está corriendo el servicio (en nuestro ejemplo solo hay uno :-))
> docker service ps helloworld

en los nodos donde esté corriendo, para ver informacion del container puedes usar
> docker ps

si quieres cambiar el numero de replicas del servicio que se están ejecutando:
> docker service scale helloworld=<replicas> (espera un numero)
> docker service ps helloworld (mostrará la nueva lista de N servicios distribuidos entre los nodos disponibles)

si usas 'compose' puedes hacer
> docker-compose scale hello=3 (donde 'hello' es uno de los servicios defindos en el 'compose')

para elminar un servicio que está corriendo
> docker service rm helloworld (elimina todas sus replicas)
> docker service inspect helloworld (no debe devolver nada)

un servicio desplegado (con multiples instancias) puede renovarse a una nueva version de la imagen, mediante el uso de
> docker service update --image jiglesgom/hello:swarm helloworld (actualiza el servicio a la imagen con etiqueta 'swarm'... esperando el tiempo definido en update-delay para renovar cada replica del servicio)

por temas de mantenimiento puedes querer que uno de los nodos deje de recibir peticiones, para eso se usa 'drain'
https://docs.docker.com/engine/swarm/swarm-tutorial/drain-node/
