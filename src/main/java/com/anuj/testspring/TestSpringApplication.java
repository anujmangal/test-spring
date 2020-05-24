package com.anuj.testspring;

import com.anuj.testspring.componentscan.TestComponent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class TestSpringApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext
				= new AnnotationConfigApplicationContext(TestSpringApplication.class);

		TestComponent testComponent = applicationContext.getBean(TestComponent.class);
		System.out.println(testComponent);

	}

}
