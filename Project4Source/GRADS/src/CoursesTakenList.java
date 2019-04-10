package GRADS.src;

import java.util.ArrayList;
import java.util.List;

public class CoursesTakenList {

    private ArrayList<CourseTaken> coursesTaken;

    public CoursesTakenList() {
        coursesTaken = new ArrayList<CourseTaken>();
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
