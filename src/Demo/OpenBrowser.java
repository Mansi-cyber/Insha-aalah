package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import okhttp3.Challenge;

public class OpenBrowser {
	String title, exptitle="facebook",path;
public void Launch()
{
	//To get the browser path thru eclipse
path=System.getProperty("user.dir")+"//Browser//chromedriver.exe";	
	System.out.println(path);
	
	System.setProperty("webdriver.chrome.driver",path); // Setting path of Chrome driver
	
	
WebDriver driver=new ChromeDriver(); // Launch the browser

//driver.get("https://www.facebook.com/");  // launch the application on the browser

driver.navigate().to("https://www.facebook.com/");

title=driver.getTitle(); // To display the title of the page'

//driver.getPageSource(); // To display the page source

if(exptitle.equals(title))
{
System.out.println("You are on correct page");	
}
else
{
	System.out.println("Incorrect");
}

//driver.navigate().to("https://www.google.com/");
//driver.close(); // To close the browses automatically

// To maximize the window
driver.manage().window().maximize();

// Delete all cookies
driver.manage().deleteAllCookies();

}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OpenBrowser oo= new OpenBrowser();
		oo.Launch();
	}

}
