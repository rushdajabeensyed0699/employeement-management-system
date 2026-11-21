package model;

public class Main {

	public static void main(String[] args) {
		
		EmployeeRepository repository = new EmployeeRepository();
		EmployeeService service = new EmployeeService(repository);
		
		repository.addEmployee(new Developer(1,"Rushda", 20000));
		repository.addEmployee(new Developer(2,"John",40000));
		repository.addEmployee(new Developer(3,"Alex",50000));
		
		repository.addEmployee(new Manager(101,"Mahee",600000));
		repository.addEmployee(new Manager(102,"Ayzal",700000));
		
		System.out.println("All Employees");
		service.displayAllEmployees();
		
		System.out.println("-----------------------------");
		System.out.println("Get Highest Paid Employees");
		System.out.println(service.getHighestPaidEmployee());
		
		System.out.println("-----------------------------");
		System.out.println("Sort Employees By Salary");
		service.sortEmployeesBySalary();
		
		System.out.println("-----------------------------");
		System.out.println("Sort Employees By DESC");
		service.sortEmployeeSalaryByDesc();
		
		System.out.println("-----------------------------");
		System.out.println("Count Employees");
		System.out.println(service.countEmployees());
		
		System.out.println("-----------------------------");
		System.out.println("Employee Above Salary");
		service.employeeAboveSalary(40000);
		
		Employee foundemp = repository.searchEmployeeById(2);
		
		System.out.println("-----------------------------");
		System.out.println("Search Employees");
		System.out.println(foundemp);
		
		System.out.println("-----------------------------");
		System.out.println("Remove Employees");
		repository.removeEmployee(3);
		service.displayAllEmployees();	
		
		System.out.println("-----------------------------");
		System.out.println("Update Employees");
		repository.updateSalary(101, 80000000);
		service.displayAllEmployees();	
		
		
		
		
		
		
		
			

	}

}
