package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.Car;

public class SpringDemoMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Car c=context.getBean(Car.class);
		System.out.println(c.getModel()+"\t"+c.getColor()+"\t"+c.getCost()+"\t"+c.getEngine().getNoOfCyclinders());
		((ClassPathXmlApplicationContext)context).close();
	}
}
