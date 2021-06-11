package com.sgtesting.testNGdemo;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class Assign9 extends Preconditions {
	//public public WebDriver obrowser=null;
public static WebElement add=null, FN=null, LN=null, email=null, uname=null, pwd=null, repwd=null, create=null, login=null, logout=null;
	
	@Test(priority=1)
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
	@Test(priority=2)
	public void createUser1()
	{	

		try
		{
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();Thread.sleep(1000);
			//creating user 1
			add=obrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]"));	add.click();Thread.sleep(1000);
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
			postrequisite.logout();Thread.sleep(1500);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=3)
	public void loginuser1()
	{
		try
		{
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
	public void createUser2()
	{	

		try
		{
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();Thread.sleep(1000);
			//creating user 2
			add=obrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]"));	add.click();Thread.sleep(1000);
			FN=obrowser.findElement(By.name("firstName"));		FN.sendKeys("user2");
			LN=obrowser.findElement(By.name("lastName"));		LN.sendKeys("last2");
			email=obrowser.findElement(By.name("email"));			email.sendKeys("user2@mail.com");
			uname=obrowser.findElement(By.name("username"));		uname.sendKeys("user2");
			pwd=obrowser.findElement(By.name("password"));		pwd.sendKeys("password2");
			repwd=obrowser.findElement(By.name("passwordCopy"));	repwd.sendKeys("password2");
			create=obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span"));	create.click();
			Thread.sleep(1500);
			postrequisite.logout();Thread.sleep(1500);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=5)
	public void loginuser2()
	{
		try
		{
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
	public void createUser3()

	{	

		try
		{
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();Thread.sleep(1000);
			//creating user 3
			add=obrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]"));	add.click();Thread.sleep(1000);
			FN=obrowser.findElement(By.name("firstName"));		FN.sendKeys("user3");
			LN=obrowser.findElement(By.name("lastName"));		LN.sendKeys("last3");
			email=obrowser.findElement(By.name("email"));			email.sendKeys("user3@mail.com");
			uname=obrowser.findElement(By.name("username"));		uname.sendKeys("user3");
			pwd=obrowser.findElement(By.name("password"));		pwd.sendKeys("password3");
			repwd=obrowser.findElement(By.name("passwordCopy"));	repwd.sendKeys("password3");
			create=obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span"));	create.click();
			Thread.sleep(1500);
			postrequisite.logout();Thread.sleep(1500);
			Preconditions.loginAdmin();Thread.sleep(1500);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=7)
	public void modifyUser1()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]")).click(); Thread.sleep(1500);
			FN=obrowser.findElement(By.name("firstName"));	
			FN.clear(); Thread.sleep(1000); 	FN.sendKeys("user1new"); Thread.sleep(1000);
			LN=obrowser.findElement(By.name("lastName"));		
			LN.clear(); Thread.sleep(1000); 	LN.sendKeys("last1new");	Thread.sleep(1000);
			uname=obrowser.findElement(By.name("username"));	
			uname.clear();  Thread.sleep(1000);	uname.sendKeys("user1new");  Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click(); 
			Thread.sleep(1000);
			postrequisite.logout();Thread.sleep(1500);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	@Test(priority=8)
	public void loginModifieduser1()
	{
		try
		{
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
	public void modifyUser2()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]")).click(); Thread.sleep(1500);
			FN=obrowser.findElement(By.name("firstName"));	
			FN.clear(); Thread.sleep(1000); 	FN.sendKeys("user2new"); Thread.sleep(1000);
			LN=obrowser.findElement(By.name("lastName"));		
			LN.clear(); Thread.sleep(1000); 	LN.sendKeys("last2new");	Thread.sleep(1000);
			uname=obrowser.findElement(By.name("username"));	
			uname.clear();  Thread.sleep(1000);	uname.sendKeys("user2new");  Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click(); 
			Thread.sleep(1000);
			postrequisite.logout();Thread.sleep(1500);
		}catch(Exception e)
		{

		}
	}
	@Test(priority=10)
	public void loginModifieduser2()
	{
		try
		{
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
	public void modifyUser3()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[3]")).click(); Thread.sleep(1500);
			FN=obrowser.findElement(By.name("firstName"));	
			FN.clear(); Thread.sleep(1000); 	FN.sendKeys("user3new"); Thread.sleep(1000);
			LN=obrowser.findElement(By.name("lastName"));		
			LN.clear(); Thread.sleep(1000); 	LN.sendKeys("last3new");	Thread.sleep(1000);
			uname=obrowser.findElement(By.name("username"));	
			uname.clear();  Thread.sleep(1000);	uname.sendKeys("user3new");  Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click(); 
			Thread.sleep(1000);
			postrequisite.logout();Thread.sleep(1500);
		}catch(Exception e)
		{

		}
	}
	@Test(priority=12)
	public void deleteuser3()
	{
		try
		{
			//Assign9.loginModifieduser2();Thread.sleep(1000);
			uname=obrowser.findElement(By.name("username"));		uname.sendKeys("user2new");		Thread.sleep(1000);
			pwd=obrowser.findElement(By.name("pwd"));		pwd.sendKeys("password2");	Thread.sleep(1000);
			login=obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div"));		login.click();	Thread.sleep(1500);
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[3]")).click(); 
			Thread.sleep(1500);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();	Thread.sleep(1500);
			Alert check=obrowser.switchTo().alert();	check.accept();	Thread.sleep(2000);
			postrequisite.logout();Thread.sleep(1500);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=13)
	public void deleteuser2()
	{
		try
		{
			//Assign9.loginModifieduser1();Thread.sleep(1000);
			uname=obrowser.findElement(By.name("username"));		uname.sendKeys("user1new");		Thread.sleep(1000);
			pwd=obrowser.findElement(By.name("pwd"));		pwd.sendKeys("password1");	Thread.sleep(1000);
			login=obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div"));		login.click();	Thread.sleep(1500);
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]")).click(); 
			Thread.sleep(1500);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();	Thread.sleep(1500);
			Alert check=obrowser.switchTo().alert();	check.accept();	Thread.sleep(2000);
			postrequisite.logout();Thread.sleep(1500);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=14)
	public void deleteuser1()
	{
		try
		{
			Preconditions.loginAdmin();Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]")).click(); 
			Thread.sleep(1500);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();	Thread.sleep(1500);
			Alert check=obrowser.switchTo().alert();	check.accept();	Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=15 )
	public void postrequistes()
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


