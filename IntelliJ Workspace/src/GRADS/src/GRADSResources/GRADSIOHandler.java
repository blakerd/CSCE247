package GRADS.src.GRADSResources;

import GRADS.src.GRADSResources.EnumHandler;

import GRADS.src.User;
import GRADS.src.Course;
import GRADS.src.StudentRecord;

import com.google.gson.*;



import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.io.StringReader;


import java.util.ArrayList;


public class GRADSIOHandler  {

    private final String IO_ADDRESS = "src/GRADS/data/users.txt";
    private Gson gson;

    public GRADSIOHandler(){
        gson = new Gson();
    }

    public void loadUsers(){
        String file = "{\n" +
                "        \"networkId\": \"mhunt\",\n" +
                "        \"firstName\": \"Michelle\",\n" +
                "        \"lastName\": \"Hunt\",\n" +
                "        \"role\": \"STUDENT\",\n" +
                "        \"program\": \"COMPUTER_INFORMATION_SYSTEMS\"\n" +
                "    }";



        System.out.println("json file:" + file);

        int count = 0;
        ArrayList<String> networkIDs = new ArrayList<String>();
        ArrayList<String> firstNames = new ArrayList<String>();
        ArrayList<String> lastNames = new ArrayList<String>();
        ArrayList<String> roles = new ArrayList<String>();
        ArrayList<String> programs = new ArrayList<String>();

        ArrayList<ArrayList<String>> attributes = new ArrayList<ArrayList<String>>();


        attributes.add(networkIDs);
        attributes.add(firstNames);
        attributes.add(lastNames);
        attributes.add(roles);
        attributes.add(programs);



        String json = file;
        JsonParser parser = new JsonParser();
        Object jsonElement =  parser.parse(new StringReader(json));
        Set<Entry<String, JsonElement>> ens = ((JsonObject) jsonElement).entrySet();


        for (Entry<String, JsonElement> en : ens) {

            String trimmedField = en.getValue().toString().replaceAll("\"", "");
            attributes.get(count).add(trimmedField);
            count++;
            if(count%5==0)
                count=0;
        }


        
        makeUsers(attributes);

    }

    private void makeUsers(ArrayList<ArrayList<String>> attributes) {
    }


}
