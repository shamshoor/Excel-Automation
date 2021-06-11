package com.sgtesting.reflectionDemo;
import java.io.FileInputStream;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestExecutionDemo {

	public static void main(String[] args) {
		
		Workbook wb=null;
		FileInputStream fin=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try
		{
			fin=new FileInputStream("F:\\ExampleAutomation\\Reflection-Automation\\TestData\\TestRunner.xlsx");
			wb=new XSSFWorkbook(fin);
			sh=wb.getSheet("Sheet1");
			if(sh==null) {
				sh=wb.createSheet("Sheet1");
			}
			int rc=sh.getPhysicalNumberOfRows();
			for(int r=1;r<rc;r++)
			{
				row=sh.getRow(r);
				cell=row.getCell(0);
				String methodName=cell.getStringCellValue();
				cell=row.getCell(1);
				String pkgClassName=cell.getStringCellValue();

				Class classObj=Class.forName(pkgClassName);
				Object obj=classObj.newInstance();

				Method method=obj.getClass().getMethod(methodName);
				method.invoke(obj);
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
