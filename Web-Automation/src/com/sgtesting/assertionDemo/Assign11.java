package com.sgtesting.assertionDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assign11 {
	SoftAssert softassert=new SoftAssert();
	public static WebDriver obrowser=null;
	

		@Test(priority=1)
		public void launchBrowser()
		{
			String path=null;
			try
			{
				path=System.getProperty("user.dir");
				System.setProperty("webdriver.chrome.driver",path+"\\library\\drivers\\chromedriver.exe");
				softassert.assertTrue(false, "path identified");
				obrowser = new ChromeDriver();
				softassert.assertTrue(false, "window maximixed");
				obrowser.manage().window().maximize();

			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		@Test(priority=2)
		static void navigate()
		{
			try
			{
				obrowser.get("http://localhost:81/login.do");
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		@Test(priority=3)
		static void login()
		{
			try
			{
				obrowser.findElement(By.id("username")).sendKeys("admin");Thread.sleep(1000);
				obrowser.findElement(By.name("pwd")).sendKeys("manager");Thread.sleep(1000);
				obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		@Test(priority=4)
		static void  minimizeFlyOutWindow()
		{
			try
			{
				obrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
				Thread.sleep(1000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		@Test(priority=5)
		static void createUser()
		{
			try
			{
				obrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
				Thread.sleep(2000);
				obrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
				Thread.sleep(2000);
				obrowser.findElement(By.name("firstName")).sendKeys("user1");
				obrowser.findElement(By.name("lastName")).sendKeys("demo1");
				obrowser.findElement(By.name("email")).sendKeys("user1demo1@gmail.com");
				obrowser.findElement(By.name("username")).sendKeys("user123");
				obrowser.findElement(By.name("password")).sendKeys("qwerty");
				obrowser.findElement(By.name("passwordCopy")).sendKeys("qwerty");
				obrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
				Thread.sleep(3000);

			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		@Test(priority=6)
		static void deleteUser()
		{
			try
			{
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
		@Test(priority=7)
		static void logout()
		{
			try
			{
				obrowser.findElement(By.id("logoutLink")).click();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		@Test(priority=8)
		static void closeBrowser()
		{
			try
			{	
				obrowser.close();

			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}







	







