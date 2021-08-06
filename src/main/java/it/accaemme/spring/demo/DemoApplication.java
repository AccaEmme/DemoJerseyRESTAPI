package it.accaemme.spring.demo;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication extends ResourceConfig {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	public DemoApplication() {
		// register( GreetingsBean.class ); alternativa registrazione
		register( new GreetingsAPI() );
		System.out.println("To test: http://localhost:8080/rest/greets/lang/it/user/AccaEmme");
	}
}
