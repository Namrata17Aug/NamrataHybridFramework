package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountRegistrationPage {
	WebDriver driver;
	
//	public AccountRegistrationPage(WebDriver driver) {
//		this.driver = driver;
//		PageFactory.initElements(driver, this);
//	
//		
//	}
	
	@FindBy(xpath="//input[@name='firstname']")
	WebElement txtFirstName;
	
	@FindBy(xpath="//input[@name='lastname']")
	WebElement txtLastName;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@name='telephone']")
	WebElement txtTelPhone;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@name='confirm']")
	WebElement txtConfrmPass;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement chkPrivacy;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btnContinue;
	
	@FindBy(xpath="//h1[text()='Your Account Has Been Created!']")
	WebElement vrfyAcntCreationMsg;
	
	
	public void setFirstName(String fname) {
		txtFirstName.sendKeys(fname);
	}
	
	public void setLastName(String lname) {
		txtLastName.sendKeys(lname);
	}
	
	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}
	
	public void setTelephone(String phone) {
		txtTelPhone.sendKeys(phone);
	}
	
	public void setPassword(String password) {
		txtPassword.sendKeys(password);
	}
	
	
	public void setConfrmPassword(String password) {
		txtConfrmPass.sendKeys(password);
	}
	
	public void checkPrivacyPolicy() {
		chkPrivacy.click();
	}
	
	public void clickContinueBtn() {
		btnContinue.click();
	}
	
	public String validateAccntCreationMsg() {
		try {
			return (vrfyAcntCreationMsg.getText());
			}
		catch(Exception e) {
			return (e.getMessage());
		}
		
	}
}