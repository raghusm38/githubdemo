package com.bjs.Aytomation;

import org.openqa.selenium.chrome.ChromeDriver;

public class PageSource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver cdriver=new ChromeDriver();
		cdriver.get("https://www.fb.com");
		cdriver.manage().window().maximize();
		String pSource=cdriver.getPageSource();
		System.out.println(pSource);

	}

}
