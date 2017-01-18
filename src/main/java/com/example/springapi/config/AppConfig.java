package com.example.springapi.config;

import com.example.springapi.controller.HelloController;
import com.example.springapi.rest_controller.HelloRestController;
import com.example.springapi.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author manhnt
 */

@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = {HelloController.class, UserService.class})
public class AppConfig extends WebMvcConfigurationSupport {

	/* ======================== View Resolver ======================== */

	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {

		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
}
