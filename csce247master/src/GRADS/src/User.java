package GRADS.src;

import GRADS.src.GRADSResources.BuildingFile;
import GRADS.src.GRADSResources.EnumHandler;
import GRADS.src.GRADSResources.EnumHandler.*;

public class User {
    /**
     * The ID number of the network in string form
     */
    private String networkID;
    /**
     * The name of the user's first name
     */
    private String firstName;
    /**
     * The name of the user's last name
     */
    private String lastName;
    /**
     * An Enum to clearify what level of permissions the user gets.
     */
    private UserEnum role;
    /**
     * The program or Department Major of the user
     */
    private DeptMajorEnum program;
    
    /**
     * Overides the toString() method to include this information.
     */
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
    
    /**
     * Constructor that sets all the given parameters for Check
     * @param networkID is the network id of the user
     * @param firstName is the first name of the user
     * @param lastName is the last name of the user
     * @param role is the role of the user, effecting the level of persmissions the user is given
     * @param program is the program or department major of the user
     */
    public User(String networkID, String firstName, String lastName, UserEnum role, DeptMajorEnum program) {
        setNetworkID(networkID);
        setFirstName(firstName);
        setLastName(lastName);
        setRole(role);
        setProgram(program);
    }
    /**
     * Defaults constructor for User
     */
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
