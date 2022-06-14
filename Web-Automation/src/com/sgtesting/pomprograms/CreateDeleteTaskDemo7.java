package com.sgtesting.pomprograms;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateDeleteTaskDemo7 {
	public static WebDriver OBrowser=null;
	public static ActiTimePage oPage=null;


	public static void main(String[] args) {
		
		LaunchBrowser();
		Navigate();
		Login();
		CreateCustomer();
		CreateProject();
		CreateTask();
		DeleteTask();
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
private static void CreateTask()
{
	try
	{
		oPage.getAddTaskButton().click();
		Thread.sleep(1000);
		oPage.getCreateNewTaskbutton().click();
		Thread.sleep(1000);
		oPage.getInputTaskName().sendKeys("Task1");
		Thread.sleep(2000);
		oPage.getCreateTaskButton().click();
		Thread.sleep(1000);
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void DeleteTask()
{
	try
	{
		oPage.getTaskCheckbox().click();
		Thread.sleep(1000);
		oPage.getDeleteTask().click();
		Thread.sleep(1000);
		oPage.getdeleteTaskPermentaly().click();
		Thread.sleep(2000);
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





