package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.LoginPage;

public class LoginTest {
	
	WebDriver driver;
	LoginPage Ip;
	
	@BeforeMethod
	public  void correctCred() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("E:/SeleniyamSoftewre/javabykiran-Selenium-Softwares%20(2)/Offline%20Website/index.html");
		driver.manage().window().maximize();
		Ip=new LoginPage(driver);
	}
	@Test
	public void  verifyTitalofNextPage() {
		Ip.loginToApplication();
		Assert.assertEquals(driver.getTitle(),"JavaByKiran | Dashboard");
	}

}
