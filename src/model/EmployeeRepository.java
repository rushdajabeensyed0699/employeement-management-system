package model;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
		
	private List<Employee> employees = new ArrayList<>();
	
	//add Employee
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
	//Get all employees
	public List<Employee> getAllEmployees(){
		return employees;
	}
	
	//SearchEmployeeById
	public Employee searchEmployeeById(int id) {
		for(Employee emp : employees) {
			if(emp.getId() ==id) {
				return emp;
			}
		}
		return null;
	}
	
	//Remove employee by id 
	public void removeEmployee(int id) {
		employees.removeIf(emp -> emp.getId() == id);
	}
	
	//Update Salary
	public void updateSalary(int id,double newSalary) {
		Employee employee = searchEmployeeById(id);
		
		if(employee!=null) {
			employee.setSalary(newSalary);
		}
	}
}
