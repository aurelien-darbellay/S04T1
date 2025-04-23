package cat.itacademy.s04.t01.n01;

import cat.itacademy.s04.t01.n01.controller.HelloWorldController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class S04T01N01Application {

	public static void main(String[] args) {
		SpringApplication.run(S04T01N01Application.class, args);
	}
	@Autowired
	HelloWorldController helloWorldController;

}
