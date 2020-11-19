package firmLead_TechnicalInterview;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPage_ForgetPass {

public String baseUrl = "https://demo.combyne.ag/login";
	public static WebDriver driver;

	@BeforeTest
	public void landingPage() {
		// initialize chromedriver
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.combyne.ag/login");
	}

	@AfterTest
	public void TerminateDriver() {
		driver.close();

	}

	@AfterMethod
	public void BackToLandingPage() {
		driver.navigate().to("https://demo.combyne.ag/login");
	}

	@Test(priority = 1)
	
	public void Forget_Password_Linkfunctionality() {

		driver.findElement(By.xpath("//div[contains(text(),'Forgot your password?')]")).click();
		String CurrentUrl = driver.getCurrentUrl();
		if (baseUrl == CurrentUrl) {
			Assert.fail();
		}
	}
	
	@Test(priority = 2)
	public void Forget_Password_funct() {

		driver.findElement(By.xpath("//div[contains(text(),'Forgot your password?')]")).click();
		String CurrentUrl = driver.getCurrentUrl();
		if (baseUrl == CurrentUrl) {
			Assert.fail();
		}
	}
	
	
	
		
	
}
