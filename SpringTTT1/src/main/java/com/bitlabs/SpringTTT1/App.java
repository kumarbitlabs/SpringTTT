package com.bitlabs.SpringTTT1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Scanner sc= new Scanner(System.in);
        
        ApplicationContext context= new ClassPathXmlApplicationContext("com/bitlabs/SpringTTT1/config.xml");
        
       /* Employee emp1= context.getBean("emp1",Employee.class);
        System.out.println(emp1);
        
        Employee emp2= context.getBean("emp2",Employee.class);
        System.out.println(emp2);
        
        Employee emp3= context.getBean("emp3",Employee.class);
        System.out.println(emp3);
        
        Employee emp4= context.getBean("emp4",Employee.class);
        System.out.println(emp4);
        */
        
        EmployeeService empService= context.getBean("employeeService",EmployeeService.class);
        
        System.out.println("Displaying All Employees");
       // System.out.println(empService.getEmployee());
        empService.displayEmployeeDetails();
        
        System.out.println("Displaying employee details by designation");
        System.out.println("enter designatioon");
        String designation=sc.nextLine();
        empService.displayEmployeesByDesignation(designation);
        
    }
}
