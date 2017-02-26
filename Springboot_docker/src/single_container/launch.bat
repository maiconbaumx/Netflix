docker build -t jiglesgom/microservice_demo_single_container .
docker run -p 7979:7979 -p 8761:8761 -p 8762:8762 -p 8763:8763 -p 8765:8765 jiglesgom/microservice_demo_single_container

