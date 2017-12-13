/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


/**
 *
 * @author Owner
 */
public class JSONReader {
 public static void main(String[] args) {

        JSONParser parser = new JSONParser();

        try {

            Object obj = parser.parse(new FileReader("C:\\Users\\Owner\\Documents\\StudentInfo.txt"));

            JSONObject jsonObject = (JSONObject) obj;
            System.out.println(jsonObject);

            String name = (String) jsonObject.get("Name");
            System.out.println(name);

            int age = (int) jsonObject.get("Age");
            System.out.println(age);
            
            String birth = (String) jsonObject.get("Birth Date");
            System.out.println(birth);
            
            String place = (String) jsonObject.get("Birth Place");
            System.out.println(place);
            
            // loop array
            JSONArray msg = (JSONArray) jsonObject.get("Checks");
            Iterator<String> iterator = msg.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (org.json.simple.parser.ParseException ex) {
             Logger.getLogger(jsonObject.class.getName()).log(Level.SEVERE, null, ex);
         }

    }
}