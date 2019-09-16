package tooltip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HelptextClass {
	
  @Test
  public void TooltipTest() {
	  
	  WebDriverManager.chromedriver().setup();
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://seleniumpractise.blogspot.com/2019/08/tooltip-in-selenium-or-help-text-example.html");
	  
	  Actions act = new Actions(driver);
	  
	  act.moveToElement(driver.findElement(By.xpath(".//div[@class='tooltip']"))).perform();
	  
	  String str = driver.findElement(By.xpath(".//span[@class='tooltiptext']")).getText();
	  
	  System.out.println(str);
	  
	  Assert.assertTrue(str.contains("Tooltip text"));
	  
	  /*
	   * For Element who seen in some seconds and disappear
	   * for them go to source 
	   * click on action and click f8
	   * that will pause in debugger
	   * go to element and find the element 
	   */
	  
  }
}
