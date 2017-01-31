package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@EnableAutoConfiguration
@EnableEurekaClient
@RestController
public class HelloApplication {

  @RequestMapping("/hello")
  public String home() {
    try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		e.printStackTrace();
	} 
	return "Hello World";

  }

  public static void main(String[] args) {
    SpringApplication.run(HelloApplication.class, args);
  }

}