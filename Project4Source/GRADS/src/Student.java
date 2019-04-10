package GRADS.src;
import GRADS.src.GRADSResources.EnumHandler.*;

public class Student extends User {

    private int studentID;

    public Student(User u, int studentID) {
        super(u.getNetworkID(),u.getFirstName(),u.getLastName(),u.getRole(),u.getProgram());
        setStudentID(studentID);
    }

    public Student(String networkID, String firstName, String lastName, DeptMajorEnum major, int studentID) {
        super(networkID,firstName,lastName,UserEnum.STUDENT,major);
        setStudentID(studentID);
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        if(studentID > 0)
            this.studentID = studentID;
    }
}
