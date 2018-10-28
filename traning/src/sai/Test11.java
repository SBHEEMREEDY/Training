package sai;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test11 {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a word");
		String x=sc.nextLine();
		System.out.println("enter expected suugestion");
		String y=sc.nextLine();		
		System. setProperty("webdriver.chrome.driver", "D:\\sai\\chromedriver.exe");
		// Initialize browser.
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		Thread.sleep(5000);
		//enter text into auto complete
		// to get a suggestion
		WebElement e=driver.findElement(By.name("q"));
		Actions a=new Actions(driver);
		a.sendKeys(e, x).build().perform();
		Thread.sleep(5000);
		int c=0;
		while(2>1)
		{
			a.sendKeys(Keys.DOWN).build().perform();
			c=c+1;
			String z=e.getAttribute("value");
			if(z.equals(y))
			{
				System.out.println("item is found");
				a.sendKeys(Keys.ENTER).build().perform();
				break;
				
			}
				
			if(c==10)
			{
				System.out.println("sorry");
				break;
				
			}
			driver.close();
			
		}
		
		

	}

}
