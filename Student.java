

import EnumHandler.EnumHandler.DeptMajorEnum;
import EnumHandler.EnumHandler.UserEnum;

public class Student extends User{
	private int studentID;
	public Student(String networkID, String firstName, String lastName, UserEnum role, DeptMajorEnum program, int studentID) {
		super(networkID, firstName, lastName, role, program);
		setStudentID(studentID);
	}
	public Student() {
		super();
		this.studentID = 0;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		if(studentID > 0)
			this.studentID = studentID;
	}
	@Override
	public String toString() {
		return super.toString()
				+ ", studentID=" + studentID;
	}
	
}
