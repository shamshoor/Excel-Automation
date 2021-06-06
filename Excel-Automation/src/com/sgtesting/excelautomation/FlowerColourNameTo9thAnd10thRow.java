package com.sgtesting.excelautomation;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FlowerColourNameTo9thAnd10thRow {

	public static void main(String[] args) {
		ReadWriteContent();
	}
	static void ReadWriteContent()
	{
		FileInputStream fin=null;
		FileOutputStream fout=null;
		Workbook wb1=null;
		//Workbook wb2=null;
		Sheet sh1=null;
		Sheet sh2=null;
		Row row=null;
		Row row8=null;
		Row row9=null;
		Cell cell1=null;
		Cell cell2=null;
		try
		{
			fin=new FileInputStream("D:\\UDDIN1\\Demo6.xlsx");
			wb1=new XSSFWorkbook(fin);
			//wb1=new XSSFWorkbook();
			sh1=wb1.getSheet("Sheet1");
			sh2=wb1.getSheet("Sheet2");
			if(sh2==null)
			{
				sh2=wb1.createSheet("Sheet2");
			}

			int rc=sh1.getPhysicalNumberOfRows();
			row8=sh2.createRow(8);
			row9=sh2.createRow(9);
			for(int r=0;r<rc;r++)
			{
				row=sh1.getRow(r);
				
				cell1=row.getCell(0);
				//String data=cell1.getStringCellValue();
				//cell1.setCellValue(data);
				cell2=row8.createCell(0+r);
				cell2.setCellValue(cell1.getStringCellValue());
				
				cell1=row.getCell(1);
				//String data1=cell2.getStringCellValue();
				//cell2.setCellValue(data1);
				cell2=row9.createCell(0+r);
				cell2.setCellValue(cell1.getStringCellValue());
				

			}

			fout=new FileOutputStream("D:\\UDDIN1\\Demo6.xlsx");
			wb1.write(fout);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
				fout.close();
				wb1.close();

			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}













}


