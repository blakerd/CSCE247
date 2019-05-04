package GRADS.src;

import GRADS.src.GRADSResources.BuildingFile;
import GRADS.src.GRADSResources.EnumHandler;
import GRADS.src.GRADSResources.EnumHandler.*;

public class User {

    private String networkID;
    private String firstName;
    private String lastName;
    private UserEnum role;
    private DeptMajorEnum program;

    @Override
    public String toString() {
        return "User{" +
                "networkID='" + networkID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", role=" + role +
                ", program=" + program +
                '}';
    }

    public User(String networkID, String firstName, String lastName, UserEnum role, DeptMajorEnum program) {
        setNetworkID(networkID);
        setFirstName(firstName);
        setLastName(lastName);
        setRole(role);
        setProgram(program);
    }

    public User(){

        setNetworkID("NoNetworkID");
        setFirstName("NoFirstName");
        setLastName("NoLastName");
        setRole(UserEnum.DEFAULT);
        setProgram(DeptMajorEnum.DEFAULT);
    }

    public User(BuildingFile user){

        setNetworkID(user.getData()[0]);
        setFirstName(user.getData()[1]);
        setLastName(user.getData()[2]);
        setRole(EnumHandler.convertToUserEnum(user.getData()[3]));
        setProgram(EnumHandler.convertToDeptMajorEnum(user.getData()[4]));

    }

    public String getNetworkID() {
        return networkID;
    }

    public void setNetworkID(String networkID) {
        if(networkID != null && networkID.length() > 0)
            this.networkID = networkID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(firstName != null && firstName.length() > 0)
            this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName != null && lastName.length() > 0)
            this.lastName = lastName;
    }

    public UserEnum getRole() {
        return role;
    }

    public void setRole(UserEnum role) {
        this.role = role;
    }

    public DeptMajorEnum getProgram() {
        return program;
    }

    public void setProgram(DeptMajorEnum program) {
        this.program = program;
    }
}
