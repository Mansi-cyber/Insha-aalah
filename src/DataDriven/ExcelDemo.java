package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelDemo {
String uname,path,pass;
int c;
	public void getData() throws IOException
{
		path = System.getProperty("user.dir")+"\\Browser\\chromedriver.exe";	

		System.setProperty("webdriver.chrome.driver", path);

		WebDriver drive=new ChromeDriver();

		drive.get("https://www.facebook.com/");
		
	FileInputStream fis= new FileInputStream("D:\\SelMansi\\LoginData.xlsx");
	
	XSSFWorkbook wb= new XSSFWorkbook(fis);
	XSSFSheet sheet=wb.getSheet("Login");
	
//	System.out.println("Total rows are :- "+sheet.getLastRowNum());//To pick the number of rows from EXcel
//	c=sheet.getLastRowNum();
//		
//	
//	XSSFRow row =sheet.getRow(2);
//	XSSFCell cell=row.getCell(0);
	
	for(int i=1;i<=sheet.getLastRowNum();i++)
	{
		XSSFRow row1 = sheet.getRow(i);

	     uname=row1.getCell(0).toString();
	    //System.out.println(uname+" ");
	     drive.findElement(By.id("email")).clear();
	     drive.findElement(By.id("email")).sendKeys(uname);
	    pass=row1.getCell(1).toString();
	    drive.findElement(By.id("pass")).clear();
	    drive.findElement(By.id("pass")).sendKeys(pass);
	    drive.findElement(By.id("loginbutton")).click();
	    drive.navigate().back();
	   // System.out.println(pass);  	

	    }

	}	
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcelDemo oo=new ExcelDemo();
		oo.getData();
	}

}
