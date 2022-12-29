package composite;

import java.util.ArrayList;
import java.util.List;

import component.Employee;

public class Directory implements Employee {

	private List<Employee> employees = new ArrayList<Employee>();
	
	@Override
	public void showEmployeeDetails() {
		for(Employee employee: employees) {
			employee.showEmployeeDetails();
		}
	}
	
	//we are putting add and remove methods here to avoid violating some design principles
	//like interface segregation else we can put these methods into the Employee interface
	//but in that case leaf nodes will also have to implement the add and remove methods to make compiler happy
	
	//But as this is the interface methods clients need to know about the methods
	//So this is the trade off you can choose any of the above
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
	public void removeEmployee(Employee employee) {
		employees.remove(employee);
	}

}
