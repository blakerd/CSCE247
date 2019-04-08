public class Course{

	private String name;
	private int courseID;
	private String numCredits;

	public Course(){
		name = setName("noNameYet");
		courseID = setCourseID(-1);
		numCredits = setNumCredits("-1");
	}

	public Course(String name, int courseID, String numCredits){
			this.name = setName(name);
			this.courseID = setCourseID(courseID);
			this.numCredits = setCredits(numCredits);
	}

	public String getName(){
		return this.name;
	}

	public int getCourseID(){
		return this.courseID;
	}

	public String numCredits(){
		return this.numCredits;
	}

	public void setName(String name){
		if(name != null)
			this.name = name;
	}

	public void setCourseID(int courseID){
		if(courseID != null)
			this.courseID = courseID;
	}

	public void setNumCredits(String numCredits){
		if(numCredits != null)
			this.numCredits = numCredits;
	}
}
