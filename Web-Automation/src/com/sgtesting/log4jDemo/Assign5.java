package com.sgtesting.log4jDemo;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Assign5 extends Preconditions {
	public static Logger log=Logger.getLogger("assignment5 o/p");
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
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//div[@class='item createNewCustomer ellipsis']")).click();
			Thread.sleep(1000);
			log.info("Assigning name to the customer");
			obrowser.findElement(By.xpath("//input[@id='customerLightBox_nameField']")).sendKeys("Dominos");
			obrowser.findElement(By.xpath("//div[@id='customerLightBox_commitBtn']//div//span[@class='buttonTitle']")).click();Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	@Test(priority=3)
	static void createProject()
	{
		try
		{	
			log.info("creating the project");
			obrowser.findElement(By.xpath("//div[@class='addNewContainer']//div[@class='addNewButton']//div[@class='title ellipsis']")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//div[@class='item createNewProject ellipsis']")).click();
			Thread.sleep(1000);			
			log.info("assigning a name to the project");
			obrowser.findElement(By.xpath("//input[@id='projectPopup_projectNameField']")).sendKeys("newProject");Thread.sleep(1000);	
			obrowser.findElement(By.xpath("//div[@id='projectPopup_footer']//span[@class='buttonTitle']")).click();Thread.sleep(1000);	

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

	@Test(priority=4)
	static void deleteProject()
	{
		try
		{
			log.info("deleting the project");
			obrowser.findElement(By.xpath("//div[@class='node projectNode selected']//div[@class='editButton available']")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//div[@class='edit_project_sliding_panel sliding_panel']//div[@class='action']")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//div[@class='edit_project_sliding_panel sliding_panel']//div[@class='deleteButton']")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//span[@id='projectPanel_deleteConfirm_submitTitle']")).click();
			Thread.sleep(4000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=5)
	static void deleteCustomer()
	{
		try
		{
			log.info("deleting the customer");
			obrowser.findElement(By.xpath("//div[@class='node customerNode notSelected']//div[@class='editButton available']")).click();
			Thread.sleep(2000);		
			obrowser.findElement(By.xpath("//div[@class='edit_customer_sliding_panel sliding_panel']//div[@class='img']/following-sibling::div[@class='action']")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//div[@class='dropdownContainer actionsMenu']//div//div[@class='deleteButton'][@style='display: inline-block;']")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//span[@id='customerPanel_deleteConfirm_submitTitle']")).click();

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	@Test(priority=6)
	static void postrequistes()
	{
		postrequisite.logout();
		postrequisite.closeBrowser();
		
	}
}

	

	





