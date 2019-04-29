package GRADS.src.GRADSResources;

import GRADS.src.GRADSResources.EnumHandler;

import GRADS.src.User;
import GRADS.src.Course;
import GRADS.src.StudentRecord;

import com.google.gson.*;


import java.io.File;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.io.StringReader;


import java.util.ArrayList;


public class GRADSIOHandler  {

    private final String USER_IO_ADDRESS = "src/GRADS/data/users.txt";
    private final String COURSE_IO_ADDRESS = "src/GRADS/data/courses.txt";
    private Gson gson;

    public GRADSIOHandler(){
        gson = new Gson();
    }



    public ArrayList<User> loadUsers(){
        ArrayList<User> users = new ArrayList<User>();
        ArrayList<String[]> StringUsers = readExternalDB("User");
        ArrayList<BuildingFile> tempObjs = makeObjects(StringUsers);
        for (BuildingFile bf : tempObjs){
             users.add(new User(bf));
        }

        return users;
    }

    public ArrayList<Course> loadCourses(){
        ArrayList<Course> courses = new ArrayList<Course>();
        ArrayList<String[]> StringCourses = readExternalDB("Course");
        ArrayList<BuildingFile> tempObjs = makeObjects(StringCourses);
        for (BuildingFile bf : tempObjs){
            courses.add(new Course(bf));
        }

        return courses;
    }

    private ArrayList<String[]> readExternalDB(String Choice) {
        String fileContents = "";
        String fileName = "";
        switch(Choice){
            case "User":
                fileName = USER_IO_ADDRESS;
                break;
            case "Course":
                fileName = COURSE_IO_ADDRESS;
                break;
        }

        try {

            Scanner fileScanner = new Scanner(new File(fileName));
            while (fileScanner.hasNext()) {
                fileContents += fileScanner.nextLine();
                fileContents += "\n";
            }
        }catch(Exception e){

        }

        String json = fileContents;
        JsonParser parser = new JsonParser();
        JsonArray jsonRoot =  parser.parse(json).getAsJsonArray();

        ArrayList<String> fields = new ArrayList<String>();
        ArrayList<String> data = new ArrayList<String>();

        for(JsonElement obj : jsonRoot) {
            JsonObject tempObj = obj.getAsJsonObject();
            Set<Entry<String, JsonElement>> attributeEntries = tempObj.entrySet();
            for (Entry<String, JsonElement> entry : attributeEntries) {
                if(!(fields.contains(entry.getKey())))
                    fields.add(entry.getKey());
                data.add(entry.getValue().toString().replace("\"",""));
            }
        }

        ArrayList objs = new ArrayList();

        int numberOfObjects = data.size()/fields.size();

        String[] stringObject = new String[fields.size()];

        for(int i = 0; i < data.size(); i++){
            stringObject[i%fields.size()] = data.get(i);
            if(i%fields.size()==0 && i != 0) {
                objs.add(stringObject);
                stringObject = new String[fields.size()];
            }
        }

        return objs;

    }


    public static ArrayList makeObjects(ArrayList<String[]> strArrObjs) {

        ArrayList<BuildingFile> halffinishedobjects = new ArrayList<BuildingFile>();

        for(String[] obj : strArrObjs){

            halffinishedobjects.add(new BuildingFile<String[]>(obj));

        }

        return halffinishedobjects;
    }


}
