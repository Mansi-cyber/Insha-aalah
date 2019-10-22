package Demo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorsDemo {
String path;

public void Local()
{
	int list;
path=System.getProperty("user.dir")+"\\Browser\\chromedriver.exe";	

System.setProperty("webdriver.chrome.driver", path);

WebDriver drive=new ChromeDriver();

drive.get("https://www.facebook.com/");


// Using id locator
//drive.findElement(By.id("email")).sendKeys("admin");
//drive.findElement(By.id("pass")).sendKeys("admin");
//drive.findElement(By.id("loginbutton")).click();

//
////Using name locator
//drive.findElement(By.name("email")).sendKeys("admin");
//drive.findElement(By.name("pass")).sendKeys("admin");
//drive.findElement(By.id("loginbutton")).click();

//drive.navigate().back();
//drive.findElement(By.name("firstname")).sendKeys("Mansi");
//drive.findElement(By.name("lastname")).sendKeys("Batra");
//drive.findElement(By.name("reg_email__")).sendKeys("9874563210");
//drive.findElement(By.name("reg_passwd__")).sendKeys("adjdfh");
//drive.findElement(By.name("birthday_day")).sendKeys("14");
//drive.findElement(By.name("birthday_month")).sendKeys("Mar");
//drive.findElement(By.name("birthday_year")).sendKeys("1995");
//Select st=new Select(drive.findElement(By.id("day")));
//st.selectByIndex(4);


//Xpath
//drive.findElement(By.xpath("//input[@type='email']")).sendKeys("man");
//
//drive.findElement(By.xpath("//input[@value='1']")).click(); // Selecting Gender

//drive.findElement(By.xpath("//input[contains@id,'u_0']")).click();


//locate by class name
//drive.findElement(By.className("inputtext")).sendKeys("admin");
//drive.findElement(By.className("inputtext")).sendKeys("admin123");

////Locate element through link
//drive.findElement(By.linkText("Forgotten account?")).click();
//String title=drive.getTitle();
//System.out.println(title);

////Locate element through partiallink
//drive.findElement(By.partialLinkText("account?")).click();
//drive.close();

//By Tagname
//ArrayList<WebElement> al=(ArrayList<WebElement>) drive.findElements(By.tagName("a")); //WebElemet class, ArrayList interface
//System.out.println(al.size());
//
//for(int i=0;i<al.size();i++)
//{
//System.out.println(al.get(i).getText());	//Printing text in a tags
//}

//By Start function
//	drive.findElement(By.id("email")).sendKeys("admin");
//	drive.findElement(By.name("pass")).sendKeys("admin");
//	drive.findElement(By.xpath("//input[starts-with(@id,'u')]")).click();
//	drive.close();
	
//By Text function
//	drive.findElement(By.xpath("//a[text()='Create a Page']")).click();

//// By Ancestors
//ArrayList<WebElement> al=(ArrayList<WebElement>) drive.findElement(By.xpath("//*[@class='inputtext']//ancestor::div"));
//	System.out.println(al.size());
		
////By CSS
//drive.findElement(By.cssSelector("input#email[type='email'])).sendKeys("Admin");
drive.findElement(By.cssSelector("input#email[type='email']")).sendKeys("Admin");
//drive.findElement(By.cssSelector("input.inputtext")).sendKeys("Admin");

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocatorsDemo oo= new LocatorsDemo();
		oo.Local();
	}

}
