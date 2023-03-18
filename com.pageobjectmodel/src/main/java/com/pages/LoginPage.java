package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.objectRepo.LoginObjectRepo;

public class LoginPage extends LoginObjectRepo {
	
	WebDriver driver;
	// Seperate class for each page/Screen
	// link
	
//	@FindBy(id="email")
	//public WebElement email;
	
	//@FindBy(id="password")
//	public WebElement pass;
	
	//@FindBy(xpath="//button")
	//public WebElement button;
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void loginToApplication() {
		email.sendKeys("kiran@gmail.com");
		pass.sendKeys("123456");
		button.click();
	}
	

}
