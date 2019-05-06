package GRADS.src;

import java.util.concurrent.TimeUnit;

public class UserSession {

    private User user;
    private long timeAtInit;
    private boolean isValid;
    
    /**
     * The defauts constructor that sets the attributes of a user ession.
     */
    public UserSession(User user){
        this.user = user;
        timeAtInit = System.currentTimeMillis();
        isValid = true;
    }

    public boolean validate() {

        long elapsedTime = System.currentTimeMillis() - timeAtInit;
        System.out.println(TimeUnit.MINUTES.toMinutes(elapsedTime));
        if(TimeUnit.MINUTES.toMinutes(elapsedTime) >= 20){
            isValid = false;
        }

        return isValid;
    }

}
