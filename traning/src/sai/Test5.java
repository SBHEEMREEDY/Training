package sai;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) throws InterruptedException {
		System. setProperty("webdriver.chrome.driver", "D:\\sai\\chromedriver.exe");
		// Initialize browser.
		WebDriver driver=new ChromeDriver();
		driver.get("https://gmail.com");
		Thread.sleep(5000);
driver.manage().window().maximize();
//do login
driver.findElement(By.name("identifier")).sendKeys("sppruthvi@gmail.com");
driver.findElement(By.xpath("//*[text()='Next']")).click();
Thread.sleep(5000);
driver.findElement(By.name("password")).sendKeys("abhiramo4");
driver.findElement(By.xpath("//*[text()='Next']")).click();
Thread.sleep(5000);
//go to 7 th mail in mailbox table and select checkbox
driver.findElement(By.xpath(("(//td[@id=':51']"))).click();
Thread.sleep(5000);
//delete mail
driver.findElement(By.xpath("//*[@gh='mtb']/div/div/child::div[2]/child::div[3]")).click();
Thread.sleep(5000);
//logout
driver.findElement(By.xpath("//*[contains(@title,'google')]/span")).click();
Thread.sleep(5000);
driver.findElement(By.linkText("Sign out")).click();
Thread.sleep(5000);
driver.close();
	}

}
