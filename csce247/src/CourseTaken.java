package csce247.src;
import csce247.src.GRADSResources.EnumHandler.GradeEnum;



public class CourseTaken extends Course{

    private Term term;
    private GradeEnum grade;

    public CourseTaken(String name, int courseID, String numCredits, Term term, GradeEnum grade) {
        super(name, courseID, numCredits);
        setTerm(term);
        setGrade(grade);
    }

    public CourseTaken(Course c, Term term, GradeEnum grade) {
        super(c.getName(), c.getCourseID(), c.getNumCredits());
        setTerm(term);
        setGrade(grade);
    }

    public CourseTaken() {
        super();
        this.term = new Term();
        this.grade = GradeEnum.DEFAULT;
    }

    public Term getTerm() {
        return term;
    }

    public void setTerm(Term term) {
        if(term != null)
            this.term = term;
    }

    public GradeEnum getGrade() {
        return grade;
    }

    public void setGrade(GradeEnum grade) {
        this.grade = grade;
    }
}
