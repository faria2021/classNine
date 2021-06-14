package externalFiles;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class WriteHTML {

	public static void main(String[] args) throws IOException{
		

		SimpleDateFormat formatter =new SimpleDateFormat("mm_dd_yyyy_HH_MM_ss");
		Date date = new Date();
		
		formatter.format(date);
		
		String StartTime =formatter.format(date);
		
		System.out.println(StartTime);
		
		//String path="data\\myNewFile11.html";
		
		String path ="data\\myNewFile" + StartTime + ".html";
		
		//File
		File f =new File(path);
		
		//write the file 
		FileWriter fw = new FileWriter(f, true);//f, true make appendable file,to not over write a file,if you dont want to overwrite a file,you simple has to just put FileWriter f,true.
		                                        //to easy way to just f,true no more over write,it will make appendable file.
		//buffered write to write characters
		BufferedWriter bfw = new BufferedWriter(fw);
		
		bfw.write("<html><head><title>MyFirstWebsite</title></head><body bgcolor=\"sykblue\"><h1>Hello World!</h1><p>");
		
		bfw.write(getRandomNumberInRange( 100, 999));
		
		bfw.write("</P></body></html>");
	   bfw.newLine();
		
		bfw.close();

	}
	 public static int getRandomNumberInRange(int min, int max) {
    	 if (min>=max) {
    		 throw new IllegalArgumentException("maz must be greater than min");
    	 }
    	 Random r = new Random();
    	 return r.nextInt((max - min) + 1) + min;
    	 

}
	}



