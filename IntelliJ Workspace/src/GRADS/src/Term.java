package GRADS.src;

import GRADS.src.GRADSResources.EnumHandler.SemesterEnum;

public class Term {

    private SemesterEnum semester;
    private int year;

    public Term() {
        semester = SemesterEnum.DEFAULT;
    }

    public Term(SemesterEnum semester, int year) {
        setSemester(semester);
        setYear(year);
    }

    public SemesterEnum getSemester() {
        return semester;
    }

    public void setSemester(SemesterEnum semester) {
        if (semester != null)
            this.semester = semester;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 0)
            this.year = year;
    }
}
