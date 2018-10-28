package sai;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test13 {

	public static void main(String[] args) throws InterruptedException {
		System. setProperty("webdriver.chrome.driver", "D:\\sai\\chromedriver.exe");
		// Initialize browser.
		WebDriver driver=new ChromeDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		Thread.sleep(5000);
		//open drop down
		Actions a=new Actions(driver);
		WebElement e=driver.findElement(By.xpath("(//*[@class='ui dropdown'])[1]"));
		a.click(e).build().perform();
	Thread.sleep(5000);
	List<WebElement> l1=driver.findElements(By.xpath("//div[@class='menu transition visible']/div"));
	System.out.println(l1.size());
	for(int i=0;i<l1.size();i++)
	{
		System.out.println(l1.get(i).getText());
		
	}
	driver.findElement(By.xpath("//div[@class='menu transition visible']/div[4]")).click();
		
	}

}
