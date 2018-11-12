package com.jsontutorials;

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.FileWriter;
import java.io.IOException;

    public class WriteJSON {

        public static void main(String[] args) {

            JSONObject j = new JSONObject();
            j.put("name","alex");
            j.put("age",18);
            JSONArray prevjobs = new JSONArray();
            prevjobs.put("student");
            prevjobs.put("TA");
            prevjobs.put("cook");
            j.put("previous jobs",prevjobs);

            String fileName = "alexprofile.json";
            try(FileWriter file = new FileWriter(fileName)){

                file.write(j.toString());

            }catch(IOException e){
                e.printStackTrace();
            }

        }
}
