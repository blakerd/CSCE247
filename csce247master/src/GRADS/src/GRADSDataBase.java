package GRADS.src;

import java.util.ArrayList;
import java.io.*;

public class GRADSDataBase {

	private ArrayList<StudentRecord> StudentRecList;
	private ArrayList<Course> CourseList;
	private ArrayList<User> UserList;
	public ArrayList<StudentRecord> getStudentRecList() {
		return StudentRecList;
	}
	public void setStudentRecList(ArrayList<StudentRecord> studentRecList) {
		StudentRecList = studentRecList;
	}
	public ArrayList<Course> getCourseList() {
		return CourseList;
	}
	public void setCourseList(ArrayList<Course> courseList) {
		CourseList = courseList;
	}
	public ArrayList<User> getUserList() {
		return UserList;
	}
	public void setUserList(ArrayList<User> userList) {
		UserList = userList;
	}
	public void fetchDB() {
		
	}
}
