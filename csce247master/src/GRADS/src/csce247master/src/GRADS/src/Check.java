package GRADS.src;

public class Check {

	private String name;
	private Details details;
	private boolean passed;
	
	public Check(String name, Details details, boolean passed) {
		setName(name);
		setDetails(details);
		setPassed(passed);
	}
	
	public Check() {
		this.name = "No Name";
		this.details = new Details();
		this.passed = false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
        if (name != null && name.length() != 0)
            this.name = name;
    }

	public Details getDetails() {
		return details;
	}

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
