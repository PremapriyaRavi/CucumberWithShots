package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//div[@class='clf acc_head']/i")
	private WebElement logIcon;
	@FindBy(xpath="(//a[text()='Sign In'])[2]")
	private WebElement signBtn;
	@FindBy(id="email")
	private WebElement txtEmail;
	@FindBy(id="password")
	private WebElement txtPass;
	@FindBy(id="login-button")
	private WebElement logBtn;
	public WebElement getTxtEmail() {
		return txtEmail;
	}
	public WebElement getLogIcon() {
		return logIcon;
	}
	public WebElement getSignBtn() {
		return signBtn;
	}
	public WebElement getTxtPass() {
		return txtPass;
	}
	public WebElement getLogBtn() {
		return logBtn;
	}	
}
