package com.java.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Navigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\Raghav KM\\Downloads\\selenium software\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.youtube.com");
		WebElement search=driver.findElement(By.cssSelector("input#search"));
		search.sendKeys("songs");
		WebElement go=driver.findElement(By.cssSelector("button#search-icon-legacy"));
		go.click();
		WebElement play=driver.findElement(By.id("video-title"));
		play.click();
}
}
