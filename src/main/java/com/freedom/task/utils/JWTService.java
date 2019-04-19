package com.freedom.task.utils;

import java.util.Map;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.auth0.jwt.JWTVerifier;
import com.freedom.task.controller.ServiceController;


@Service
public class JWTService {
	
	  private static final Pattern BEARER_AUTH = Pattern.compile("^[Bb][Ee][Aa][Rr][Ee][Rr]\\s+.*$");
	  
	    public static final String CLIENT_ID = "clientId";
	    private static final Logger log = LoggerFactory.getLogger(ServiceController.class);
	    
		@Value("${freedom.jwt.token.secret}")
		private String secret;
	    
   
	/**
     * Validates token and returns properties as Map
     * @param token
     * @return
     */
    public  boolean verifyToken(String token) throws Exception {

    	 if(BEARER_AUTH.matcher(token).matches()) {
             String[] tokenSplit = token.split("\\s+");
             Map<String, Object> claims;
             if(tokenSplit.length == 2) {
                 try {
                	  JWTVerifier verifier = new JWTVerifier(secret);
                     claims= verifier.verify(tokenSplit[1]);
                     return true;
                 } catch (Exception exception){
                	 log.error("Invalid Token Signature/Claims::", exception);
                 }
             }
         }

     return false;
    }

}
