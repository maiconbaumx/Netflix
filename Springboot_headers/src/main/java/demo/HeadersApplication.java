package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.util.MultiValueMap;

@Configuration
@EnableAutoConfiguration
@EnableEurekaClient
@RestController
public class HeadersApplication {

  @RequestMapping("/headers")
  public String home(@RequestHeader MultiValueMap<String,String> headers) {

	return "<pre>"+headers.toString().replaceAll("],","],\n")+"<\pre>";
  }

  public static void main(String[] args) {
    SpringApplication.run(HeadersApplication.class, args);
  }

}