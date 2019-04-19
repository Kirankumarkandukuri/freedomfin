package com.freedom.task.config;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.auth0.jwt.JWTVerifier;

@Component
public class JWTSecurityVerifier {

	 @Value("${freedom.jwt.token.issuer}")
	    private String issuer;
	    @Value("${freedom.jwt.token.secret}")
	    private String secret;

    private static JWTVerifier verifier;

    @PostConstruct
    private void init() {
        verifier =  new JWTVerifier(secret); //Reusable verifier instance
    }

    public JWTVerifier getVerifier(){
        return verifier;
    }

}
