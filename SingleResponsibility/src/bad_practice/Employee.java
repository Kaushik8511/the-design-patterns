package bad_practice;

import java.util.Date;

// this class has two reasons to change
// 1) due to any change in the promotion logic
// 2) due to any change in the income tax calculation
public class Employee {
	private String id;
	private String name;
	private String address;
	private Date doj;
	
	
	//Not the responsibility of employee class
	//responsibility of HR
	public boolean isPromotionDueThisYear() {
		// promotion logic
		return false;
	}
	
	//Not the responsibility of employee class
	//responsibility of finance
	public double calcIncomeTaxForCurrentYear() {
		// income tax calculation
		return 3212.12;
	}
	
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
