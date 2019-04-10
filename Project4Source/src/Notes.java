package csce247.src;
import java.util.ArrayList;
import java.util.List;
public class Notes {

    private ArrayList<String> notes;

    public Notes(){
        notes = new ArrayList<String>();
    }

    public Notes(List<String> notes){
        this.notes.addAll(notes);
        //TODO: LOG TO SYSLOG
    }

    public void addNote(String note){
        this.notes.add(note);
        //TODO: LOG TO SYSLOG
    }

    public void addNotes(List<String> notes){
        this.notes.addAll(notes);
    }



    public void clearNotes(){
        //IMPORTANT NOTE: If scaling this application and list size needs to grow rapidly, this could be a performance bottleneck.
        //Consider:
        //notes.clear();
        this.notes = new ArrayList<String>();
    }

    public void removeNote(String note){
        for(int i = 0; i < notes.size(); i++){
            if(note.equalsIgnoreCase(notes.get(i))){
                notes.remove(i);
                break;
            }
        }
    }
}
