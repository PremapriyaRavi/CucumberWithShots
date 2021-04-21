package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class RegistrationPage extends BaseClass{
	//if we r not wish to extends the baseclass then we can use another way that is...
	//passing driver as arguments 
	public RegistrationPage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[text()='Join']")
	private WebElement joinNew;
	@FindBy(xpath="//a[@class='darkred']")
	private WebElement regBtn;
	@FindBy(xpath="//input[@id='reg-email']")
	private WebElement regEmail;
	@FindBy(xpath="//input[@id='reg-password']")
	private WebElement regPass;
	@FindBy(xpath="//input[@id='reg-confirmpassword']")
	private WebElement confirmPW;
	@FindBy(xpath="//input[@id='reg-button']")
	private WebElement createBtn;
	public WebElement getRegBtn() {
		return regBtn;
	}
	public WebElement getJoinNew() {
		return joinNew;
	}
	public WebElement getRegEmail() {
		return regEmail;
	}
	public WebElement getRegPass() {
		return regPass;
	}
	public WebElement getConfirmPW() {
		return confirmPW;
	}
	public WebElement getCreateBtn() {
		return createBtn;
	}
	public void fillDetails(String email,String pass,String confirmpw) {
		click(getJoinNew());
		click(getRegBtn());
		insert(getRegEmail(),email);
		insert(getRegPass(),pass);
		insert(getConfirmPW(),confirmpw );
	}

}
