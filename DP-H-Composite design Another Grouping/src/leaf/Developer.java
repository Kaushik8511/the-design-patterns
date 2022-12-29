package leaf;

import component.Employee;

public class Developer implements Employee {
	private String name;
	private long empId;
	private String position;
	

	public Developer(String name, long empId, String position) {
		this.name = name;
		this.empId = empId;
		this.position = position;
	}

	@Override
	public void showEmployeeDetails() {
		System.out.println("Employee Id: " + empId + " Name: " + name + " Position: " + position);
	}

}
