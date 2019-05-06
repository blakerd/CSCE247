package GRADS.src;

import GRADS.src.GRADSResources.BuildingFile;

public class Course {
  /**
  * Holds the name of the course
  */
    private String name;
    /**
    * Holds the value of the course ID
    */
    private String courseID;
    /**
    * Holds the value of the number of credits the class is worth
    */
    private String numCredits;
    /**
  	* Constructor to set the name course id and credits for the given course
    * @param name is the name of the course
    * @param courseID is the ID number of the course
    * @param numCredits represents the number of credit hourse the course is worth
  	*/
    public Course(String name, String courseID, String numCredits) {
        setName(name);
        setCourseID(courseID);
        setNumCredits(numCredits);
    }
    /**
    * Default constructor for Course
    */
    public Course() {
        this.name = "noName";
        this.courseID = "NoCourseID";
        this.numCredits = "noCredits";
    }
    /**
    * Constructor that sets the build file of the data for each attribute
    * @param bf is the building file of the course
    */
    public Course(BuildingFile bf) {
         setName(bf.getData()[0]);
         setCourseID(bf.getData()[1]);
         setNumCredits(bf.getData()[2]);
    }
    /**
  	* Returns the name of the given course
  	*/
    public String getName() {
        return name;
    }
    /**
  	* Sets the name of the given course to name
    * @param name is the name of the course 
  	*/
    public void setName(String name) {
        if (name != null && name.length() != 0)
            this.name = name;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        if (courseID.length() > 0)
            this.courseID = courseID;
    }

    public String getNumCredits() {
        return numCredits;
    }

    public void setNumCredits(String numCredits) {
        if (numCredits != null && numCredits.length() > 0)
            this.numCredits = numCredits;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", courseID=" + courseID +
                ", numCredits='" + numCredits + '\'' +
                '}';
    }
}
