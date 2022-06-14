package com.sgtesting.pomprograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateUserDemo1 {
	public static WebDriver OBrowser=null;
	public static ActiTimePage oPage=null;

	public static void main(String[] args) {
		LaunchBrowser();
		Navigate();
		Login();
		createUser();
		DeleteUser();
		logout();
		closeApplication();
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
private static void createUser()
{
	try
	{
		oPage.getUser().click();
		oPage.getAdduser().click();
		Thread.sleep(1000);
		oPage.getFirstname().sendKeys("Demo");
		oPage.getLastname().sendKeys("user1");
		oPage.getEmail().sendKeys("demouser1@gmail.com");
		oPage.getUsername().sendKeys("DemoUser1");
		oPage.getcreatePassword().sendKeys("Welcome123");
		oPage.getretypePassword().sendKeys("Welcome123");
		oPage.getCreateUser().click();
		Thread.sleep(2000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}

private static void DeleteUser()
{
	try
	{
		oPage.getDemoUserButton().click();
		Thread.sleep(1000);
		oPage.getdeleteUser().click();
		Alert oAlert=OBrowser.switchTo().alert();
		String content=oAlert.getText();
		System.out.println(content);
		oAlert.accept();
		Thread.sleep(1000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void logout()
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

private static void closeApplication()
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
