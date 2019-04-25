package com.freedom.task.config;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.freedom.task.utils.JWTService;

public class SecurityFilter implements Filter {


	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		 WebApplicationContext applicationContext = WebApplicationContextUtils
	                .getWebApplicationContext(filterConfig.getServletContext());
		 jwtService = applicationContext.getAutowireCapableBeanFactory()
	                .createBean(JWTService.class);
	}
	
	@Autowired
	private JWTService jwtService;


	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		String accessToken = httpRequest.getHeader("Authorization");

		boolean tokenFound = StringUtils.isNotBlank(accessToken);
		if (tokenFound) {
			try {
				boolean isTokenValid = jwtService.verifyToken(accessToken);
				if (isTokenValid)
					chain.doFilter(request, response);
				else
					httpResponse.setStatus(HttpStatus.UNAUTHORIZED.value());
				return;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				httpResponse.setStatus(HttpStatus.UNAUTHORIZED.value());
				return;
			}
		} else {
			httpResponse.setStatus(HttpStatus.UNAUTHORIZED.value());
			return;
		}

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}
