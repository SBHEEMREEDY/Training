package sai;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
		System. setProperty("webdriver.chrome.driver", "D:\\sai\\chromedriver.exe");
				// Initialize browser.
				WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
	}

}
