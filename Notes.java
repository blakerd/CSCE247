

import java.util.ArrayList;

public class Notes {
	private ArrayList<String> notes;
	public Notes() {
		notes = new ArrayList<String>();
	}
	public void addNote(String note) {
		notes.add(note);
	}
	public void removeLastNote() {
		notes.remove(notes.size()-1);
	}
	public String ToString() {
		return notes.toString();
	}
}
