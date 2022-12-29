package composite;

import java.util.ArrayList;
import java.util.List;

import component.Employee;

public class Manager implements Employee {

	private List<Employee> employees = new ArrayList<Employee>();
	private String name;
	private double salary;
	
	public Manager(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	@Override
	public void showEmployeeDetails() {
		
		System.out.println("-----------------------");
		System.out.println("Name: " + getName());
		System.out.println("Salary: " + getSalary());
		System.out.println("-----------------------");
		
		for(Employee employee: employees) {
			employee.showEmployeeDetails();
		}
	}
	
	//we are putting add, getChild and remove methods here to avoid violating some design principles
	//like interface segregation else we can put these methods into the Employee interface
	//but in that case leaf nodes will also have to implement the add and remove methods to make compiler happy
	
	//But as this is the interface methods clients need to know about the methods
	//So this is the trade off you can choose any of the above
	
	
	public Employee getChild(int index) {
		return employees.get(index);
	}
	
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
	public void removeEmployee(Employee employee) {
		employees.remove(employee);
	}

}
