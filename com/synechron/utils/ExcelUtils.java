package com.synechron.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtils {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		File f = new File("data//TestData.xls");
		FileInputStream fis = new FileInputStream(f);

		Workbook wb = WorkbookFactory.create(fis);

		System.out.println("Total sheets -" + wb.getNumberOfSheets());

		for (int i = 0; i < wb.getNumberOfSheets(); i++) {
			System.out.println(wb.getSheetName(i));
		}

		Sheet sh = wb.getSheet("createcustomer");
		for (int j = 0; j <= sh.getLastRowNum(); j++) {
			Row row = sh.getRow(j);
			Cell cell1 = row.getCell(0);
			Cell cell2 = row.getCell(1);
			System.out.println(cell1.getCellType());
			// System.out.println(cell1.getStringCellValue() + " | " +
			// cell2.getStringCellValue() );

		}

		fis.close();
	}

	public static String  getMyCellData(String sheet, int rownum, int column) {
		File f = null;
		FileInputStream fis = null;
		Workbook wb = null;
		String cellValue=null;
		Cell cell = null;
		try
		{
			f = new File("data//TestData.xls");
			fis = new FileInputStream(f);
			wb = WorkbookFactory.create(fis);
			cell = wb.getSheet("createcustomer").getRow(rownum).getCell(column);
			cellValue = cell.getStringCellValue();
		}
		catch(Exception ex)
		{
			System.out.println("exception while reading excel file..");
		}
		finally
		{
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return cellValue;
	}
}
