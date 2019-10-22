package AlertDemos;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class DragandDrop {

public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub
String path;


path=System.getProperty("user.dir")+"\\Browser\\chromedriver.exe";
System.out.println(path);
System.setProperty("webdriver.chrome.driver",path);

WebDriver driver=new ChromeDriver();

driver.get("https://jqueryui.com");


driver.findElement(By.xpath("//*[@id='sidebar']/aside[1]/ul/li[2]/a")).click();

Actions act=new Actions(driver);
driver.switchTo().frame(0);
Thread.sleep(5000);
act.clickAndHold(driver.findElement(By.id("draggable"))).
moveToElement(driver.findElement(By.id("droppable")))
.release()
.build().perform();
//act.dragAndDrop(driver.findElement(By.xpath("//*[@id='draggable']/p")), driver.findElement(By.xpath("//*[@id='droppable']")).build().perform();
}

}
