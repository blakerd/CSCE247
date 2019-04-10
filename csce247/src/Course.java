package csce247.src;

public class Course {

    private String name;
    private int courseID;
    private String numCredits;

    public Course(String name, int courseID, String numCredits) {
       setName(name);
       setCourseID(courseID);
       setNumCredits(numCredits);
    }

    public Course(){
        this.name = "noName";
        this.courseID = -1;
        this.numCredits = "noCredits";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && name.length() != 0)
            this.name = name;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        if(courseID > 0)
            this.courseID = courseID;
    }

    public String getNumCredits() {
        return numCredits;
    }

    public void setNumCredits(String numCredits) {
        if(numCredits != null && numCredits.length() > 0)
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
