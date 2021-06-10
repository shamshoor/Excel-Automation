package com.sgtesting.testNGdemo;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class Assign2 extends Preconditions {
	//public public WebDriver obrowser=null;
	//@Test(priority=1)
	public void runPreconditions()
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
	//@Test(priority=2)
	public void createUser()
	{

		try
		{

			obrowser.findElement(By.xpath("//td[@class='navItem navCell relative notSelected']//a[@class='content users']")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//div[@class='buttonText']")).click();
			Thread.sleep(2000);
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
	//@Test(priority=3)
	public void modifyUser()
	{
		try
		{
			obrowser.navigate().refresh();Thread.sleep(1000);
			obrowser.findElement(By.xpath("//tr[1]//td[@class='userNameCell first']")).click();Thread.sleep(2000);	
			obrowser.findElement(By.xpath("//div[@class='inputGroup']//input[@name='firstName']")).sendKeys("demonew");
			obrowser.findElement(By.xpath("//input[@type='text'and@name='lastName']")).sendKeys("usernew");
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
	//@Test(priority=4)
	public void deleteUser()
	{
		try
		{
			// Preconditions obrowser;
			obrowser.navigate().refresh();
			obrowser.findElement(By.xpath("//tr[1]//td[@class='userNameCell first']")).click();
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
	//@Test(priority=5)
	public void postrequistes()
	{
		postrequisite.logout();
		postrequisite.closeBrowser();

	}

}



