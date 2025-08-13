package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException,IOException {
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);	
		//get the control of the sheet
		Sheet s = wb.getSheet("InvalidLogin");
		//get the control of the row
		Row r = s.getRow(1);
		//get the control of the cell
		Cell c = r.getCell(0);
		//get the string value from the cell
		String data = c.getStringCellValue();
		System.out.println(data);	
	}
}



