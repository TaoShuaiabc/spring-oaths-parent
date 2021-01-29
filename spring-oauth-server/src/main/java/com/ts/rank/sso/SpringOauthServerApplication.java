package com.ts.rank.sso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication

public class SpringOauthServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringOauthServerApplication.class, args);
	}

}
