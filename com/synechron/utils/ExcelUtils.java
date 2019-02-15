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
	public static int getRowCount(String sheetName)
	{
		File f = null;
		FileInputStream fis = null;
		Workbook wb = null;
		int rowCount=0;
		try
		{
			f = new File("data//TestData.xls");
			fis = new FileInputStream(f);
			wb = WorkbookFactory.create(fis);
			rowCount = wb.getSheet(sheetName).getLastRowNum()+1;
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
		
		return rowCount;
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
