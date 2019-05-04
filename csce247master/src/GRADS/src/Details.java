package GRADS.src;

import java.util.ArrayList;
import java.util.List;

public class Details {
	
	private double GPA;
	private ArrayList<CourseTaken> coursesTaken;
	private boolean passed;
	
	public Details(double GPA, boolean passed) {
		setGPA(GPA);
		setPassed(passed);
	}
	
	public Details() {
		this.GPA = 0.0;
		this.passed = false;
		coursesTaken = new ArrayList<CourseTaken>();
	}
	
	public double getGPA() {
		return GPA;
	}
	
	public void setGPA(double GPA) {
		if(GPA > 0.0 && GPA <= 4.0) {
			this.GPA = GPA;
		}
	}
	
	public boolean isPassed() {
		return passed;
	}

	public void setPassed(boolean passed) {
		this.passed = passed;
	}

	public void addTakenCourse(CourseTaken takenCourse) {
		coursesTaken.add(takenCourse);
	}
	
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
