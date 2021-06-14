package externalFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ExternalFiles {

	public static void main(String[] args) throws FileNotFoundException, IOException {//you can multipules throws exception in one ,just you have to use ","
	
		//properties: filename.properties;
		
		//Text: filename.txt;
		
		//java: filename.java;
		
		//html: filename.html;
		
		//xml:  filename.xml;
		
		int a = 10;
		System.out.println(a);
		
		String b ="bye";
		System.out.println(b);
		String path ="data\\test.properties";
		
	//how i get it form external files.its not part of my code.to do that we need a propertie class.we have to create propertie class to get propertie files,you have to create propertie object.
		
	Properties prop = new Properties();//first thing you have to have the propertie file then you have to able to read the file.so FileInputStream for read the file and FileOutputStream is for writing the propertie file
	//this object for the deal with the propertie file
	
	//FileInputStream fis =new FileInputStream("C:\\Users\\17089\\eclipse-workspace\\ClassNine\\data\\test.properties");//()you have to the file location here in the (),to get the location go to test.propertie and properties,copy the location of the file paste it here,
	
	FileInputStream fis =new FileInputStream(path);//IF THE FILE IS INSIDE THE PROJECT YOU DONT HAVE TO ABSULAT PATH.STATE FROM DATA.OUTSIDE OF PROJECT YOU DEFINITE HAVE TO PUT ABSULATE PATH.
	
	//"data\\test.properties"THIS IS CALLED RELATIVE PATH.THIS IS CALL RELATIONSHIPE WITH THE PROJECT.
	//this object for read the properte file.now we have to combind this two object.
	
	
	prop.load(fis);   //this line of code is combining the two object.making a conection between the two object and load the file after you get the file.//you have to write and import IOExcption.
	
	System.out.println(prop.getProperty("name"));
	System.out.println(prop.getProperty("course"));
	System.out.println(prop.getProperty("grade"));
	
	
	
	//now see the \\.after coping the location you have to make sure that the special charecter \\ is there,or you have to put the\\. now they will give the options to pick,you will see some exception form the dropdown.
   //throus always work with main method.
	//"C:\\Users\\17089\\eclipse-workspace\\ClassNine\\data\\test.properties")THIS IS CALL A ABSULATE PATH.THIS IS YOU DONT WNAT TO DO THIS ,JUST SIMPLY STATE WITH THE PROJECT NAME ,ABSULATE PATH IS STATING FROM THE DRIVE.
	
	
	
	}

}
