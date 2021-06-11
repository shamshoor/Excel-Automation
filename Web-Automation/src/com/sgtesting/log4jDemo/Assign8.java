package com.sgtesting.log4jDemo;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Assign8 extends Preconditions {
	public static Logger log=Logger.getLogger("assignment8 o/p");
	//public static WebDriver obrowser=null;
	public static WebElement add=null, FN=null, LN=null, email=null, uname=null, pwd=null, repwd=null, create=null, login=null, logout=null;

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
	static void create3Users()
	{	

		try
		{
			log.info("execution starts here for creation of three users!!!");
			for(int i=1;i<=3;i++)
			{
				obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();Thread.sleep(1000);
				add=obrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]"));	add.click();Thread.sleep(1000);
				log.info("assigning FN,LN,email,userName,passWord,pwdCopy");
				FN=obrowser.findElement(By.name("firstName"));		
				FN.sendKeys("user"+i);
				LN=obrowser.findElement(By.name("lastName"));		
				LN.sendKeys("last"+i);
				email=obrowser.findElement(By.name("email"));			
				email.sendKeys("user"+i+"@mail.com");
				uname=obrowser.findElement(By.name("username"));		
				uname.sendKeys("user"+i);
				pwd=obrowser.findElement(By.name("password"));		
				pwd.sendKeys("password"+i);
				repwd=obrowser.findElement(By.name("passwordCopy"));	
				repwd.sendKeys("password"+i);
				create=obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span"));	create.click();
				Thread.sleep(1500);
			}
			log.info("execution ends here for creation of three users!!!");
			

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=3)
	static void loginandlogoutuser1()
	{
		try
		{
			log.info("signing in as user1");
			postrequisite.logout();Thread.sleep(1000);
			log.info("logging in with valid credentials by uname and pwd");
			uname=obrowser.findElement(By.name("username"));		
			uname.sendKeys("user1");Thread.sleep(1000);
			pwd=obrowser.findElement(By.name("pwd"));		
			pwd.sendKeys("password1");	Thread.sleep(1000);
			login=obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div"));		
			login.click();	Thread.sleep(1500);
			obrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();  Thread.sleep(2000);
			log.info("signing out as user1");
			logout=obrowser.findElement(By.linkText("Logout"));	logout.click(); 	Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=4)
	static void loginandlogoutuser2()
	{
		try
		{
			log.info("signing in as user2 with uname and pwd");
			uname=obrowser.findElement(By.name("username"));		
			uname.sendKeys("user2");	Thread.sleep(1000);
			pwd=obrowser.findElement(By.name("pwd"));		
			pwd.sendKeys("password2");	Thread.sleep(1000);
			login=obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div"));		
			login.click();	Thread.sleep(1500);
			obrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();  Thread.sleep(2000);
			log.info("signing out as user2");
			logout=obrowser.findElement(By.linkText("Logout"));	logout.click(); Thread.sleep(200);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=5)
	static void loginandlogoutuser3()
	{
		try
		{
			log.info("signing in as user3 with uname and pwd");
			uname=obrowser.findElement(By.name("username"));		
			uname.sendKeys("user3");	Thread.sleep(1000);
			pwd=obrowser.findElement(By.name("pwd"));		
			pwd.sendKeys("password3");	Thread.sleep(1000);
			login=obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div"));		
			login.click();	Thread.sleep(1500);
			obrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();  Thread.sleep(2000);
			log.info("signing out as user3");
			logout=obrowser.findElement(By.linkText("Logout"));	logout.click(); Thread.sleep(2000);
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
			Preconditions.loginAdmin();
			log.info("execution starts here for deleting 3 users");
			for(int i=1;i<=3;i++)
			{
				obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();		Thread.sleep(1000);
				obrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]")).click(); 
				Thread.sleep(1500);
				obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();	Thread.sleep(1500);
				Alert check=obrowser.switchTo().alert();	check.accept();	Thread.sleep(2000);
			
			}
			log.info("execution ends here for deleting of three users!!!");
			

			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=7)
	static void postrequistes()
	{
		postrequisite.logout();
		postrequisite.closeBrowser();
		
	}

}






