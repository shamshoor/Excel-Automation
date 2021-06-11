package com.sgtesting.log4jDemo;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class Assign2 extends Preconditions {
	public static Logger log=Logger.getLogger("assignment2 o/p");
	//public static WebDriver obrowser=null;
	@Test(priority=1)
	static void runPreconditions()
	{
		Preconditions.launchBrowserandNavigate();
		Preconditions.loginAdmin();
		Preconditions.minimizeFlyOutWindow();
		try
		{
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=2)
	static void createUser()
	{

		try
		{
			log.info("creating the user");
			obrowser.findElement(By.xpath("//td[@class='navItem navCell relative notSelected']//a[@class='content users']")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//div[@class='buttonText']")).click();
			Thread.sleep(2000);
			log.info("assigning FN,LN,email,username,pwd,pwdCopy to user");
			obrowser.findElement(By.xpath("//div[@class='inputGroup']//input[@name='firstName']")).sendKeys("demo");
			obrowser.findElement(By.xpath("//input[@type='text'and@name='lastName']")).sendKeys("user");
			obrowser.findElement(By.xpath("//input[@type='text'and@name='email']")).sendKeys("demo123@gmail.com");
			obrowser.findElement(By.xpath("//input[@type='text'and@name='username']")).sendKeys("demo12345");
			obrowser.findElement(By.xpath("//input[@type='password'and@name='password']")).sendKeys("passw");
			obrowser.findElement(By.xpath("//input[@type='password'and@name='passwordCopy']")).sendKeys("passw");
			obrowser.findElement(By.xpath("//div[@id='userDataLightBox_commitBtn']")).click();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=3)
	static void modifyUser()
	{
		try
		{
			obrowser.navigate().refresh();Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();Thread.sleep(2000);	
			log.info("updating the details  FN,LN,email,username,pwd,pwdCopy to user");
			obrowser.findElement(By.xpath("//div[@class='inputGroup']//input[@name='firstName']")).sendKeys("demonew");
			obrowser.findElement(By.xpath("//input[@type='text'and@name='lastName']")).sendKeys("usernew");
			obrowser.findElement(By.xpath("//input[@type='text'and@name='email']")).clear();
			obrowser.findElement(By.xpath("//input[@type='text'and@name='email']")).sendKeys("demo1234@gmail.com");
			obrowser.findElement(By.xpath("//input[@type='text'and@name='username']")).sendKeys("demo123456");
			obrowser.findElement(By.xpath("//input[@type='password'and@name='password']")).sendKeys("password");
			obrowser.findElement(By.xpath("//input[@type='password'and@name='passwordCopy']")).sendKeys("password");

			obrowser.findElement(By.xpath("//div[@id='userDataLightBox_commitBtn']//div//span[@class='buttonTitle']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=4)
	static void deleteUser()
	{
		try
		{
			// Preconditions obrowser;
			obrowser.navigate().refresh();
			log.info("deleting the user");
			obrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(2000);				
			obrowser.findElement(By.xpath("//button[@id='userDataLightBox_deleteBtn']")).click();
			Thread.sleep(2000);
			Alert obj=obrowser.switchTo().alert();
			obj.accept();
			Thread.sleep(1000);

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	@Test(priority=5)
	public void postrequistes()
	{
		postrequisite.logout();
		postrequisite.closeBrowser();

	}

}



