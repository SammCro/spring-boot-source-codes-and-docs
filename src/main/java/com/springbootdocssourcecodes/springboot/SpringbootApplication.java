package com.springbootdocssourcecodes.springboot;

import com.springbootdocssourcecodes.springboot.DAOs.StudentDao;
import com.springbootdocssourcecodes.springboot.Models.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

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

//You can define your own identifier generator by implementing the IdentifierGenerator interface.

//We use Transactional annotation in the repository to make sure that
//the database operations are performed in a transactional manner.


@SpringBootApplication(scanBasePackages = "com.springbootdocssourcecodes.springboot")
public class SpringbootApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);

	}
	@Bean
	public CommandLineRunner commandLineRunner(StudentDao studentDao) {
		return runner -> {
			createStudent(studentDao);
		};
	}

	public void createStudent(StudentDao studentDao) {
		Student student = new Student();
		student.setFirstName("John");
		student.setLastName("Doe");
		student.setEmail("ilk.samett06@gmail.com");
		studentDao.saveStudent(student);

		System.out.println(student.getId());
	}
}
