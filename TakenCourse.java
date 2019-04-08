public class TakenCourse extends Course{

  private Term term;
  private GradeEnum grade;

  public TakenCourse(){
    super();
    this.term = setTerm(new Term());
    this.grade = EnumHandler.GradeEnum.F;
  }

  public TakenCourse(String name, int courseID, String numCredits, Term term, GradeEnum grade){
    super(name, courseID, numCredits);
    this.term = setTerm(new Term());
    this.grade = grade;
  }

  public Term getTerm(){
    return this.term;
  }

  public GradeEnum getGrade(){
    return this.grade;
  }

  public void setTerm(Term term){
    if(term != null)
      this.term = term;
  }

  public void setGrade(GradeEnum grade){
    this.grade = grade;
  }
}
