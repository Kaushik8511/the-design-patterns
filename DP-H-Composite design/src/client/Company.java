package client;

import component.Employee;
import composite.Directory;
import leaf.Developer;
import leaf.Manager;

public class Company {

	public static void main(String[] args) {
		Employee dev1 = new Developer("Kaushik", 1, "Software developer");
		Employee dev2 = new Developer("Jeet", 2, "Data Engineer");
		Directory engineeringDirectory = new Directory();
		engineeringDirectory.addEmployee(dev1);
		engineeringDirectory.addEmployee(dev2);
		
		Employee manager1 = new Manager("Satish", 3, "Project Manager");
		Employee manager2 = new Manager("Yadav", 4, "Team lead");
		
		Directory accDirectory = new Directory();
		accDirectory.addEmployee(manager2);
		accDirectory.addEmployee(manager1);
		
		Directory companyDirectory = new Directory();
		companyDirectory.addEmployee(engineeringDirectory);
		companyDirectory.addEmployee(accDirectory);
		
		//treat all of the employees same
		//regardless of it is developer or manager or directory
		companyDirectory.showEmployeeDetails();
	}

}
