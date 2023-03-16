package com.springbootdocssourcecodes.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// all beans are initiliazed immediately
// by Lazy annotation, beans are initialized when they are called
// by Primary annotation, if there are multiple beans of the same type, the bean with the primary annotation is used
// by Qualifier annotation, if there are multiple beans of the same type, the bean with the qualifier annotation is used
// Scope annotation, singleton, prototype, request, session, global session
// ScopeGlocal
// by Autowired annotation, the bean is injected into the class

// Prototype beans are not managed by the Spring container
// Prototype beans are not cached
// Prototype beans are not thread safe
// Prototype beans are not eligible for @PostConstruct and @PreDestroy callbacks

// Singleton beans are managed by the Spring container
// Singleton beans are cached
// Singleton beans are thread safe
// Singleton beans are eligible for @PostConstruct and @PreDestroy callbacks


//ConfigurableBeanFactory.SCOPE_PROTOTYPE
//ConfigurableBeanFactory.SCOPE_SINGLETON

@SpringBootApplication(scanBasePackages = "com.springbootdocssourcecodes.springboot")
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

}
