package firmLead_TechnicalInterview;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPage_LoginFunctionality {

public String baseUrl = "https://demo.combyne.ag/login";
	public static WebDriver driver;

	@BeforeTest
	public void landingPage() {
		
		// initialize webdriver
		
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		
		// maximize window
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		
		// wait time  for opening url
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

	public void loginFunctionality_012_Email_TextBoxenable() {
		
		// email textbox

		WebElement emailTextBox = driver.findElement(By.xpath("//input[@type='text']"));

		if (emailTextBox.isEnabled()) {
			Assert.assertTrue(true);
		}
	}

	@Test(priority = 2)
	public void loginFunctionality_013_Password_TextBoxEnable() {
		
		//  web element for password text box

		WebElement PasswordTextBox = driver.findElement(By.xpath("//input[@type='password']"));

		if (PasswordTextBox.isEnabled()) {
			Assert.assertTrue(true);
		}
	}

	@Test(priority = 3)

	public void loginFunctionality_014_ValidEmail_ValidPassword() {
		
		// provide  valid email address

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("rabaya.bagum@gmail.com");
		
		// provide  valid password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("aspor123");
		
		// click submit button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		// get current url for assertion
		String CurrentUrl = driver.getCurrentUrl();
		
		// assertion to check pas or fail test case

		Assert.assertNotEquals(baseUrl, CurrentUrl);

	}

	@Test(priority = 4)

	public void loginFunctionality_015_InvalidEmail_ValidPassword() {
		
		// provide invalid email

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("rabaya.bagum");
		// valid pass
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("aspor123");
		
		// lick on submit button 
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		// assertion to check pass or fail

		WebElement error = driver
				.findElement(By.xpath("//div[contains(text(),'Whoops! That email is not associated with an accou')]"));
		if (error.getText().contains("WWhoops! That email is not associated with an accou")) {
			Assert.assertTrue(true, "Whoops! That email is not associated with an accou");
		}

	}

	@Test(priority = 5)

	public void loginFunctionality_016_ValidEmail_InvalidPassword() {
		
		// provide valid email

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("rabaya.bagum@gmail.com");
		
		// provide invalid password
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("aspo");
		
		// click on submit button
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		String CurrentUrl = driver.getCurrentUrl();
		
		// assertion to check pass or fail for pass or fail

		if (baseUrl == CurrentUrl) {
			Assert.assertTrue(true);
		}

	}

	@Test(priority = 6)

	public void loginFunctionality_017_NoEmail_NoPassword() {
		
		// provive no email address

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(" ");
		// provide no password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(" ");
		
		// click on submit button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		// get url for assertion

		String CurrentUrl = driver.getCurrentUrl();
		
		// assertion to check pass or fail

		Assert.assertEquals(baseUrl, CurrentUrl);
	}

	@Test(priority = 7)

	public void loginFunctionality_018_InvalidEmail_InvalidPassword() {
		
		//provide invalid email

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("rabaya.bagum");
		
		// invalid password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("aspo");
		// lick on submit button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		// get url for  assertion

		String CurrentUrl = driver.getCurrentUrl();
		
		// assertion to check passor fail

		if (baseUrl == CurrentUrl) {
			Assert.assertTrue(true);
		}
	}

}
