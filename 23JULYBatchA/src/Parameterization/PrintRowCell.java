package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintRowCell {  // row data print
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("D:\\Selenium Parameter\\DemoParameterization.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		short cellsize = sh.getRow(0).getLastCellNum();
		
		System.out.println(cellsize);
		
		
		for(int i =0;i<cellsize;i++) {
			
			String data = sh.getRow(0).getCell(i).getStringCellValue();
			
			System.out.print(data+"  ");
			
		}
		
		
		
	}
	
	

}
