package GRADS.src;

public class Check {

	private String name;
	private Details details;
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

	public boolean isPassed() {
		return passed;
	}

	public void setPassed(boolean passed) {
		this.passed = passed;
	}

}
