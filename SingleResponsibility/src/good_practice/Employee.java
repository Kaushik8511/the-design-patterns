package good_practice;

import java.util.Date;

//Now it contains only attributes that are relevant
//single responsibility
// we dont have to update the employee class in case of any tax cal or promotion logic changes
public class Employee {
	private String id;
	private String name;
	private String address;
	private Date doj;
	

	//getters and setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}
	
	
	
}
