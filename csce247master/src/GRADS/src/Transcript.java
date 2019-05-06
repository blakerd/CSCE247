package GRADS.src;

import GRADS.src.Notes;
import GRADS.src.CoursesTakenList;
import GRADS.src.GRADSResources.EnumHandler.DeptMajorEnum;

public class Transcript extends ProgressSummary{
	
	private Notes notes = new Notes();
	private CoursesTakenList ctl = new CoursesTakenList();
	
	public Transcript(Notes newNotes, CoursesTakenList newCtl, Student student, DeptMajorEnum major, double gradPercent, double majorGPA, double overallGPA, TermBegan termBegan, Advisor advisor, ReqCheckResults reqChecklist) {
		super(student, major, gradPercent, majorGPA, overallGPA, termBegan, advisor, reqChecklist);
		this.setCtl(newCtl);
		this.setNotes(newNotes);
	}
	public Notes getNotes() {
		return notes;
	}

	public void setNotes(Notes notes) {
		if(notes != null)
			this.notes = notes;
	}

	public CoursesTakenList getCtl() {
		return ctl;
	}

	public void setCtl(CoursesTakenList ctl) {
		if(ctl != null)
			this.ctl = ctl;
	}

	@Override
	public String toString() {
		return "Transcript [notes=" + notes + ", ctl=" + ctl + "]";
	}
	
}
