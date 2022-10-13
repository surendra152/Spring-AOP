package com.springaop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//i am using without xml for this project

@Configuration
@EnableAspectJAutoProxy		//this annotation is used to Enables support for handling components marked with AspectJ's @Aspect annotation
@ComponentScan(basePackages = "com.springaop")
public class JavaConfig {
	
	

}
