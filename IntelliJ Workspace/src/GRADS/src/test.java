package GRADS.src;

import GRADS.src.GRADSResources.EnumHandler;
import GRADS.src.GRADSResources.GRADSIOHandler;

public class test {

    public static void main(String[] args) {

        System.out.println(EnumHandler.convertToGradeEnum('a'));
        User test = new User();
        UserSession us = new UserSession(test);
        try{us.validate();}catch(Exception e){

        }
        GRADSIOHandler gioh = new GRADSIOHandler();
        gioh.loadUsers();
    }
}
