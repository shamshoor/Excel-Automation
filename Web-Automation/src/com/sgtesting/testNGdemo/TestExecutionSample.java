package com.sgtesting.testNGdemo;
import java.io.FileInputStream;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestExecutionSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Workbook wb=null;
		FileInputStream fin=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try
		{
			fin=new FileInputStream("D:\\TestAutomation\\Automation\\Web-Automation\\TestData\\TestRunnerReflection.xlsx");
			wb=new XSSFWorkbook(fin);
			sh=wb.getSheet("Sheet7");
			if(sh==null) {
				sh=wb.createSheet("Sheet7");
			}
			int rc=sh.getPhysicalNumberOfRows();
			for(int r=1;r<rc;r++)
			{
				row=sh.getRow(r);
				cell=row.getCell(0);
				String MethodName=cell.getStringCellValue();
				cell=row.getCell(1);
				String PkgClassName=cell.getStringCellValue();
				
				Class classObj=Class.forName(PkgClassName);
				Object obj=classObj.newInstance();
				
				Method method=obj.getClass().getMethod(MethodName);
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


