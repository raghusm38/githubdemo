package com.bjs.Aytomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver cdriver=new ChromeDriver();
		cdriver.get("https://www.fb.com");
		cdriver.manage().window().maximize();
WebElement fb=cdriver.findElement(By.name("pass"));
fb.sendKeys("raghusm38@gmail.com");

	}

}
