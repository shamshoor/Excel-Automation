package com.sgtesting.actitime.driverscript;

import com.sgtesting.actitime.tests.Customers;
import com.sgtesting.actitime.tests.HomePage;
import com.sgtesting.actitime.tests.Initialization;
import com.sgtesting.actitime.tests.LoginLogout;
import com.sgtesting.actitime.tests.Projects;
import com.sgtesting.actitime.tests.Tasks;
import com.sgtesting.actitime.tests.Users;

public class DriverScripts {

	public static void main(String[] args) {
		
		//Create User Scenario
		Initialization.launchBrowser();
		Initialization.navigate();
		LoginLogout.login();
		HomePage.minimizeFlyOutWindow();
		Users.createUser();
		Users.deleteUser();
		LoginLogout.logout();
		Initialization.closeApplication();
		
		//Modify User Scenario
		Initialization.launchBrowser();
		Initialization.navigate();
		LoginLogout.login();
		HomePage.minimizeFlyOutWindow();
		Users.createUser();
		Users.modifyUser();
		Users.deleteUser();
		LoginLogout.logout();
		Initialization.closeApplication();
		
		//CreateCustomer
		Initialization.launchBrowser();
		Initialization.navigate();
		LoginLogout.login();
		HomePage.minimizeFlyOutWindow();
		Customers.createCustomer();
		Customers.deleteCustomer();
		LoginLogout.logout();
		Initialization.closeApplication();
		
		//ModifyCustomer
		Initialization.launchBrowser();
		Initialization.navigate();
		LoginLogout.login();
		HomePage.minimizeFlyOutWindow();
		Customers.createCustomer();
		Customers.modifyCustomer();
		Customers.deleteCustomer();
		LoginLogout.logout();
		Initialization.closeApplication();
		
		//CreateCustomerProjectDeletecustomerProject
		Initialization.launchBrowser();
		Initialization.navigate();
		LoginLogout.login();
		HomePage.minimizeFlyOutWindow();
		Customers.createCustomer();
		Projects.createProject();
		Projects.deleteProject();
		Customers.deleteCustomer();
		LoginLogout.logout();
		Initialization.closeApplication();
		
		//CreateCustomerprojectModifyProject
		Initialization.launchBrowser();
		Initialization.navigate();
		LoginLogout.login();
		HomePage.minimizeFlyOutWindow();
		Customers.createCustomer();
		Projects.createProject();
		Projects.modifyProject();
		Projects.deleteProject();
		Customers.deleteCustomer();
		LoginLogout.logout();
		Initialization.closeApplication();
		
		//CreateDeleteTasks
		Initialization.launchBrowser();
		Initialization.navigate();
		LoginLogout.login();
		HomePage.minimizeFlyOutWindow();
		Customers.createCustomer();
		Projects.createProject();
		Tasks.createTasks();
		Tasks.modifyTasks();
		Tasks.deleteTasks();
		LoginLogout.logout();
		Initialization.closeApplication();
		


		
		
		
		
		
		
		
		

	}

}
