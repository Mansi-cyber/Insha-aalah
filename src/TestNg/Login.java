package TestNg;

import java.util.ArrayList;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login extends DriverDemo {
	String str = "Welcome Admin";
	
	@BeforeClass
	
	public void Beforeclass()
	{
		System.out.println("Before Classsssssssssss");
	}
		
	@AfterClass
	public void Afterclass()
	{
		System.out.println("After Classsssssssssss");
	}	
		
	
	@org.testng.annotations.BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("Before Method");
		
	}
	
	@org.testng.annotations.AfterMethod
	public void AfterMethod()
	{
		System.out.println("After Method");		
	}
	
	
	
	
@Test 
public void login()
{
    drive.findElement(By.id("email")).sendKeys("Admin");
	drive.findElement(By.id("pass")).sendKeys("admin123");
	drive.findElement(By.id("loginbutton")).click();
	drive.navigate().back();
}

@Test 
public void check()
{
	ArrayList<WebElement> al=(ArrayList<WebElement>) drive.findElements(By.tagName("a")); //WebElemet class, ArrayList interface
	System.out.println(al.size());
	
	for(int i=0;i<al.size();i++)
	{
	System.out.println(al.get(i).getText());	//Printing text in a tags
	}	
}
}
