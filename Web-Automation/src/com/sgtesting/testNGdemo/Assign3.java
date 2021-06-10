package com.sgtesting.testNGdemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class Assign3 extends Preconditions {
	//public public WebDriver obrowser=null;
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
	public void createCustomer()
	{
		try
		{

			
			obrowser.findElement(By.xpath("//td[@class='navItem navCell relative notSelected']//a[@class='content tasks']")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//div[@class='addNewContainer']//div[@class='addNewButton']//div[@class='title ellipsis']")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//div[@class='item createNewCustomer ellipsis']")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//input[@id='customerLightBox_nameField']")).sendKeys("jabongg");
			obrowser.findElement(By.xpath("//div[@id='customerLightBox_commitBtn']//div//span[@class='buttonTitle']")).click();Thread.sleep(2000);
			
//			obrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[3]/a/div[2]")).click();
//			Thread.sleep(2000);
//			obrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")).click();
//			Thread.sleep(2000);
//			obrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
//			Thread.sleep(3000);
//			obrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("customrdemo");
//			Thread.sleep(3000);
//			obrowser.findElement(By.xpath("//*[@id=\"customerLightBox_commitBtn\"]/div/span")).click();
//			Thread.sleep(3000);
			
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	@Test(priority=3)
	public void deleteCustomer()
	{
		try
		{
		
			obrowser.findElement(By.xpath("//div[@class='node customerNode selected']//div[@class='editButton available']")).click();
			Thread.sleep(2000);				
			obrowser.findElement(By.xpath("//div[@class='edit_customer_sliding_panel sliding_panel']//div[@class='img']/following-sibling::div[@class='action']")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//div[@class='dropdownContainer actionsMenu']//div//div[@class='deleteButton'][@style='display: inline-block;']")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//span[@id='customerPanel_deleteConfirm_submitTitle']")).click();
			Thread.sleep(2000);

		}catch(Exception e)
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



