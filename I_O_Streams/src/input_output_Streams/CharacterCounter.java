package input_output_Streams;
import java.io.*;
import java.util.*;
public class CharacterCounter {



	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the file name");
	        String fileName = sc.nextLine();
	        System.out.println("Enter the character to be counted");
	        char target;
	        try {
	            target = sc.nextLine().toLowerCase().charAt(0);
	        } catch (StringIndexOutOfBoundsException e) {
	            System.out.println("Error: No character entered");
	            return;
	        }

	        int count = 0;
	        try (FileReader fileReader = new FileReader(fileName);
	             BufferedReader reader = new BufferedReader(fileReader)) {
	            
	            char[] buffer = new char[8192];
	            int charsRead;
	            while ((charsRead = reader.read(buffer)) != -1) {
	                for (int i = 0; i < charsRead; i++) {
	                    if (Character.toLowerCase(buffer[i]) == target) {
	                        count++;
	                    }
	                }
	            }
	        } catch (FileNotFoundException e) {
	            System.out.println("Error: File '" + fileName + "' not found");
	            return;
	        } catch (IOException e) {
	            System.out.println("Error reading file: " + e.getMessage());
	            return;
	        }
	        System.out.println("File '" + fileName + "' has " + count + " instances of letter '" + target + "'.");
	    }
	}
