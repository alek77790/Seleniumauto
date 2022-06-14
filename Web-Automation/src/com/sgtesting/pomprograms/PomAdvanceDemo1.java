package com.sgtesting.pomprograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PomAdvanceDemo1 {
	public static WebDriver OBrowser=null;
	public static ActiTimePage oPage=null;

	public static void main(String[] args) {

		launchBrowser();
		navigate();
		loginasAdmin();
		createUser();
		logout();
		loginasuser1();
		logout();
		loginasuser2();
		logout();
		loginasuser3();
		logout();
		loginasAdmin();
		modifyPasswords();
		logout();
		loginasUser1();
		logout();
		loginasUser2();
		logout();
		loginasUser3();
		logout();
		loginasAdmin();
		deleteUsers();
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
	private static void loginasAdmin()
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

			oPage.getAdduser().click();
			Thread.sleep(1000);
			oPage.getFirstname().sendKeys("Demo");
			oPage.getLastname().sendKeys("user2");
			oPage.getEmail().sendKeys("demouser2@gmail.com");
			oPage.getUsername().sendKeys("DemoUser2");
			oPage.getcreatePassword().sendKeys("Welcome234");
			oPage.getretypePassword().sendKeys("Welcome234");
			oPage.getCreateUser().click();
			Thread.sleep(2000);

			oPage.getAdduser().click();
			Thread.sleep(1000);
			oPage.getFirstname().sendKeys("Demo");
			oPage.getLastname().sendKeys("user3");
			oPage.getEmail().sendKeys("demouser3@gmail.com");
			oPage.getUsername().sendKeys("DemoUser3");
			oPage.getcreatePassword().sendKeys("Welcome456");
			oPage.getretypePassword().sendKeys("Welcome456");
			oPage.getCreateUser().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginasuser1()
	{
		try
		{
			oPage.getUserName().sendKeys("DemoUser1");
			Thread.sleep(1000);
			oPage.getPassword().sendKeys("Welcome123");
			Thread.sleep(1000);
			oPage.getLoginButton().click();
			Thread.sleep(4000);
			oPage.getexploreActiTime().click();
			Thread.sleep(4000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void loginasuser2()
	{
		try
		{
			oPage.getUserName().sendKeys("DemoUser2");
			oPage.getPassword().sendKeys("Welcome234");
			oPage.getLoginButton().click();
			Thread.sleep(4000);
			oPage.getexploreActiTime().click();
			Thread.sleep(4000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void loginasuser3()
	{
		try
		{
			oPage.getUserName().sendKeys("DemoUser3");
			oPage.getPassword().sendKeys("Welcome456");
			oPage.getLoginButton().click();
			Thread.sleep(4000);
			oPage.getexploreActiTime().click();
			Thread.sleep(4000);

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
	private static void modifyPasswords()
	{
		try
		{
			oPage.getUser().click();
			Thread.sleep(1000);
			oPage.getuserDemo1().click();
			Thread.sleep(1000);
			oPage.getcreatePassword().sendKeys("demouser1");
			oPage.getretypePassword().sendKeys("demouser1");
			Thread.sleep(2000);
			oPage.getmodifysaveChanges().click();
			Thread.sleep(2000);

			oPage.getuserDemo2().click();
			Thread.sleep(1000);
			oPage.getcreatePassword().sendKeys("demouser2");
			oPage.getretypePassword().sendKeys("demouser2");
			Thread.sleep(4000);
			oPage.getmodifysaveChanges().click();;
			Thread.sleep(2000);

			oPage.getuserDemo3().click();
			Thread.sleep(1000);
			oPage.getcreatePassword().sendKeys("demouser3");
			oPage.getretypePassword().sendKeys("demouser3");
			Thread.sleep(4000);
			oPage.getmodifysaveChanges().click();;
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginasUser1()
	{
		try
		{
			oPage.getUserName().sendKeys("DemoUser1");
			Thread.sleep(1000);
			oPage.getPassword().sendKeys("demouser1");
			Thread.sleep(1000);
			oPage.getLoginButton().click();
			Thread.sleep(4000);


		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void loginasUser2()
	{
		try
		{
			oPage.getUserName().sendKeys("DemoUser2");
			oPage.getPassword().sendKeys("demouser2");
			oPage.getLoginButton().click();
			Thread.sleep(4000);


		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void loginasUser3()
	{
		try
		{
			oPage.getUserName().sendKeys("DemoUser3");
			oPage.getPassword().sendKeys("demouser3");
			oPage.getLoginButton().click();
			Thread.sleep(4000);


		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteUsers()
	{
		try
		{
			oPage.getUser().click();
			Thread.sleep(1000);
			oPage.getuserDemo1().click();
			Thread.sleep(1000);
			oPage.getdeleteuser().click();
			Alert oAlert1=OBrowser.switchTo().alert();
			String content1=oAlert1.getText();
			System.out.println(content1);
			oAlert1.accept();
			Thread.sleep(1000);

			oPage.getuserDemo2().click();
			Thread.sleep(1000);
			oPage.getdeleteuser().click();
			Alert oAlert2=OBrowser.switchTo().alert();
			String content2=oAlert2.getText();
			System.out.println(content2);
			oAlert2.accept();
			Thread.sleep(1000);

			oPage.getuserDemo3().click();
			Thread.sleep(1000);
			oPage.getdeleteuser().click();
			Alert oAlert3=OBrowser.switchTo().alert();
			String content3=oAlert3.getText();
			System.out.println(content3);
			oAlert3.accept();
			Thread.sleep(1000);


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


