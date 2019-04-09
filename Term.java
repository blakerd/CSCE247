

import EnumHandler.EnumHandler.SemesterEnum;

public class Term {
	private SemesterEnum semester;
	private int year;
	public Term(SemesterEnum semester, int year) {
		setSemester(semester);
		setYear(year);
	}
	public Term() {
		this.year = 0;
	}
	public SemesterEnum getSemester() {
		return semester;
	}
	public void setSemester(SemesterEnum semester) {
		this.semester = semester;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if(year > 0)
			this.year = year;
	}
	
}
