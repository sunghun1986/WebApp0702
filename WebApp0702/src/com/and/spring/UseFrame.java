package com.and.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseFrame {
	
	public static void main(String[] args) {
		/*applicationContext 의 역할
		 xml에 명시한 빈들을 대상으로 인스턴스를 생성하고,
		 이들간의 weaving 관계가 있다면, 알아서 구현... 
		 applicationContext 가 메모리에 생성될때, xml에 명시된
		 모든 빈들도 함께 메모리에 올라간다..!
		 비슷) html, xml 의 DOM과 동일!
		 */
		
		ClassPathXmlApplicationContext applicationContext = null;
		applicationContext = new ClassPathXmlApplicationContext("com/and/spring/gui.xml");
		
		MyFrame myFrame = (MyFrame)applicationContext.getBean("myFrame");
		myFrame.init();
		
	}
	
}














