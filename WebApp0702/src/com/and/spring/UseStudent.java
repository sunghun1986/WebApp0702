package com.and.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseStudent {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = null;
		applicationContext = new ClassPathXmlApplicationContext("com/and/spring/aspect.xml");
		Student s = (Student)applicationContext.getBean("student");
		s.FirstTime();
		s.SecondTime();
		s.ThirdTime();
	}
}
