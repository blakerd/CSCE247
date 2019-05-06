package GRADS.src;

import java.util.ArrayList;
import java.io.*;

public class GRADSDataBase {
	/**
	*  This holds a list of the students records
	*/
	private ArrayList<StudentRecord> StudentRecList;
	/**
	* This holds a list of courses
	*/
	private ArrayList<Course> CourseList;
	/**
	* This is the list of users in the database
	*/
	private ArrayList<User> UserList;
	/**
	* This gives the array list of the student records
	*@return the list of student records
	*/
	public ArrayList<StudentRecord> getStudentRecList() {
		return StudentRecList;
	}
	/**
	* This sets the array list equal to the new array list
	* @param studentRecList is the list of recuirements for the given student
	*/
	public void setStudentRecList(ArrayList<StudentRecord> studentRecList) {
		StudentRecList = studentRecList;
	}
	/**
	* This gives the course list of the given student
	* @return the list of courses in this database
	*/
	public ArrayList<Course> getCourseList() {
		return CourseList;
	}
	/**
	*  This sets the course list of the current instance
	* @param courseList is the list of courses going into the new database
	*/
	public void setCourseList(ArrayList<Course> courseList) {
		CourseList = courseList;
	}
	/**
	* This will give the user list of the database
	* @return the user list of the given data base
	*/
	public ArrayList<User> getUserList() {
		return UserList;
	}
	/**
	* This will set the user list for the given instance
	* @param userList is the user list to be passed into this function
	*/
	public void setUserList(ArrayList<User> userList) {
		UserList = userList;
	}
	public void fetchDB() {

	}
}
