package leaf;

import component.Employee;

//please ignore code duplication in the developer and manager class
public class Manager implements Employee {
	private String name;
	private long empId;
	private String position;
	

	public Manager(String name, long empId, String position) {
		this.name = name;
		this.empId = empId;
		this.position = position;
	}

	@Override
	public void showEmployeeDetails() {
		System.out.println("Employee Id: " + empId + " Name: " + name + " Position: " + position);
	}

}
