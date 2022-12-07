package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Stringvalue {
	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("D:\\Selenium Parameter\\DemoParameterization.xlsx");
		
		XSSFWorkbook a= new XSSFWorkbook();
		
		 int data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getLastCellNum();
		
		System.out.println(data);
	}

}
