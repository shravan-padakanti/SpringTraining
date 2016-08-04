package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configuration.ConfigureClass;
import dao.ClerkDAO;
import entity.Clerk;

public class JdbcMain {

	public static void main(String[] args) {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(ConfigureClass.class);
		//ApplicationContext appContext = new ClassPathXmlApplicationContext("spring.xml");
		ClerkDAO clerkDAO = appContext.getBean(ClerkDAO.class);
		Clerk c = clerkDAO.getClerk("123-45-6789");
		System.out.println(c.getName());
		((AnnotationConfigApplicationContext)appContext).close();
		//((ClassPathXmlApplicationContext)appContext).close();
	}

}
