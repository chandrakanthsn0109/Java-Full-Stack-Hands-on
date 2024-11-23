package com.spring.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

//		Beanfactory
//		Resource rsc = new ClassPathResource("Beans.xml");
//		BeanFactory factory = new XmlBeanFactory(rsc);
//		Employee employee = (Employee) factory.getBean("emp1");
//		System.out.println(employee);
//		
//		Employee employee1 = (Employee) factory.getBean("emp2");
//		System.out.println(employee1);
//		
//		Employee employee2 = (Employee) factory.getBean("emp3");
//		System.out.println(employee2);

//		Using Application-Context or Spring-Context
			ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

//		Employee employee = (Employee) context.getBean("emp1");
//		System.out.println(employee);
//		
//		Employee employee1 = (Employee) context.getBean("emp2");
//		System.out.println(employee1);
//		
//		Employee employee2 = (Employee) context.getBean("emp3");
//		System.out.println(employee2);
//		
//		Employee employee3 = (Employee) context.getBean("emp4");
//		System.out.println(employee3);

//		Employee employee2 = (Employee) context.getBean("emp3");
//		System.out.println(employee2);
//		
//		Employee employee3 = (Employee) context.getBean("emp5");
//		System.out.println(employee3);

//		LIST-Collection Injection
//		Question ques = (Question) context.getBean("ques1");
//		System.out.println(ques);
//		
//		Question ques1 = (Question) context.getBean("ques2");
//		System.out.println(ques1);

//		MAP-Collection Injection
//		Book b = (Book) context.getBean("b1");
//		System.out.println(b);

//		Book b1 = (Book) context.getBean("b2");
//		System.out.println(b1);

//		Book b1 = (Book) context.getBean("b3");
//		System.out.println(b1);
//		
//		Book b3 = (Book) context.getBean("b4");
//		System.out.println(b3);

//	    Bean Scop
		Hello h1 = (Hello) context.getBean("hello");
		System.out.println(h1.getMsg());
		
		h1.setMsg("Welcome");
		System.out.println(h1.getMsg());
		
		Hello h2 = (Hello) context.getBean("hello");
		System.out.println(h2.getMsg());

	}

}
