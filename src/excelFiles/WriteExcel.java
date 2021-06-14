package excelFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws IOException {
	
		
	//	.doc(HSSF)WORKS WITH THIS VIRSON OF APACH POI//.docx(XSSF WORKS WITH .docx)//.xls//.xlsx this are the latest version.thats why apache poi has to change.
	//SO THERE IS TWO API ONE IS HSSF AND OTHER ONE IS XSS	
		//now XSSF CAN WORK WITH .doc and .docx,but HSSF CAN DEAL WITH ONLY .doc.
		
		XSSFWorkbook wb = new  XSSFWorkbook();
		//XSSFSheet sl = wb.createSheet("FOOD");
		XSSFSheet sl = wb.createSheet("RandomNumber");
		//XSSFSheet s2 = wb.createSheet("drinks");
		
//		Row r1 = sl.createRow(0);
//		Row r2 = sl.createRow(1);
//		Cell cA = r2.createCell(0);
//		
//		cA.setCellValue("taco");
//		
		
		
		
		//Row r1 = sl.createRow(0);
	//	Row r2 = sl.createRow(1);
	//	Cell cA = r2.createCell(0);
	 //cA.setCellValue("taco");
		
		
		sl.createRow(0).createCell(0).setCellValue("no");
	//	sl.createRow(0).createCell(1).setCellValue("Random");
		
		sl.getRow(0).createCell(1).setCellValue("Random");
		
		
//		sl.createRow(1).createCell(0).setCellValue("1");
//		sl.createRow(1).createCell(0).setCellValue("464");
//		
//		sl.createRow(2).createCell(0).setCellValue("2");
//		sl.createRow(2).createCell(1).setCellValue("546");
//		
//		sl.createRow(3).createCell(0).setCellValue("3");
//		sl.createRow(2).createCell(1).setCellValue("546");
		
		for(int i=1;i<=500;i++) {
			sl.createRow(i).createCell(0).setCellValue("i");
			sl.getRow(i).createCell(1).setCellValue("getRandomNumberInRange(100, 999)");
			
		}
		
		
		//String path = "data\\myExcelData.xlsx";//relative file path
		
		String path = "data\\RandomValues.xlsx";//relative file path
		//file
		File f = new File(path);
		
		//write the file
		FileOutputStream fos = new FileOutputStream(f);
		
		wb.write(fos);
		fos.close();

	}

	public static int getRandomNumberInRange(int min, int max) {
		if(min >=max) {
			throw new IllegalArgumentException("max must be gteater than min");
			
		}
//		Random r new Random();
//		return r.nextInt(max-min) +1) + min;
//	}
		return max;

}
}