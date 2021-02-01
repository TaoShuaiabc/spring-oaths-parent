package com.ts.rank.sso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@EnableOAuth2Sso
@SpringBootApplication
public class SpringOauthClient2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringOauthClient2Application.class, args);
	}

}
