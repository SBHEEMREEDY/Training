package sai;






import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) throws InterruptedException {
		System. setProperty("webdriver.chrome.driver", "D:\\sai\\chromedriver.exe");
		// Initialize browser.
		WebDriver driver=new ChromeDriver();
driver.get("http://www.way2sms.com/content/index.html?");
driver.findElement(By.xpath("//*[@src='../images/android-button.png']")).click();
Thread.sleep(5000);
//get window handler
ArrayList<String> x = new ArrayList<String> (driver.getWindowHandles());
driver.switchTo().window(x.get(1));
Thread.sleep(5000);
driver.switchTo().window(x.get(0));


	}

}
