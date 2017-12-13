/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.parser.JSONParser;

public class JSON {

	 public static void main(String[] args) {
             //Ask for student name
             Scanner input = new Scanner(System.in);
             System.out.print("Enter Student name: ");
             String name = input.nextLine();
             //Ask for student age
             Scanner ageInput = new Scanner(System.in);
             System.out.print("Enter Student age: ");
             int age = ageInput.nextInt();
             //Ask for student birth date
             Scanner birthInput = new Scanner(System.in);
             System.out.print("Enter Student birth date: ");
             String birth = birthInput.nextLine();
             //Ask for birth place
             Scanner placeInput = new Scanner(System.in);
             System.out.print("Enter Student birth place: ");
             String place = placeInput.nextLine();
             //Create the object for student...
        JSONObject obj = new JSONObject();
        obj.put("Name", name);
        obj.put("Age", ageInput);
        obj.put("Birth Date", birth);
        obj.put("Birth Place", place);
        
        //Create the list for checks questions (y/n)
        JSONArray list = new JSONArray();
        
        //Ask for nationality check
        Scanner nationInput = new Scanner(System.in);
        System.out.println("Haitian (Y/N):");
        String nation = nationInput.nextLine();
        //Ask for vaccination check
        Scanner vaccinationInput = new Scanner(System.in);
        System.out.println("Vaccinated (Y/N):");
        String vaccin = vaccinationInput.nextLine();
        //Create object for the two checks inside question object
        JSONObject question = new JSONObject();
        question.put("Haitian", nation);
        question.put("Vaccinated", vaccin);
        //Add question to the list
        list.add(question);
        
        obj.put("Checks", list);
        
        //Create the txt file
        File file = new File("C:\\Users\\Owner\\Documents\\StudentInfo.txt");
		
		try (PrintWriter writer = new PrintWriter(file)){
			writer.print(obj.toJSONString());
		} catch (FileNotFoundException ex) {
			System.out.println(ex.toString());
		}
		
		System.out.println("File created successfully\n\n Press enter to continue.");
		input.nextLine();
    
    }

    }


