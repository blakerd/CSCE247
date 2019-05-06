package GRADS.src;

import GRADS.src.GRADSResources.BuildingFile;

public class Course {

    /*
     *
     */
    private String name;
    private String courseID;
    private String numCredits;
    
    /* @param name is the name of a class
     * @param courseID is the course ID 
     * @param
     */

    public Course(String name, String courseID, String numCredits) {
        setName(name);
        setCourseID(courseID);
        setNumCredits(numCredits);
    }


    public Course() {
        this.name = "noName";
        this.courseID = "NoCourseID";
        this.numCredits = "noCredits";
    }

    public Course(BuildingFile bf) {
         setName(bf.getData()[0]);
         setCourseID(bf.getData()[1]);
         setNumCredits(bf.getData()[2]);
    }

    public String getName() {
        return name;
    }

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
