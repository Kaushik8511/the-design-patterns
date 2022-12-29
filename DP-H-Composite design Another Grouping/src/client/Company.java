package client;

import component.Employee;
import composite.Manager;
import leaf.Developer;

public class Company {

	public static void main(String[] args) {
		Employee dev1 = new Developer("Kaushik", 1, "Software developer");
		Employee dev2 = new Developer("Jeet", 2, "Data Engineer");
		
		Manager engManager = new Manager("Yadav", 54242.32);
		engManager.addEmployee(dev1);
		engManager.addEmployee(dev2);
		
		Employee dev3 = new Developer("Chintan", 3, "Security Engineer");
		Employee dev4 = new Developer("Kirtan", 2, "Application Developer");
		
		Manager generalManager = new Manager("Satish", 432322.21);
		generalManager.addEmployee(dev3);
		generalManager.addEmployee(dev4);
		generalManager.addEmployee(engManager);
		
		generalManager.showEmployeeDetails();
		
	}

}
