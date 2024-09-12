//import java.util.Scanner;
import java.io.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		
		
		try {
			File textFile = new File("input.txt");
			String randomWord;
			
			Scanner myReader = new Scanner(textFile);
			while (myReader.hasNextLine()) {
	        	String data = myReader.nextLine();
	        	System.out.println(data);
	      	}
			myReader.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("UGHH");
		}
		
		
		
		
		
//		System.out.println("Hello world!");
		
		
		
		/*
		File myObj = new File("filename.txt");
      	Scanner myReader = new Scanner(myObj);
      	
      	myReader.close();   */
	}
}
