package com.sgtesting.pomprograms;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAssign1 {
	public static WebDriver OBrowser=null;
	public static ActiTimePage oPage=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		Login();
		logout();
		closeApplication();
		
	}
	private static void launchBrowser()
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
	private static void navigate()
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


