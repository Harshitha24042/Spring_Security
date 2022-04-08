package Q2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {
     @GetMapping("/admin")
     public String hello() {
    	 return "Hello World!";
     }
}