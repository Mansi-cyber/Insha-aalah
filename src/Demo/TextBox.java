package Demo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {
	String path;
	int a;
	public void launch()
	{

	path=System.getProperty("user.dir")+"//Browser//chromedriver.exe";	
	System.out.println(path);
	
	System.setProperty("webdriver.chrome.driver",path); 
	
	WebDriver drive=new ChromeDriver();
	
	drive.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&dsh=S-1458749771%3A1568351020599490&gmb=exp&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
	
	
	ArrayList<WebElement> al=(ArrayList<WebElement>) drive.findElements(By.tagName("input"));
	a=al.size();
	System.out.println(a);
	
	drive.close();
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextBox oo=new TextBox();
		oo.launch();
	}

}
