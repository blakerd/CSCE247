package csce247;

import EnumHandler.UserEnum;
import EnumbHandler.DeptMajorEnum;

public class User {
	private String networkID;
	private String firstName;
	private String lastName;
	private EnumHandler.UserEnum role;
	private EnumbHandler.DeptMajorEnum program;
	public User(String networkID, String firstName, String lastName, UserEnum role, DeptMajorEnum program) {
		setNetworkID(networkID);
		setFirstName(firstName);
		setLastName(lastName);
		setRole(role);
		setProgram(program);
	}
	public String getNetworkID() {
		return networkID;
	}
	public void setNetworkID(String networkID) {
		if(networkID != null && networkID.length() > 0)
			this.networkID = networkID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		if(firstName != null && firstName.length() > 0)
			this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		if(lastName != null && lastName.length() > 0)
			this.lastName = lastName;
	}
	public EnumHandler.UserEnum getRole() {
		return role;
	}
	public void setRole(EnumHandler.UserEnum role) {
		this.role = role;
	}
	public EnumbHandler.DeptMajorEnum getProgram() {
		return program;
	}
	public void setProgram(EnumbHandler.DeptMajorEnum program) {
		this.program = program;
	}
	
	@Override
	public String toString() {
		return "User [networkID=" + networkID + ", firstName=" 
				+firstName + ", lastName=" + lastName 
				+ ", role=" + role.toString() 
				+ ", program" + program.toString() + "]";
	}
}
