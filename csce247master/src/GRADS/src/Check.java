package GRADS.src;

public class Check {
	/**
	* The name of the class
	*/
	private String name;
	/**
	* The details object of the class
	*/
	private Details details;
	/**
	* The value for whether the class was passed or not
	*/
	private boolean passed;
	/**
	* Constructor that sets all the given parameters for Check
	* @param name is the name of the class
	* @param details holds the details of the given class
	* @param passed is a boolean value to represent whether the class was passed
	*/
	public Check(String name, Details details, boolean passed) {
		setName(name);
		setDetails(details);
		setPassed(passed);
	}
	/**
	* Default constructor for Check
	*/
	public Check() {
		this.name = "No Name";
		this.details = new Details();
		this.passed = false;
	}
	/**
	* Method that returns the name of the calling instance
	*/
	public String getName() {
		return name;
	}
	/**
	* Method that sets the name of the calling instance to name
	* @param name is the name of the given class
	*/
	public void setName(String name) {
        if (name != null && name.length() != 0)
            this.name = name;
    }
		/**
		* Method to return the details of the calling instance
		*/
	public Details getDetails() {
		return details;
	}
	/**
	* Method that sets the details of the given class to details
	* @param details is the details of the given class
	*/
	public void setDetails(Details details) {
		this.details = details;
	}
	/**
	* Method that returns the calling instances isPassed value
	*/
	public boolean isPassed() {
		return passed;
	}
	/**
	* Method that sets the passed variable for the calling instances
	* @param passed is the boolean value of whether or not the class was passed
	*/
	public void setPassed(boolean passed) {
		this.passed = passed;
	}

}
