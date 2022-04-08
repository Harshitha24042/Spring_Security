package Q3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello3 {

	@GetMapping("/Jdbc")
	public String admin() {
		return "Hello World!(JDBC)";
	}
}