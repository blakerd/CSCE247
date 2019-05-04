package GRADS.src;

import GRADS.src.GRADSResources.EnumHandler.*;

public class StudentRecord {

    private Student student;
    private DeptMajorEnum major;
    private TermBegan termBegan;
    private Advisor advisor;
    private CoursesTakenList coursesTaken;
    private Notes notes;

    public StudentRecord(Student student, DeptMajorEnum major, TermBegan termBegan, Advisor advisor, CoursesTakenList coursesTaken, Notes notes) {
        this.student = student;
        this.major = major;
        this.termBegan = termBegan;
        this.advisor = advisor;
        this.coursesTaken = coursesTaken;
        this.notes = notes;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public DeptMajorEnum getMajor() {
        return major;
    }

    public void setMajor(DeptMajorEnum major) {
        this.major = major;
    }

    public TermBegan getTermBegan() {
        return termBegan;
    }

    public void setTermBegan(TermBegan termBegan) {
        this.termBegan = termBegan;
    }

    public Advisor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }

    public CoursesTakenList getCoursesTaken() {
        return coursesTaken;
    }

    public void setCoursesTaken(CoursesTakenList coursesTaken) {
        this.coursesTaken = coursesTaken;
    }

    public Notes getNotes() {
        return notes;
    }

    public void setNotes(Notes notes) {
        this.notes = notes;
    }

	@Override
	public String toString() {
		return "StudentRecord [student=" + student + ", major=" + major + ", termBegan=" + termBegan + ", advisor="
				+ advisor + ", coursesTaken=" + coursesTaken + ", notes=" + notes + "]";
	}
    
}
