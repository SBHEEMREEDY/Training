package sai;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.sikuli.script.ScreenImage;

public class Test8 {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		System. setProperty("webdriver.chrome.driver", "D:\\sai\\chromedriver.exe");
		// Initialize browser.
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		WebDriverWait w = new WebDriverWait(driver, 100);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='search']")));
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("vachaadayyo saami video song");
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='search-icon-legacy']//yt-icon[@class='style-scope ytd-searchbox']")));
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']//yt-icon[@class='style-scope ytd-searchbox']")).click();

		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Vachaadayyo Saami Full Video Song ')]")));
		driver.findElement(By.xpath("//*[contains(text(),'Vachaadayyo Saami Full Video Song ')]")).click();
        Screen S=new Screen();
       S.click("min.png");

	}
  
}
