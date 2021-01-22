package lab_assignment_4;

import java.io.Serializable;

public class Address implements Serializable{
	
	private String address;

	public Address(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}	
	
}
