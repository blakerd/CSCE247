package GRADS.src;

import java.util.ArrayList;
import java.util.List;

public class CoursesTakenList {
  /**
  * This is an array list that will hold all of the taken courses of the given student
  */
    private ArrayList<CourseTaken> coursesTaken;
    /**
    * Default constructor for courses taken list that declares a new arraylist
    */
    public CoursesTakenList() {
        coursesTaken = new ArrayList<CourseTaken>();
    }
    /**
  	* This is a method that adds one taken course to the coursesTaken list
    * @param takenCourse will represent a taken course of the student
  	*/
    public void addTakenCourse(CourseTaken takenCourse) {
        coursesTaken.add(takenCourse);
    }
    /**
    * This is a method that will add all of the taken courses of a given student to the taken courses list
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
    /**
  	* This is a method ised to concatenate all of the data of the courses taken list class
    * @return the concatenated string
  	*/
	@Override
	public String toString() {
		String returnString = "";
		for(CourseTaken a : coursesTaken)
			returnString+=a+" ";
		return "CoursesTakenList [coursesTaken=" + returnString + "]";
	}

}
