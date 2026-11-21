package model;

import java.util.Comparator;
import java.util.List;

public class EmployeeService {
	
	private EmployeeRepository repository;
	
	public EmployeeService(EmployeeRepository repository) {
		this.repository = repository;
		
	}
	
	public void displayAllEmployees() {
		List<Employee> employees = repository.getAllEmployees();
		
		for(Employee emp : employees) {
			System.out.println(emp);
		}
	}
	
	public Employee getHighestPaidEmployee() {
		return repository.getAllEmployees()
				.stream()
				.max(Comparator.comparing(Employee :: getSalary))
				.orElse(null);
		
	}
	
	public void sortEmployeesBySalary(){
		repository.getAllEmployees()
		.stream()
		.sorted(Comparator.comparing(Employee :: getSalary))
		.forEach(System.out::println);
	}
	
	public void sortEmployeeSalaryByDesc(){
		repository.getAllEmployees()
		.stream()
		.sorted(Comparator.comparing(Employee :: getSalary).reversed())
		.forEach(System.out::println);
	}
	
	public long countEmployees() {
		return repository.getAllEmployees()
				.stream().count();
	}
	
	public void employeeAboveSalary(double salary) {
		repository.getAllEmployees()
		.stream()
		.filter(emp -> emp.getSalary() >salary)
		.forEach(System.out::println);
	}

}
