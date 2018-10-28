package sai;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTestNG {
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
    String driverPath = "D:\\\\sai\\\\chromedriver.exe";
    public WebDriver driver ;
  @Test
  public void f {
	  System.out.println("launching firefox browser"); 
      System.setProperty("webdriver.firefox.marionette", driverPath);
      driver = new ChromeDriver();
      driver.get(baseUrl);
  }
  @Test(priority = 1)
  public void z() {
      String expectedTitle = "Welcome: Mercury Tours";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
      driver.close();
	  
  }
}
