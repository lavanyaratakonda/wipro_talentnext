package input_output_Streams;

import java.io.*;
import java.util.*;
public class FileCopier {


	    public static void main(String[] args) throws IOException {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the input file name");
	        String inputFile = sc.nextLine();
	        System.out.println("Enter the output file name");
	        String outputFile = sc.nextLine();
	        
	        try (FileInputStream in = new FileInputStream(inputFile);
	             FileOutputStream out = new FileOutputStream(outputFile);
	             BufferedInputStream bis = new BufferedInputStream(in);
	             BufferedOutputStream bos = new BufferedOutputStream(out)) {
	            
	            byte[] buffer = new byte[8192];
	            int bytesRead;
	            while ((bytesRead = bis.read(buffer)) != -1) {
	                bos.write(buffer, 0, bytesRead);
	            }
	            bos.flush();
	        }
	        System.out.println("File is copied.");
	    }}
	
