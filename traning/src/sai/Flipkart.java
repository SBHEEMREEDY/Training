package sai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		System. setProperty("webdriver.chrome.driver", "D:\\sai\\chromedriver.exe");
		// Initialize browser.
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("puma");
		Thread.sleep(5000);
		driver.findElement(By.className("ccc_2AkmmA _29YdH8")).click();
		Thread.sleep(5000  );
		driver.findElement(By.xpath("//*[@viewBox='0 0 17 18']")).click();

	}

}
