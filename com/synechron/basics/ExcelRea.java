package com.synechron.basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelRea {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		File f = new File("data//TestData.xls");
		FileInputStream fis = new FileInputStream(f);

		Workbook wb = WorkbookFactory.create(fis);

		Sheet sh = wb.getSheet("newsheet");
		for (int j = 0; j <= sh.getLastRowNum(); j++) {
			Row row = sh.getRow(j);
			Cell cell1=null;
			try
			{
				cell1 = row.getCell(0);
				System.out.println(cell1.getCellType());
			}catch(NullPointerException ex)
			{
				System.out.println("Row is blank");
			}
			
			// System.out.println(cell1.getStringCellValue() + " | " +
			// cell2.getStringCellValue() );
		
		}

		fis.close();
	}
}
