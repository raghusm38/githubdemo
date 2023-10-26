package com.java.Automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.Chrome.Driver", "C:\\Users\\Raghav KM\\Downloads\\selenium software\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver cdrive=new ChromeDriver();
		cdrive.get("https://www.gmail.com");
		Thread.sleep(5000);
		cdrive.close();
		// TODO Auto-generated method stub

	}

}
