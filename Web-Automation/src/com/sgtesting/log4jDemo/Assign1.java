package com.sgtesting.log4jDemo;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assign1 extends Preconditions {
	public static Logger log=Logger.getLogger("assignment1 o/p");

	
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
			obrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			log.info("assigning firstname to user");
			obrowser.findElement(By.name("firstName")).sendKeys("user1");
			log.info("assigning lastname to user");
			obrowser.findElement(By.name("lastName")).sendKeys("demo1");
			log.info("assigning email to user");
			obrowser.findElement(By.name("email")).sendKeys("user1demo1@gmail.com");
			log.info("assigning username");
			obrowser.findElement(By.name("username")).sendKeys("user123");
			log.info("assigning pwd to username");
			obrowser.findElement(By.name("password")).sendKeys("qwerty");
			obrowser.findElement(By.name("passwordCopy")).sendKeys("qwerty");
			obrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(3000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=3)
	static void deleteUser()
	{
		try
		{
			log.info("deleting the user succesfully!!");
			obrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);				
			obrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert obj=obrowser.switchTo().alert();
			obj.accept();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	@Test(priority=4)
	public void postrequistes()
	{
		postrequisite.logout();
		postrequisite.closeBrowser();

	}
}


