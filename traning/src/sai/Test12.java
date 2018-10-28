package sai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test12 {

	public static void main(String[] args) throws InterruptedException {
		System. setProperty("webdriver.chrome.driver", "D:\\sai\\chromedriver.exe");
		// Initialize browser.
		WebDriver driver=new ChromeDriver();
		driver.get("http://jqueryui.com/slider/");
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		Actions a=new Actions(driver);
				WebElement e=driver.findElement(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		a.dragAndDropBy(e, 150, 0).build().perform();
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Vertical slider")).click();
	driver.switchTo().frame(0);
	WebElement q=driver.findElement(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default']"));
	a.dragAndDropBy(q,0,100).build().perform();
	
			
		

	}

}
