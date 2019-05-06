package GRADS.src;

import GRADS.src.GRADSResources.EnumHandler.*;

public class Advisor extends User {
    /**
    */
    public Advisor(){
        super();
    }
    /**
    * This is a constructor that sets the given attributes of advisor.
    * @param networkID is the advisors network ID
    * @param firstName is the advisors first name
    * @param lastName is the advisors last name
    * @param program is the advisors department 
    */
    public Advisor(String networkID, String firstName, String lastName, DeptMajorEnum program){
        super(networkID,firstName,lastName,UserEnum.GRADUATE_PROGRAM_COORDINATOR,program);
    }

}
