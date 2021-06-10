package com.sgtesting.log4jDemo;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class Assign9 extends Preconditions {
	public static Logger log=Logger.getLogger("assignment9 o/p");
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
	static void createUser1()
	{	

		try
		{
			log.info("crreation of user1");
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();Thread.sleep(1000);
			//creating user 1
			add=obrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]"));	add.click();Thread.sleep(1000);
			log.info("assigning eleemnts of user1 with FN,LN,email,uname,pwd,pwdcopy");
			FN=obrowser.findElement(By.name("firstName"));		
			FN.sendKeys("user1");
			LN=obrowser.findElement(By.name("lastName"));		
			LN.sendKeys("last1");
			email=obrowser.findElement(By.name("email"));			
			email.sendKeys("user1@mail.com");
			uname=obrowser.findElement(By.name("username"));		
			uname.sendKeys("user1");
			pwd=obrowser.findElement(By.name("password"));		
			pwd.sendKeys("password1");
			repwd=obrowser.findElement(By.name("passwordCopy"));	repwd.sendKeys("password1");
			create=obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span"));	create.click();
			Thread.sleep(1500);
			log.info("signing out of user1");
			postrequisite.logout();Thread.sleep(1500);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=3)
	static void loginuser1()
	{
		try
		{
			log.info("signing in as user1 with given uname and pwd");
			uname=obrowser.findElement(By.name("username"));		
			uname.sendKeys("user1"); Thread.sleep(1000);
			pwd=obrowser.findElement(By.name("pwd"));		pwd.sendKeys("password1");	Thread.sleep(1000);
			login=obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div"));		login.click();	Thread.sleep(1500);
			obrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();  Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=4)
	static void createUser2()
	{	

		try
		{
			log.info("crreation of user2");
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();Thread.sleep(1000);
			//creating user 2
			add=obrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]"));	add.click();Thread.sleep(1000);
			log.info("assigning eleemnts in user2 with  given FN,LN,email,uname,pwd,pwdcopy");
			FN=obrowser.findElement(By.name("firstName"));		FN.sendKeys("user2");
			LN=obrowser.findElement(By.name("lastName"));		LN.sendKeys("last2");
			email=obrowser.findElement(By.name("email"));			email.sendKeys("user2@mail.com");
			uname=obrowser.findElement(By.name("username"));		uname.sendKeys("user2");
			pwd=obrowser.findElement(By.name("password"));		pwd.sendKeys("password2");
			repwd=obrowser.findElement(By.name("passwordCopy"));	repwd.sendKeys("password2");
			create=obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span"));	create.click();
			Thread.sleep(1500);
			log.info("signing out as user2");
			postrequisite.logout();Thread.sleep(1500);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=5)
	static void loginuser2()
	{
		try
		{
			log.info("signing in as user2 with uname and pwd");
			uname=obrowser.findElement(By.name("username"));		uname.sendKeys("user2");		Thread.sleep(1000);
			pwd=obrowser.findElement(By.name("pwd"));		pwd.sendKeys("password2");	Thread.sleep(1000);
			login=obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div"));		login.click();	Thread.sleep(1500);
			obrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();  Thread.sleep(2000);


		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=6)
	static void createUser3()

	{	

		try
		{
			log.info("crreation of user3");
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();Thread.sleep(1000);
			//creating user 3
			
			add=obrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]"));	add.click();Thread.sleep(1000);
			log.info("assigning eleemnts in user3 with  given FN,LN,email,uname,pwd,pwdcopy");
			FN=obrowser.findElement(By.name("firstName"));		FN.sendKeys("user3");
			LN=obrowser.findElement(By.name("lastName"));		LN.sendKeys("last3");
			email=obrowser.findElement(By.name("email"));			email.sendKeys("user3@mail.com");
			uname=obrowser.findElement(By.name("username"));		uname.sendKeys("user3");
			pwd=obrowser.findElement(By.name("password"));		pwd.sendKeys("password3");
			repwd=obrowser.findElement(By.name("passwordCopy"));	repwd.sendKeys("password3");
			create=obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span"));	create.click();
			Thread.sleep(1500);
			log.info("signing out as user3");
			postrequisite.logout();Thread.sleep(1500);
			log.info("logging in as admin");
			Preconditions.loginAdmin();Thread.sleep(1500);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=7)
	static void modifyUser1()
	{
		try
		{
			log.info("modifying user1");
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]")).click(); Thread.sleep(1500);
			log.info("updating FN,LN,email,uname,pwd,pwdcopy");
			FN=obrowser.findElement(By.name("firstName"));	
			FN.clear(); Thread.sleep(1000); 	FN.sendKeys("user1new"); Thread.sleep(1000);
			LN=obrowser.findElement(By.name("lastName"));		
			LN.clear(); Thread.sleep(1000); 	LN.sendKeys("last1new");	Thread.sleep(1000);
			uname=obrowser.findElement(By.name("username"));	
			uname.clear();  Thread.sleep(1000);	uname.sendKeys("user1new");  Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click(); 
			Thread.sleep(1000);
			log.info("signing out as user1");
			postrequisite.logout();Thread.sleep(1500);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	@Test(priority=8)
	static void loginModifieduser1()
	{
		try
		{
			log.info("signing as updated user1");
			uname=obrowser.findElement(By.name("username"));		uname.sendKeys("user1new");		Thread.sleep(1000);
			pwd=obrowser.findElement(By.name("pwd"));		pwd.sendKeys("password1");	Thread.sleep(1000);
			login=obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div"));		login.click();	Thread.sleep(1500);
			obrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();  Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=9)
	static void modifyUser2()
	{
		try
		{
			log.info("modifying user2");
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]")).click(); Thread.sleep(1500);
			log.info("updating FN,LN,username,pwd to user2");
			FN=obrowser.findElement(By.name("firstName"));	
			FN.clear(); Thread.sleep(1000); 	FN.sendKeys("user2new"); Thread.sleep(1000);
			LN=obrowser.findElement(By.name("lastName"));		
			LN.clear(); Thread.sleep(1000); 	LN.sendKeys("last2new");	Thread.sleep(1000);
			uname=obrowser.findElement(By.name("username"));	
			uname.clear();  Thread.sleep(1000);	uname.sendKeys("user2new");  Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click(); 
			Thread.sleep(1000);
			log.info("logging out as user2");
			
			postrequisite.logout();Thread.sleep(1500);
		}catch(Exception e)
		{

		}
	}
	@Test(priority=10)
	static void loginModifieduser2()
	{
		try
		{
			log.info(" signing in as modifying user2 credetils");
			uname=obrowser.findElement(By.name("username"));		uname.sendKeys("user2new");		Thread.sleep(1000);
			pwd=obrowser.findElement(By.name("pwd"));		pwd.sendKeys("password2");	Thread.sleep(1000);
			login=obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div"));		login.click();	Thread.sleep(1500);
			obrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();  Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=11)
	static void modifyUser3()
	{
		try
		{
			log.info("modifying user3");
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[3]")).click(); Thread.sleep(1500);
			log.info("updating FN,LN,username,pwd to user3");
			FN=obrowser.findElement(By.name("firstName"));	
			FN.clear(); Thread.sleep(1000); 	FN.sendKeys("user3new"); Thread.sleep(1000);
			LN=obrowser.findElement(By.name("lastName"));		
			LN.clear(); Thread.sleep(1000); 	LN.sendKeys("last3new");	Thread.sleep(1000);
			uname=obrowser.findElement(By.name("username"));	
			uname.clear();  Thread.sleep(1000);	uname.sendKeys("user3new");  Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click(); 
			Thread.sleep(1000);
			log.info("logging out as user2");
			postrequisite.logout();Thread.sleep(1500);
		}catch(Exception e)
		{

		}
	}
	@Test(priority=12)
	static void deleteuser3()
	{
		try
		{
			log.info("deleting user3");
			Assign9.loginModifieduser2();Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[3]")).click(); 
			Thread.sleep(1500);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();	Thread.sleep(1500);
			Alert check=obrowser.switchTo().alert();	check.accept();	Thread.sleep(2000);
			log.info("logging out as user2");
			postrequisite.logout();Thread.sleep(1500);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=13)
	static void deleteuser2()
	{
		try
		{
			Assign9.loginModifieduser1();Thread.sleep(1000);
			log.info("logging in as modified user1");
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]")).click(); 
			log.info("deleting user2");
			Thread.sleep(1500);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();	Thread.sleep(1500);
			Alert check=obrowser.switchTo().alert();	check.accept();	Thread.sleep(2000);
			log.info("logging out as user1");
			postrequisite.logout();Thread.sleep(1500);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=14)
	static void deleteuser1()
	{
		try
		{
			Preconditions.loginAdmin();Thread.sleep(1000);
			log.info("logging in as admin");
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]")).click(); 
			Thread.sleep(1500);
			log.info("deleting user1");
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();	Thread.sleep(1500);
			Alert check=obrowser.switchTo().alert();	check.accept();	Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=15 )
	static void postrequistes()
	{
		try
		{
			postrequisite.logout();Thread.sleep(1000);
			postrequisite.closeBrowser();Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}





