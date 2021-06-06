package com.sgtesting.excelautomation;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EmployeeDetailsToNewFile {

	public static void main(String[] args) {
		ReadWriteContent();
	}
	static void ReadWriteContent()
	{
		FileInputStream fin=null;
		FileOutputStream fout=null;
		Workbook wb1=null;
		Workbook wb2=null;
		Sheet sh1=null;
		Sheet sh2=null;
		Row row1=null;
		Row row2=null;
		Cell cell1=null;
		Cell cell2=null;
		try
		{
			fin=new FileInputStream("D:\\UDDIN1\\Demo8.xlsx");
			wb1=new XSSFWorkbook(fin);
			wb2=new XSSFWorkbook();
			sh1=wb1.getSheet("Sheet1");
			sh2=wb2.getSheet("Sheet2");
			if(sh2==null)
			{
				sh2=wb2.createSheet("Sheet2");
			}

			int rc=sh1.getPhysicalNumberOfRows();
			for(int r=0;r<rc;r++)
			{
				row1=sh1.getRow(r);
				row2=sh2.getRow(r);
				if(row2==null)
				{
					row2=sh2.createRow(r);
				}

				int cc=row1.getPhysicalNumberOfCells();
				for(int c=0;c<cc;c++)
				{
					cell1=row1.getCell(c);
					cell2=row2.getCell(c);
					if(cell2==null)
					{
						cell2=row2.createCell(c);
					}
					String data=cell1.getStringCellValue();
					cell2.setCellValue(data);
					//System.out.printf(data,"%-12s");
				}
				fout=new FileOutputStream("D:\\UDDIN1\\Demo8copy.xlsx");
				wb2.write(fout);
			}
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
				wb2.close();
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}











}


