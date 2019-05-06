package GRADS.src;

import GRADS.src.GRADSResources.EnumHandler.GradeEnum;


public class CourseTaken extends Course {
  /**
  * Instantiation of the term class
  */
    private Term term;
    /**
    * Enumerator to resolve what grade was given
    */
    private GradeEnum grade;
    /**
  	* Constructor for CourseTaken that will set the values of the given instance
    * @param name is the name of the course
    * @param courseID is the ID number of the course
    * @param numCredits represents the number of credit hourse the course is worth
    * @param term represents the term that the class takes place in
    * @param grade represents the grade that was recieved in the class
  	*/
    public CourseTaken(Course c, Term term, GradeEnum grade) {
        super(c.getName(), c.getCourseID(), c.getNumCredits());
        setTerm(term);
        setGrade(grade);
    }
    /**
    * Defailt constructor for the course taken class
    */
    public CourseTaken() {
        super();
        this.term = new Term();
        this.grade = GradeEnum.DEFAULT;
    }
    /**
    * Returns the term for the given class
    * @return the term the class takes place in
    */
    public Term getTerm() {
        return term;
    }
    /**
    * Sets the term object for the given class
    * @param term is the term for the given class
    */
    public void setTerm(Term term) {
        if (term != null)
            this.term = term;
    }
    /**
    * Gives the grade attribute for the given class
    * @return the grade that was recieved
    */
    public GradeEnum getGrade() {
        return grade;
    }
    /**
    *  Sets the grade for the given class instance
    * @param grade is the grade that was recieved in the given class
    */
    public void setGrade(GradeEnum grade) {
        this.grade = grade;
    }
}
