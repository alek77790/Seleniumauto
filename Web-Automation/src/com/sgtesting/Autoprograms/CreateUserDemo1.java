package com.sgtesting.Autoprograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateUserDemo1 {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		LaunchBrowser();
		Navigate();
		Login();
		CreateUser();
		DeleteUser();
		logout();
		closeApplication();
	}
	
public static void LaunchBrowser()
{
	try
	{
		System.setProperty("webdriver.chrome.driver","D:\\ECLIPSE TOOL\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
		oBrowser=new ChromeDriver();
	}catch (Exception e)
	{
		e.printStackTrace();
	}
	}
public static void Navigate() 
{
	try
	{
		oBrowser.get("http://localhost:81/login.do");
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
public static void Login()
{
	try
	{
		oBrowser.findElement(By.id("username")).sendKeys("admin");
		oBrowser.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(4000);
	}catch(Exception e)
	{
		e.printStackTrace();
		
	}
}
public static void CreateUser()
{
	try
	{
		oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.name("firstName")).sendKeys("demo");
		oBrowser.findElement(By.name("lastName")).sendKeys("User1");
		oBrowser.findElement(By.name("email")).sendKeys("demouser1@gmail.com");
		oBrowser.findElement(By.name("username")).sendKeys("demoUser1");
		oBrowser.findElement(By.name("password")).sendKeys("Welcome123");
		oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome123");
		oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
		Thread.sleep(3000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
public static void DeleteUser()
{
	try
	{
	oBrowser.findElement(By.xpath("//span[text()='User1, demo']")).click();
	Thread.sleep(2000);
	oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
	Thread.sleep(2000);
	Alert oAlert=oBrowser.switchTo().alert();
	String content=oAlert.getText();
	System.out.println(content);
	oAlert.accept();
	Thread.sleep(2000);
} catch (Exception e)
{
	e.printStackTrace();
}
}
private static void logout()
{
	try
	{
		oBrowser.findElement(By.id("logoutLink")).click();
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




