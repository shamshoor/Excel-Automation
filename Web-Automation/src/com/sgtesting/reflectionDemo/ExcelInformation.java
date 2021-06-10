package com.sgtesting.reflectionDemo;
import java.io.FileInputStream;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Workbook wb=null;
		FileInputStream fin=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try
		{
			fin=new FileInputStream("F:\\ExampleAutomation\\Reflection-Automation\\TestData\\TestRunner.xlsx");
			wb=new XSSFWorkbook(fin);
			int rc=wb.getNumberOfSheets();
			
			for(int s=0;s<rc;s++)
			{
				String sheetName=wb.getSheetName(s);
				System.out.println(sheetName);
				
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			try
			{
				fin.close();
				wb.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}



	}

