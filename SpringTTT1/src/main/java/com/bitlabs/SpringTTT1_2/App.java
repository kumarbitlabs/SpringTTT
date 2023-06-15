package com.bitlabs.SpringTTT1_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/bitlabs/SpringTTT1_2/config.xml");
		
		DepartmentService ds=context.getBean("departmentService",DepartmentService.class);
		ds.displayDepartmentDetails();
	}

}
