package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@EnableAutoConfiguration
@EnableEurekaClient
@RestController
public class HelloApplication {

  @RequestMapping("/hello")
  public String home(@RequestParam("sleep") int time) {
	if (time>0) {
	    try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	return "Hello World\n";
  }

  public static void main(String[] args) {
    SpringApplication.run(HelloApplication.class, args);
  }

}