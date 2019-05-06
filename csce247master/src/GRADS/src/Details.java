package GRADS.src;

import java.util.ArrayList;
import java.util.List;

public class Details {
	/**
	* This will hold the students current gpa
	*/
	private double GPA;
	/**
	*  This is an array list of the taken courses for the given student
	*/
	private ArrayList<CourseTaken> coursesTaken;
	/**
	* This is a boolean to tell whether the student has passed or not
	*/
	private boolean passed;
	/**
	*  Constructor to set the attributes of the given details
	* @param GPA is the gpa of the given student
	* @param passed will hold the boolean passed value of the given student
	*/
	public Details(double GPA, boolean passed) {
		setGPA(GPA);
		setPassed(passed);
	}
	/**
	* Default constructor for details class
	*/
	public Details() {
		this.GPA = 0.0;
		this.passed = false;
		coursesTaken = new ArrayList<CourseTaken>();
	}
	/**
	* This gives the gpa of the given instance
	* @return the given students GPA
	*/
	public double getGPA() {
		return GPA;
	}
	/**
	* Method to set the gpa of the given instance
	* @param GPA is the gpa for the given student
	*/
	public void setGPA(double GPA) {
		if(GPA > 0.0 && GPA <= 4.0) {
			this.GPA = GPA;
		}
	}
	/**
	* Gives the boolean value of passed of the calling instance
	* @return the value of passed
	*/
	public boolean isPassed() {
		return passed;
	}
	/**
	* Sets the passed value of the given
	* @param passed is the value that is used for telling if its passed
	*/
	public void setPassed(boolean passed) {
		this.passed = passed;
	}
	/**
	* adds a taken course to the taken courses arraylist
	* @param takenCourse is a taken course of the given student
	*/
	public void addTakenCourse(CourseTaken takenCourse) {
		coursesTaken.add(takenCourse);
	}
	/**
	* this adds all taken courses to the courses taken List
	* @param takenCourses is a list of all the taken courses of the given student
	*/
	public void addTakenCourse(List<CourseTaken> takenCourses) {
		coursesTaken.addAll(takenCourses);
	}

	public void emptyList() {
        //IMPORTANT NOTE: If scaling this application and list size needs to grow rapidly, this could be a performance bottleneck.
        //Consider:
        //coursesTaken.clear();
        coursesTaken = new ArrayList<CourseTaken>();
    }
}
