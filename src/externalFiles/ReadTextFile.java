package externalFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadTextFile {

	public static void main(String[] args) throws IOException {
		String path ="data\\textFile.txt";//Relative File Path
		
		//File
		File f = new File(path);//path mean location of the file you save ,i couldnot save it but ap save it as textFile.txt.this how you read a textFile.
		
		//read the file
		FileReader fr = new FileReader(f);
		
		//BufferedReader to read characters
		BufferedReader bfr = new BufferedReader(fr);//FileReader and BufferedReader are classes to read the textfile from the data folder.
		
		System.out.println(bfr.readLine());//what ever the first line it will read it.
		
		System.out.println(bfr.readLine());//this will print the second line of the textfile.
		
		//to know how many lines in the textFile you have to do while loop
		
		List<String> textLine = new ArrayList<String>();
		
		String line = null;
		
		//while(there are lines) {
			//i want to keep reading one by one.
		
		while((line= bfr.readLine()) !=null) {
			
			//System.out.println(line);
			
			textLine.add(line);
			
		}
		System.out.println(textLine.size());
		//System.out.println(textLine.get(o));
	}
}

