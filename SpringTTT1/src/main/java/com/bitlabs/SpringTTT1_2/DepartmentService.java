package com.bitlabs.SpringTTT1_2;

import java.util.List;

public class DepartmentService {
	private List<Department> department;

	public List<Department> getDepartment() {
		return department;
	}

	public void setDepartment(List<Department> department) {
		this.department = department;
	}

	public DepartmentService(List<Department> department) {
		super();
		this.department = department;
	}

	public DepartmentService() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "DepartmentService [department=" + department + "]";
	}
	
	
	public void displayDepartmentDetails() {
        for (Department department : department) {
            System.out.println("Department ID: " + department.getId());
            System.out.println("Department Name: " + department.getName());

            List<Employee> employees = department.getEmployee();
            System.out.println("Employees in the Department:");
            for (Employee employee : employees) {
                System.out.println("  Employee ID: " + employee.getId());
                System.out.println("  Employee Name: " + employee.getName());
                System.out.println("---------------------------");
            }
            System.out.println("---------------------------");
        }
    }
	
	
	
	

}
