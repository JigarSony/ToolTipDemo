package tooltip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TooltipClass {
	
  @Test
  public void TooltipTest() {
	  
	  WebDriverManager.chromedriver().setup();
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://seleniumpractise.blogspot.com/2019/09/bootstrap-tooltip-in-selenium.html");
	  
	  Actions act = new Actions(driver);
	  
	  act.moveToElement(driver.findElement(By.xpath(".//a[text()='Hover over me']"))).perform();
	  
	  String str = driver.findElement(By.xpath(".//div[@class='tooltip-inner']")).getText();
	  
	  System.out.println(str);
	  
	  Assert.assertTrue(str.contains("Hooray"));
	  
	  /*
	   * For Element who seen in some seconds and disappear
	   * for them go to source 
	   * click on action and click f8
	   * that will pause in debugger
	   * go to element and find the element 
	   */
	  
  }
}
