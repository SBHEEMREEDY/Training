package sai;
 
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test10 {

	public static void main(String[] args) throws InterruptedException {
		System. setProperty("webdriver.chrome.driver", "D:\\sai\\chromedriver.exe");
		// Initialize browser.
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		WebElement e=driver.findElement(By.name("q"));
		Actions a=new Actions(driver);
		a.sendKeys(e, "sunny").build().perform();
		Thread.sleep(5000);
		for(int i=1;i<=6;i++)
		{
			a.sendKeys(Keys.DOWN).build().perform();
			
		}
	a.sendKeys(Keys.ENTER).build().perform();
	driver.close();
	
		

	}

}
