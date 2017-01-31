# Netflix
Eureka is a simple eureka server on port 8761: <a href="http://localhost:8761/">http://localhost:8761/</a>

Hello is a simple "hello world" microservice on port 8762: <a href="http://localhost:8762/hello">http://localhost:8762/hello</a>

Zuul is a simple balancer only configured for "hello" example: <a href="http://localhost:8765/hello/hello">http://localhost:8765/hello/hello</a>

HystrixDash is dashboard for Zuul hystrix stream overview: <a href="http://localhost:7979/hystrix/monitor?stream=http%3A%2F%2Flocalhost%3A8765%2Fhystrix.stream">dashboard</a>

