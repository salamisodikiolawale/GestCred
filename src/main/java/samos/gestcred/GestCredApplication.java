package samos.gestcred;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RequestMapping("/")
@RestController
public class GestCredApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestCredApplication.class, args);
	}

	@GetMapping
	public String hello() {
		return "Hello world";
	}

}
