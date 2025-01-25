package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public static WebDriver driver;
//	public HomePage(WebDriver driver) {
//		this.driver = driver;
//		PageFactory.initElements(driver, this);
//	}
	
	//@FindBy(xpath="//span[normalise-space()='My Account']")
	 static WebElement linkHome = driver.findElement(By.xpath("//span[normalise-space()='My Account']"));
	
	//@FindBy(xpath="//a[normalise-space()='Register']")
	static WebElement lnkRegister = driver.findElement(By.xpath("//a[normalise-space()='Register']"));
	
	
	public static void clckMyAccnt() {
		linkHome.click();
	}
	
	public static void clckRegisterLink() {
		lnkRegister.click();
	}

}
