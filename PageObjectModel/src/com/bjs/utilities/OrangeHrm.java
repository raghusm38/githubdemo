package com.bjs.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import com.bjs.orangehrm.Homepage;
import com.bjs.orangehrm.Login;

public class OrangeHrm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Login l=new Login(d);
		l.typeUsername();
		l.typePassword();
		l.clickSubmitButton();
		Homepage h=new Homepage(d);
		Thread.sleep(5000);
		h.clickoInc();

	}

}
