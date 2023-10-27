package com.bjs.Aytomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver cdriver=new ChromeDriver();
		cdriver.get("https://www.amazon.in");
		cdriver.manage().window().maximize();
WebElement bookB=cdriver.findElement(By.linkText("Books"));
bookB.click();

	}

}