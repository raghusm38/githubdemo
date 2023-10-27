package com.bjs.Aytomation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		driver.findElement(By.linkText("Learn more")).click();
		System.out.println("parent tab "+driver.getWindowHandle());
		Set<String> allTabs=driver.getWindowHandles();
		for(String x: allTabs)
		{
			System.out.println(x);
			driver.switchTo().window(x);
		}
		driver.findElement(By.linkText("Use Chrome with multiple profiles")).click();

	}

}
