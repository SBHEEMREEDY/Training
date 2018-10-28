package sai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testguru {

	public static void main(String[] args) throws InterruptedException {
		System. setProperty("webdriver.chrome.driver", "D:\\sai\\chromedriver.exe");
		// Initialize browser.
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/V1/html/Managerhomepage.php");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'New Customer')]")).click();
		WebDriverWait w=new WebDriverWait(driver,100);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("name")));
		driver.findElement(By.name("name")).sendKeys("ravi");
		
		
		
	
	}

}
