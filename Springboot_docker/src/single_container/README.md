#Docker all in one container

One docker to hold all 4 services: eureka, zuul, hystrix dashboard and hello&headers example

Publishes all ports and run all services from start.sh script (notice that  services are launched with &, but last one runs as main service on foreground).

build:
docker build -t jiglesgom/microservice_demo_single_container .

run (with port mapping):
docker run -p 7979:7979 -p 8761:8761 -p 8762:8762 -p 8763:8763 -p 8765:8765 jiglesgom/microservice_demo_single_container