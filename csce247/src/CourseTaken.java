import EnumHandler.GradeEnum;

public class CourseTaken extends Course{

    private Term term;
    private GradeEnum grade;

    public CourseTaken(String name, int courseID, String numCredits, Term term, GradeEnum grade) {
        super(name, courseID, numCredits);
        this.term = term;
        this.grade = grade;
    }

    public CourseTaken(Course c, Term term, GradeEnum grade) {
        super(c.getName(), c.getCourseID(), c.getNumCredits());
        this.term = term;
        this.grade = grade;
    }

    public CourseTaken() {
        super();
        this.term = null;
        this.grade = null;
    }

    public Term getTerm() {
        return term;
    }

    public void setTerm(Term term) {
        this.term = term;
    }

    public GradeEnum getGrade() {
        return grade;
    }

    public void setGrade(GradeEnum grade) {
        this.grade = grade;
    }
}
