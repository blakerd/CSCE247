package GRADS.src;

import java.util.ArrayList;
import java.util.List;

public class Notes {
  /**
  *  This will be a list to hold all the notes for a given student
  */
    private ArrayList<String> notes;
    /**
    * The default constructor for notes that initializes a new arraylist
    */
    public Notes() {
        notes = new ArrayList<String>();
    }
    /**
    * Notes constructor that will set the list
    * @param notes is a list with the notes for a given student
    */
    public Notes(List<String> notes) {
        this.notes.addAll(notes);
        //TODO: LOG TO SYSLOG
    }
    /**
    * This will allow a note to be added to the notes list
    * @param note is a note to be added to the notes list
    */
    public void addNote(String note) {
        this.notes.add(note);
        //TODO: LOG TO SYSLOG
    }
    /**
    * This will allow all notes for a given student to be added to the notes list
    * @param notes is a list with all the given students notes
    */
    public void addNotes(List<String> notes) {
        this.notes.addAll(notes);
    }


    public void clearNotes() {
        //IMPORTANT NOTE: If scaling this application and list size needs to grow rapidly, this could be a performance bottleneck.
        //Consider:
        //notes.clear();
        this.notes = new ArrayList<String>();
    }
    /**
    * This will allow the removal of notes from the notes list
    * @param note is the note to be removed
    */
    public void removeNote(String note) {
        for (int i = 0; i < notes.size(); i++) {
            if (note.equalsIgnoreCase(notes.get(i))) {
                notes.remove(i);
                break;
            }
        }
    }
    /**
  	* This is a method ised to concatenate all of the data of the courses taken list class
    * @return the concatenated string
  	*/
    public String toString() {
    	String returnSt = "";
    	for(String a : notes) {
    		returnSt += a + " ";
    	}
    	return returnSt;
    }
}
