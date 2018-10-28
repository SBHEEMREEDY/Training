package sai;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;


public class Calling {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		String x=sc.nextLine();
		//provide detials of avd and app
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName", "emulator-5554");	
		dc.setCapability("platformName", "android");
		dc.setCapability("platformVersion", "4.2.2");
dc.setCapability("appPackage", "com.android.contacts");
dc.setCapability("appActivity","com.android.contacts.activities.DialtactsActivity");
//start appium server
Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4723\"");
		URL u=new URL("http://0.0.0.0:4723/wd/hub");
		AndroidDriver driver=null;
		while(2>1)
		{
			try
			{
				driver=new AndroidDriver(u,dc);
				break;
				
			}
	 catch(Exception ex) 
			{
			}
			
		}
	}
}
		 
		

