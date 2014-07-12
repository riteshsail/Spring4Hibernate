package com.pratice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@EnableAspectJAutoProxy
@Configuration
@ComponentScan(basePackages={"com.pratice"})
@EnableWebMvc
public class DispatcherConfig {

	@Bean
	public UrlBasedViewResolver view()
	{
		UrlBasedViewResolver resolver=new UrlBasedViewResolver();
		resolver.setPrefix("/WEB-INF/view/");
		resolver.setSuffix(".jsp");
		resolver.setViewClass(JstlView.class);
		return resolver;
	}
	
}
