package com.sgtesting.excelautomationGit;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CityNamesTo5thColumn {

	public static void main(String[] args) {
		writeContent();
	}
	static void writeContent()
	{
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try 
		{
			wb=new XSSFWorkbook();
			sh=wb.createSheet("city");
			
			for(int i=0;i<20;i++)
			{
				row=sh.createRow(i);
				cell=row.createCell(4);
				cell.setCellValue("city"+(i+1));
			}
			fout=new FileOutputStream("D:\\UDDIN1\\Demo4.xlsx");
			wb.write(fout);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fout.close();
				wb.close();
				sh=null;
				row=null;
				cell=null;
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}






}


