package GRADS.src;

import GRADS.src.GRADSResources.EnumHandler.*;

public class Advisor extends User {

    public Advisor(){
        super();
    }

    public Advisor(String networkID, String firstName, String lastName, DeptMajorEnum program){
        super(networkID,firstName,lastName,UserEnum.GRADUATE_PROGRAM_COORDINATOR,program);
    }

}
