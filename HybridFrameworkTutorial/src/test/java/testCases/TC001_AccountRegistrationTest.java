package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;

public class TC001_AccountRegistrationTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();		
	
	}
	
	@BeforeMethod
	public void teardown() {
		driver.quit();
	}
	
	@Test
	public void verify_Account_Registration() throws InterruptedException {
		//HomePage hp = new HomePage();
		HomePage.clckMyAccnt();
		HomePage.clckRegisterLink();
		Thread.sleep(3000);
		
		
		AccountRegistrationPage reg = new AccountRegistrationPage();	
		//reg.setFirstName(randomeString().toUpperCase());
		reg.setFirstName("abcd");
		reg.setLastName("pqrs");
		reg.setEmail("abcd@gmail.com");
		reg.setTelephone("8976549823");
		reg.setPassword("abcd1234");
		reg.setConfrmPassword("abcd1234");
		reg.checkPrivacyPolicy();
		reg.clickContinueBtn();
		
		String regMsg = reg.validateAccntCreationMsg();
		Assert.assertEquals(regMsg, "Your Account Has Been Created!");
		
	
	
	}
	
	public static void main(String[] args) {
		System.out.println("test");
	}

}
