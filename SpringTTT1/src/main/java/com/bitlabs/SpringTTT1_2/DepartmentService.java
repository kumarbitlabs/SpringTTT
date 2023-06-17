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
	
	public void displayEmployeesByDepartment(String departmentId) {
        for (Department dept : department) {
            if (dept.getId().equals(departmentId)) {
                List<Employee> employees = dept.getEmployee();
                System.out.println("Employees in Department with ID " + departmentId + ":");
                for (Employee employee : employees) {
                    System.out.println("  Employee ID: " + employee.getId());
                    System.out.println("  Employee Name: " + employee.getName());
                    System.out.println("---------------------------");
                }
                return;
            }
        }
        System.out.println("Department with ID " + departmentId + " does not exist.");
    }
}

public void addEmployeeToDepartment(String departmentId, Employee employee) {
    boolean departmentExists = false;
    for (Department dept : department) {
        if (dept.getId().equals(departmentId)) {
            dept.addEmployee(employee);
            departmentExists = true;
            break;
        }
    }
    
    if (!departmentExists) {
        System.out.println("Department with ID " + departmentId + " does not exist.");
    }
}

	
	
	
	

}
