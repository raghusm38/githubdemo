package com.bjs.Aytomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.shadi.com");
		WebElement join=driver.findElement(By.linkText("Join Now"));
		join.click();
		WebElement education=driver.findElement(By.cssSelector("select[id^='ddlEdu']"));
		Select s=new Select(education);
		s.selectByVisibleText("Masters");
		
	}

}
