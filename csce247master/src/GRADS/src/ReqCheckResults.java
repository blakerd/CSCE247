package GRADS.src;

import java.util.ArrayList;
import java.util.List;

public class ReqCheckResults {

	private ArrayList<Check> results;

    public ReqCheckResults() {
        results = new ArrayList<Check>();
    }

    public void addTakenCourse(Check result) {
        results.add(result);
    }

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
