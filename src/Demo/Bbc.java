package Demo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bbc {
	String path;
	int a;
	public void launch()
	{

	path=System.getProperty("user.dir")+"//Browser//chromedriver.exe";	
	System.out.println(path);
	
	System.setProperty("webdriver.chrome.driver",path); 
	
	WebDriver drive=new ChromeDriver();

drive.get("https://www.bbc.com/");
	
	
	ArrayList<WebElement> al=(ArrayList<WebElement>) drive.findElements(By.className("media__link"));
	a=al.size();
	System.out.println(a);
	
	for(int i=0;i<al.size();i++)
	{
		
		System.out.println(al.get(i).getText());
	}
	
	
	drive.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bbc oo=new Bbc();
		oo.launch();
	}

}
