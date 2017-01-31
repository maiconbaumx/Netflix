# Netflix
Eureka is a simple eureka server on port 8761: http://localhost:8761/
Hello is a simple "hello world" microservice on port 8762: http://localhost:8762/hello
Zuul is a simple balancer only configured for "hello" example: http://localhost:8765/hello/hello
HystrixDash is dashboard for Zuul hystrix stream overview: http://localhost:7979/hystrix/monitor?stream=http%3A%2F%2Flocalhost%3A8765%2Fhystrix.stream
