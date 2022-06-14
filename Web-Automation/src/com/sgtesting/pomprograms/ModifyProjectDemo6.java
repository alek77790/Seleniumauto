package com.sgtesting.pomprograms;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModifyProjectDemo6 {
	public static WebDriver OBrowser=null;
	public static ActiTimePage oPage=null;


	public static void main(String[] args) {
		
		LaunchBrowser();
		Navigate();
		Login();
		CreateCustomer();
		CreateProject();
		ModifyProject();
		DeleteProject();
		DeleteCustomer();
		Logout();
		CloseApplication();
		
	}
	private static void LaunchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\ECLIPSE TOOL\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
			OBrowser=new ChromeDriver();
			oPage=new ActiTimePage(OBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Navigate()
	{
		try
		{
			OBrowser.get("http://localhost:81/login.do");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Login()
	{
		try
		{
		oPage.getUserName().sendKeys("admin");
		Thread.sleep(1000);
		oPage.getPassword().sendKeys("manager");
		Thread.sleep(1000);
		oPage.getLoginButton().click();
		Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

private static void CreateCustomer()
{
	try
	{
		oPage.getTaskList().click();
		oPage.getAddnew().click();
		oPage.getNewCustomer().click();
		Thread.sleep(2000);
		oPage.getCustomername().sendKeys("DemoCustomer");
		oPage.getCreateCustomer().click();
		Thread.sleep(2000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void CreateProject()
{
	try
	{
		oPage.getAddnew().click();
		Thread.sleep(1000);
		oPage.getAddProject().click();
		Thread.sleep(1000);
		oPage.getProjectName().sendKeys("Project1");
		Thread.sleep(1000);	
		oPage.getCreateProjectButton().click();
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void ModifyProject()
{
	try
	{
		oPage.getProjectEditButton().click();
		Thread.sleep(1000);
		oPage.getmodifyProjectclick().click();
		Thread.sleep(1000);
		oPage.getmodifyProjectInput().clear();
		Thread.sleep(1000);
		oPage.getmodifyProjectInput().sendKeys("Modified project");
		Thread.sleep(1000);
		oPage.getProjectEditButton().click();
		Thread.sleep(1000);
		
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void DeleteProject()
{
	try
	{
		oPage.getProjectEditButton().click();
		Thread.sleep(1000);
		oPage.getProjectactionButton().click();
		Thread.sleep(1000);
		oPage.getProjectDeleteButton().click();
		Thread.sleep(1000);
		oPage.getProjectDeletePermntButton().click();
		Thread.sleep(2000);
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void DeleteCustomer()
{
	try
	{
		oPage.getDCSetting().click();
		Thread.sleep(1000);
		oPage.getAction().click();
		oPage.getdeleteCustomer().click();
		oPage.getdeteletpermanentlyCustomer().click();
		Thread.sleep(2000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void Logout()
{
	try
	{
		oPage.getLogout().click();
		Thread.sleep(2000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}

private static void CloseApplication()
{
	try
	{
		OBrowser.quit();
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}

}





