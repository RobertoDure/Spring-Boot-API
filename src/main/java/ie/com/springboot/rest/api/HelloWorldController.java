package ie.com.springboot.rest.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {

@GetMapping("/hello")
public String HelloWorld(){
return "Hello my friend";
}

}

//"java.home": "/usr/lib/jvm/java-11-openjdk-amd64"