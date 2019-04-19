package com.freedom.task.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.auth0.jwt.JWTSigner;

@RestController
public class ServiceController {
	
	 private static final Logger log = LoggerFactory.getLogger(ServiceController.class);
	 

	    @Value("${freedom.jwt.token.issuer}")
	    private String issuer;
	    @Value("${freedom.jwt.token.secret}")
	    private String secret;
	    @Value("${freedom.jwt.token.ttl}")
	    private Integer tokenTTL;
	
	 @Autowired
	   RestTemplate restTemplate;
	
	
	@RequestMapping(value = "/generateToken", method = RequestMethod.POST)
	public String  generateToken() {
		
		 final JWTSigner signer = new JWTSigner(secret);
	        final HashMap<String, Object> claims = new HashMap<String, Object>();
	        claims.put("iss", issuer);
	       
	        JWTSigner.Options options = new JWTSigner.Options();
	        options.setExpirySeconds(tokenTTL);
	        final String jwt = signer.sign(claims, options);
	        return jwt;
	
	}
	


}
