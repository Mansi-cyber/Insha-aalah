package Demo;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Zoopla {
	String path,c;
	int a;
		public void launch()
	{

	path=System.getProperty("user.dir")+"//Browser//chromedriver.exe";	
	System.out.println(path);
	
	System.setProperty("webdriver.chrome.driver",path); 
	
	WebDriver drive=new ChromeDriver();

drive.get("https://www.zoopla.co.uk/");
	

drive.findElement(By.id("search-input-location")).sendKeys("London");

drive.findElement(By.id("search-submit")).submit();

// Select drpPrice= new Select (drive.findElement(By.className("btn btn-search-refine-top js-btn-search-refine-top btn-search-refine-price icon icon-down-open-1 is-active")));
// drpPrice.selectByIndex(0);

// System.out.println(drive.findElement(By.className("listing-results-price text-price")));

c=drive.findElement(By.xpath("//li[@class='srp clearfix   ']")).getSize().toString();
System.out.println(c);




	
	drive.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zoopla oo= new Zoopla();
		oo.launch();
	}

}
