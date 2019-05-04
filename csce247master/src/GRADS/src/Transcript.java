package GRADS.src;

import GRADS.src.Notes;
import GRADS.src.CoursesTakenList;

public class Transcript extends ProgressSummary{
	
	private Notes notes = new Notes();
	private CoursesTakenList ctl = new CoursesTakenList();
	
	public Transcript(Notes newNotes, CoursesTakenList newCtl) {
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
