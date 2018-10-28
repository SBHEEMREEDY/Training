package sai;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) throws InterruptedException {
		System. setProperty("webdriver.chrome.driver", "D:\\sai\\chromedriver.exe");
		// Initialize browser.
		WebDriver driver=new ChromeDriver();
driver.get("http://www.way2sms.com/content/index.html?");
Thread.sleep(5000);
driver.navigate().to("https://accounts.google.com");
Thread.sleep(5000);
driver.navigate().back();
driver.navigate().forward();
driver.navigate().refresh();
driver.close();

	}

}
