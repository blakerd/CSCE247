package GRADS.src;

import GRADS.src.GRADSResources.EnumHandler.DeptMajorEnum;

public class ProgressSummary {

	private Student student;
	private DeptMajorEnum major;
	private double gradPercent;
	private double majorGPA;
	private double overallGPA;
	private TermBegan termBegan;
	private Advisor advisor;
	private ReqCheckResults reqChecklist;
	
	public ProgressSummary(Student student, DeptMajorEnum major, double gradPercent, double majorGPA, double overallGPA, TermBegan termBegan, Advisor advisor, ReqCheckResults reqChecklist) {
		this.setStudent(student);
		this.setMajor(major);
		this.setGradPercent(gradPercent);
		this.setMajorGPA(majorGPA);
		this.setOverallGPA(overallGPA);
		this.setTermBegan(termBegan);
		this.setAdvisor(advisor);
		this.setReqChecklist(reqChecklist);
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
	public double getGradPercent() {
		return gradPercent;
	}
	public void setGradPercent(double gradPercent) {
		this.gradPercent = gradPercent;
	}
	public double getMajorGPA() {
		return majorGPA;
	}
	public void setMajorGPA(double majorGPA) {
		this.majorGPA = majorGPA;
	}
	public double getOverallGPA() {
		return overallGPA;
	}
	public void setOverallGPA(double overallGPA) {
		this.overallGPA = overallGPA;
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
	public ReqCheckResults getReqChecklist() {
		return reqChecklist;
	}
	public void setReqChecklist(ReqCheckResults reqChecklist) {
		this.reqChecklist = reqChecklist;
	}
	
	public String toString() {
		return student.getStudentID() + " " + student.getFirstName() + " " + student.getLastName() + " " + major + " " + gradPercent + " " + majorGPA + " " + overallGPA + " " + termBegan.getYear() + " " + termBegan.getSemester() + " " + advisor.getFirstName() + " " + advisor.getLastName() + " " + reqChecklist.getResults();
    }
}
