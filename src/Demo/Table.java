package Demo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table 
{
	String path;
	int a;
	public void launch()
	{

		path=System.getProperty("user.dir")+"//Browser//chromedriver.exe";	
	System.out.println(path);
	
	System.setProperty("webdriver.chrome.driver",path); 
	
	WebDriver drive=new ChromeDriver();
	
	drive.get("file:///D:/New%20folder/table.html");
	
//	System.out.println(drive.findElement(By.xpath("//tr[@name='1']")).getText());
//	
//	System.out.println(drive.findElement(By.xpath("//tr[@name='2']")).getText());
//	
//	System.out.println(drive.findElement(By.xpath("//tr[@name='3']")).getText());
//	
//	System.out.println(drive.findElement(By.xpath("//tr[@name='4']")).getText());
//	
	
	ArrayList<WebElement> al=(ArrayList<WebElement>) drive.findElements(By.tagName("tr")); //WebElemet class, ArrayList interface
	a=al.size();
	for(int i=0;i<al.size();i++)
	{
		System.out.println(al.get(i).getText());
	}
	
	
	drive.close();
	
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Table oo= new Table();
		oo.launch();
	}

}
