package testCases;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC002Test {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		launchApplication();

	}
	
	
	static void launchApplication() throws InterruptedException {
		driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=4517801418435204947&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9192772&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("watch");
	    
	    List<WebElement> watches = driver.findElements(By.xpath(""));
	    
	}
	
	
	

}
