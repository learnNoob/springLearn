package com.noob;



import com.noob.entity.User;
import com.noob.service.Impl.WelcomeServiceImpl;
import com.noob.service.WelcomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.FileSystemXmlApplicationContext;

//@ComponentScan("com.noob.service.Impl")
public class Entrance {
	public static void main(String[] args) {
//		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
//		User bean = applicationContext.getBean(User.class);
//		System.out.println(bean);
		FileSystemXmlApplicationContext applicationContext1 = new FileSystemXmlApplicationContext("//Users/lizhiquan/Downloads/spring-framework-5.2.0.RELEASE/springdemo/src/main/resources/spring/spring-config.xml");
		WelcomeService welcomeService = (WelcomeService)applicationContext1.getBean("welcomeService");
		welcomeService.sayHello("123");


	}
}
