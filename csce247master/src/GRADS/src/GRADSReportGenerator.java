package GRADS.src;

public class GRADSReportGenerator {
	
	public StudentRecord generateSR(Student student, DeptMajorEnum major, TermBegan term, Advisor advisor, CoursesTakenList coursesTaken, Notes notes) {
		return StudentRecord(student, major, termBegan, advisor, coursesTaken, notes);
	}
	
	public ProgressSummary generatePS(Student student, DeptMajorEnum major, double gradPercent, double majorGPA, double overallGPA, TermBegan termBegan, Advisor advisor, ReqCheckResults reqChecklist) {
		return ProgressReport(Student, DeptMajorEnum, double, double, double, TermBegan, Advisor, ReqCheckResults); 
	}
	
	public Transcript generateTranscript(Notes notes, CoursesTakenList coursesTaken, Student student, DeptMajorEnum major, double gradPercent, double majorGPA, double overallGPA, TermBegan termBegan, Advisor advisor, ReqCheckResults reqChecklist) {
		return generateTranscript(notes, coursesTaken, student, major, gradPercent, majorGPA, overallGPA, termBegan, advisor, reqChecklist);
	}
	
	public void generateRequirements(DeptMajorEnum major) {
		
	}
	
}
