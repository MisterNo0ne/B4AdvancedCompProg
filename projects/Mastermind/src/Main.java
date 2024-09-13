//import java.util.Scanner;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    
	
		
	public static void main(String[] args) {
		
		ArrayList<String> wordList = new ArrayList<String>();
        	Scanner inputScanner = new Scanner(System.in);
            
		//Input part of the program
		try {
		    
			File textFile = new File("input.txt");
			String randomWord;
			
			Scanner myReader = new Scanner(textFile);
			while (myReader.hasNextLine()) {
		        	String data = myReader.nextLine();
		        	wordList.add(data);
		      	}
			myReader.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("UGHH");
		}
		
		//Get random word from the wordlist
		Random rand = new Random();
		int randIndex = rand.nextInt(69);
		
		String randWord = wordList.get(randIndex);
		randWord = randWord.toUpperCase();
		
		//Wordle
		System.out.println("Welcome to wordle but with just 4 letters (I'm too lazy to find a good wordlist for 5 letters)\n");
		System.out.println("I got the word list from a scanner that reads another file, which is the IO for this project.\n");
		System.out.println("PLEASE NOTE: the yellow code is not functional, because I'm too lazy to code all that for a one-day thing.");
		System.out.println("\tSo, if the real word was \"task,\" \ninputting the word \"tart\" would give \"🟩 🟩 ⬛ 🟨 \".");
		System.out.println("...though really it should really be \"🟩 🟩 ⬛ ⬛ \"\n");
		System.out.println("Have fun!");
		
		
		while(true) {
		    String inputWord = inputScanner.nextLine();
		    
		    if (inputWord.length() == 4) {
    		    String colorList = determineColors(inputWord, randWord);
    		    String convertedList = "";
    		    
        	    for (int i=0; i<4; i++) {
        	        char gChar = colorList.charAt(i);
        	        switch (gChar) {
        	            case 'G':
        	                convertedList += "🟩 ";
        	                break;
        	            case 'Y':
        	                convertedList += "🟨 ";
        	                break;
        	            case 'B':
        	                convertedList += "⬛ ";
        	                break;
        	        }
        	    }
        	    
    		    System.out.println(convertedList);
    		    if (colorList.contains("GGGG")) {
    		        System.out.println("You win! :)");
    		        break;
    		    }
    		    System.out.println("");
    		    
    		    
		    } else {
		        System.out.println("Your entry has to be 4 characters you stinky head");
		    }
		    
		    
		    
		}
	}
	
	
	
	static String determineColors(String guess, String answer) {
	    guess = guess.toUpperCase();
	    String colorList = "";
	    
	    for (int i=0; i<4; i++) {
	        char gChar = guess.charAt(i);
	        
	        if (gChar == answer.charAt(i)) colorList += "G"; //green, success
	        else if (answer.indexOf(gChar) != -1) colorList += "Y"; //yellow, misplaced
	        else colorList += "B"; //black, failed
	    }
	    
	    return colorList;
	} 
}
