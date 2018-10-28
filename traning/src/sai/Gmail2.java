package sai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail2 {

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
//compose mail
driver.findElement(By.xpath("//*[@gh='cm']")).click();
driver.findElement(By.name("to")).sendKeys("saipruthvibheemreddy@gmail.com");
driver.findElement(By.name("subjectbox")).sendKeys("hi");
}}