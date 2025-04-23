package cat.itacademy.s04.t01.n02;

import cat.itacademy.s04.t01.n02.controller.HelloWorldController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class S04T01N02Application {

	public static void main(String[] args) {
		SpringApplication.run(S04T01N02Application.class, args);
	}
	@Autowired
	HelloWorldController helloWorldController;

}
