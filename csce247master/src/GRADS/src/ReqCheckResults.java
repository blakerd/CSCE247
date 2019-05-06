package GRADS.src;

import java.util.ArrayList;
import java.util.List;

public class ReqCheckResults {
	/**
	*	This will hold an array list to hold all the results
	*/
	private ArrayList<Check> results;
	/**
	*	This is the default constructor for reqcheckresults that will make a new array list
	* @return the results of the checks
	*/
    public ReqCheckResults() {
        results = new ArrayList<Check>();
    }

    public ArrayList<Check> getResults() {
		return results;
	}
	/**
	*	This sets the value of the results
	* @param results is the list of check that will be passed in
	*/
	public void setResults(ArrayList<Check> results) {
		this.results = results;
	}
	/**
	* This will allow a check to be added to the results list
	* @param result is a result to be added to the notes list
	*/
	public void addTakenCourse(Check result) {
        results.add(result);
    }
		/**
		* This will allow all checks to be added to the results list
		* @param results is a list of results for the given student
		*/
    public void addTakenCourse(List<Check> results) {
        results.addAll(results);
    }

    public void emptyList() {
        //IMPORTANT NOTE: If scaling this application and list size needs to grow rapidly, this could be a performance bottleneck.
        //Consider:
        //coursesTaken.clear();
        results = new ArrayList<Check>();
    }
}
