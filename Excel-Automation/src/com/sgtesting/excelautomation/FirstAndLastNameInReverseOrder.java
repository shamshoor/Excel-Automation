package com.sgtesting.excelautomation;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FirstAndLastNameInReverseOrder {

	public static void main(String[] args) {
		ReadWriteContent();
	}

	static void ReadWriteContent()
	{
		FileInputStream fin=null;
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh1=null;
		Sheet sh2=null;
		Row row1=null;
		Row row2=null;
		Cell cell1=null;
		Cell cell2=null;
		try
		{
			fin=new FileInputStream("D:\\UDDIN1\\Demo7.xlsx");
			wb=new XSSFWorkbook(fin);
			sh1=wb.getSheet("Sheet1");
			sh2=wb.getSheet("Sheet2");
			if(sh2==null)
			{
				sh2=wb.createSheet("Sheet2");
			}
			int rc=sh1.getPhysicalNumberOfRows();
			int k=0;
			for(int i=rc-1;i>=0;i--)
			{

				row1=sh1.getRow(i);
				row2=sh2.getRow(k);
				if(row2==null)
				{
					row2=sh2.createRow(k);
				}
				k++;
				int cc=row1.getPhysicalNumberOfCells();

				for(int c=0;c<cc;c++)
				{	

					cell1=row1.getCell(c);
					cell2=row2.getCell(c);
					if (cell2==null)
					{
						cell2= row2.createCell(c);
					}
					String data=cell1.getStringCellValue();
					cell2.setCellValue(data);


				}
				fout=new FileOutputStream("D:\\UDDIN1\\Demo7.xlsx");
				wb.write(fout);
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
				wb.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}








}



