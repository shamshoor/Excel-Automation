package com.sgtesting.log4jDemo;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Assign4 extends Preconditions {
	public static Logger log=Logger.getLogger("assignment4 o/p");
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
	static void createCustomer()
	{
		try
		{
			log.info("creation of customer");
			obrowser.findElement(By.xpath("//td[@class='navItem navCell relative notSelected']//a[@class='content tasks']")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//div[@class='addNewContainer']//div[@class='addNewButton']//div[@class='title ellipsis']")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//div[@class='item createNewCustomer ellipsis']")).click();
			Thread.sleep(2000);
			log.info("Assigning name to the customer");
			obrowser.findElement(By.xpath("//input[@id='customerLightBox_nameField']")).sendKeys("webdrive");
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//div[@id='customerLightBox_commitBtn']//div//span[@class='buttonTitle']")).click();Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	@Test(priority=3)
	static void modifyCustomer()
	{
		try
		{
			log.info("modification of customer");
			obrowser.findElement(By.xpath("//div[@class='node customerNode selected']//div[@class='editButton available']")).click();
			Thread.sleep(2000);		
			log.info("giving new name to the customer");
			obrowser.findElement(By.xpath("//textarea[@class='textarea'][@placeholder='Enter customer description...']")).sendKeys("CustomerdemO");
			Thread.sleep(2000);	
			obrowser.findElement(By.xpath("//div[@class='edit_customer_sliding_panel sliding_panel']//div//div[@class='closeButton']")).click();
			Thread.sleep(2000);	

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	@Test(priority=4)
	static void deleteCustomer()
	{
		try
		{
			log.info("deleting thecustomer");
			obrowser.findElement(By.xpath("//div[@class='node customerNode selected']//div[@class='editButton available']")).click();
			Thread.sleep(2000);				
			obrowser.findElement(By.xpath("//div[@class='edit_customer_sliding_panel sliding_panel']//div[@class='img']/following-sibling::div[@class='action']")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//div[@class='dropdownContainer actionsMenu']//div//div[@class='deleteButton'][@style='display: inline-block;']")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//span[@id='customerPanel_deleteConfirm_submitTitle']")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	@Test(priority=5)
	static void postrequistes()
	{
		postrequisite.logout();
		postrequisite.closeBrowser();
		
	}

}






