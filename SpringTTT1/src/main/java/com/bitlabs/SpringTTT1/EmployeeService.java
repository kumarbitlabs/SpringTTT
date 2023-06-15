package com.bitlabs.SpringTTT1;

import java.util.List;

public class EmployeeService {
	private List<Employee> employee;

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	public void displayEmployeeDetails() {
        for (Employee employee : employee) {
            System.out.println("ID: " + employee.getId());
            System.out.println("Name: " + employee.getName());
            System.out.println("Designation: " + employee.getDesignation());
            System.out.println("---------------------------");
        }
    }

    public void displayEmployeesByDesignation(String designation) {
        for (Employee employee : employee) {
            if (employee.getDesignation().equals(designation)) {
                System.out.println("ID: " + employee.getId());
                System.out.println("Name: " + employee.getName());
                System.out.println("Designation: " + employee.getDesignation());
                System.out.println("---------------------------");
            }
        }
    }

	@Override
	public String toString() {
		return "EmployeeService [employee=" + employee + "]";
	}
   
}
