package com.sgtesting.log4jDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.log4j.Logger;

//import testNGdemo.postrequisite;

class postrequisite
{
	public static Logger log=Logger.getLogger("Similar Methods executed!!!");
	public static  WebDriver obrowser=null;
	
	static void logout()
	{
		try
		{
			log.info("logging out the browserapplication");
			obrowser.findElement(By.xpath("//a[@class='logout']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static  void closeBrowser()
	{
		try
		{
			log.info("closing the browserapp");
			obrowser.close();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

public class Preconditions extends postrequisite {


	static void launchBrowserandNavigate()
	{
		String path=null;
		try
		{
			log.info("defining the path");
			path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",path+"\\library\\drivers\\chromedriver.exe");
			obrowser = new ChromeDriver();
			log.info("maximizing the window");
			obrowser.manage().window().maximize();
			Thread.sleep(1000);
			log.info("navigate to the url");
			obrowser.get("http://localhost:81/login.do");
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void loginAdmin()
	{
		try
		{
			log.info("validating login credentials");
			obrowser.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");Thread.sleep(1000);
			obrowser.findElement(By.xpath("//input[@class='textField pwdfield']")).sendKeys("manager");Thread.sleep(1000);
			obrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void minimizeFlyOutWindow()
	{
		try
		{
			log.info("minizing flyoutWindow");
			obrowser.findElement(By.xpath("//div[@id='gettingStartedShortcutsPanelId']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}




}


