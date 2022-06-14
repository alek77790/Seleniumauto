package com.sgtesting.Objmapprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectMapBasicAssig7 {

	public static WebDriver oBrowser=null;
	public static String filename=null;
	public static ObjectMap objectmap=null;


	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		createCustomer();
		createProject();
		createTask();
		deleteTask();
		deleteProject();
		deleteCustomer();
		logout();
		closeApplication();
	}
	private static void launchBrowser()
	{
		try
		{
			filename="D:\\ECLIPSE TOOL\\Web-Automation\\src\\com\\sgtesting\\Objmapprograms\\objectmap.properties";
			System.setProperty("webdriver.chrome.driver", "D:\\ECLIPSE TOOL\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			objectmap=new ObjectMap(filename);

		}catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
	private static void navigate()
	{
		try
		{
			oBrowser.manage().window().maximize();
			oBrowser.get("http://localhost:81/login.do");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("admin");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("manager");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpageloginbtn")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void createCustomer()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("taskbutton")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("taskaddnew")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("tasknewcustomer")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("entercustomername")).sendKeys("Customer1");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("createcustomer")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void createProject()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("taskaddnew")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addnewproject")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("enternewproject")).sendKeys("Project1");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("createnewprojectbutton")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void createTask()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("addnewtaskbutton")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("createnewtaskbutton")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("enternewtask")).sendKeys("Task1");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("createtaskbutton")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void deleteTask()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("clicktaskcheckbox")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("deletetaskbutton")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("deletetaskpermentaly")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void deleteProject()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("projectsettingbutton")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("projectactionbutton")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("projectdeletebutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("projectdeletepermently")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void deleteCustomer()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("customersetting")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("customeraction")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("customerdelete")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("customerdeletepermently")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("homepagelogoutlink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeApplication()
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

