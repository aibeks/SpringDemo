package io.java.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Kyrgyzstan kg = context.getBean("batken", Kyrgyzstan.class);
		System.out.println(kg.population());

		context.close();
	}

}
