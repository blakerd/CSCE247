

import EnumHandler.EnumHandler.DeptMajorEnum;
import EnumHandler.EnumHandler.UserEnum;

public class Advisor extends User{
	public Advisor(String networkID, String firstName, String lastName, UserEnum role, DeptMajorEnum program) {
		super(networkID, firstName, lastName, role, program);
	}
	public Advisor() {
		super();
	}
}
