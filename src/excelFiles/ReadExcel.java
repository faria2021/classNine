package excelFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
	
		
		String path = "data\\RandomValues.xlsx";//relative file path
		//file
		File f = new File(path);
		
		//write the file
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = WorkbookFactory.create(fis);
		
		XSSFSheet sl = (XSSFSheet) wb.getSheetAt(0);
		
		//how many rows are there in the excle file.to that 
		
		sl.getPhysicalNumberOfRows();
		int rowCount = sl.getPhysicalNumberOfRows();
		
		
		Row r1 = sl.getRow(0);
		r1.getPhysicalNumberOfCells();
		int colCount =r1.getPhysicalNumberOfCells();
		
		
		//Cell cA= r1.getCell(0);
		
		Cell cA= r1.getCell(1);
		
		System.out.println(cA);
		
		System.out.println(rowCount);
		System.out.println(colCount);
		
		
		fis.close();
		

	}

	}


