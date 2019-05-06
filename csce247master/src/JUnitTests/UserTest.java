package JUnitTests;

import GRADS.src.User;
import GRADS.src.GRADSResources.EnumHandler;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserTest {

	User newUser;
	@BeforeEach
	void setUp() throws Exception {
		newUser = new User("jGay", "Jery", "Gay", EnumHandler.convertToUserEnum("GRADUATE_PROGRAM_COORDINATOR"),EnumHandler.convertToDeptMajorEnum("COMPUTER_SCIENCE"));
	}

	@AfterEach
	void tearDown() throws Exception {
		newUser = null;
	}

	@Test
	void User_ShouldPass_Test() {
		assertTrue((newUser.toString().equals("User{networkID=\'jGay\', firstName=\'Jery\', lastName=\'Gay\', role=GRADUATE_PROGRAM_COORDINATOR, program=COMPUTER_SCIENCE}")),
				"failure - should be True");
		//fail("Not yet implemented");
	}

	@Test
	void User_ShouldFail_Test() {
		assertFalse((newUser.toString().equals("WRoNG")),
				"failure - should be False");
		//fail("Not yet implemented");
	}
}
