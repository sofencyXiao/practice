package com.sofency.g_setter.a_spel;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSetter {
	@Test
	public void testDemo() {
		//����xmlSpring ��λ��
		String xmlPath = "com/sofency/g_setter/a_spel/beans.xml";
		//����spring����
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		Person person = (Person) applicationContext.getBean("PersonId");
		System.out.println(person);
		
		
		
	} 
}
