package com.erik.cookie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@ComponentScan("com.erik.cookie.web","com.erik.cookie.service")
@SpringBootApplication
public class CookieProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CookieProducerApplication.class, args);
	}

}
