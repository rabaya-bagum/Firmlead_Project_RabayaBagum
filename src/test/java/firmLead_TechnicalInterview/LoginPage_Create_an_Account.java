package firmLead_TechnicalInterview;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPage_Create_an_Account {

	public String baseUrl = "https://demo.combyne.ag/login";
	public static WebDriver driver;

	@BeforeTest
	public void landingPage() {
		// initialize
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		// maximixe window
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		// wait time for url
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

	public void LoginPage_CreateAnAccount_001_Clicking_link() {

		// click on create an account link

		driver.findElement(By.xpath("//span[contains(text(),'Create an Account')]")).click();
		String CurrentUrl = driver.getCurrentUrl();

		// get a onboard current url

		System.out.println("Create an Account onboard url :" + driver.getCurrentUrl());

		if (CurrentUrl.contains("onboard")) {
			Assert.assertTrue(true);
		}

	}

	@Test(priority = 2)

	public void LoginPage_CreateAnAccount_002_Valid_FirstName_LastName_Email() {
		// click on login link
		driver.findElement(By.xpath("//span[contains(text(),'Create an Account')]")).click();

		String OnboardUrl = driver.getCurrentUrl();

		// provide First name
		driver.findElement(By.xpath(
				"//body/div[@id='ui']/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]/fieldset[1]/div[1]/input[1]"))
				.sendKeys("Rabaya");
		// provide last name
		driver.findElement(By.xpath(
				"//body/div[@id='ui']/div[1]/div[1]/form[1]/div[1]/div[3]/div[2]/div[1]/div[1]/fieldset[1]/div[1]/input[1]"))
				.sendKeys("bagum");
		// provide email address
		driver.findElement(By.xpath(
				"//body/div[@id='ui']/div[1]/div[1]/form[1]/div[1]/div[3]/div[3]/div[1]/div[1]/fieldset[1]/div[1]/input[1]"))
				.sendKeys("rabaya.bagum@gmail.com");

		// click on next button

		driver.findElement(By.xpath("//input[@type='submit']")).click();

		String CurrentUrl = driver.getCurrentUrl();

		// assertion for the testcase pass or fail

	Assert.assertNotEquals(OnboardUrl, CurrentUrl);

	}

	@Test(priority = 3)

	public void LoginPage_CreateAnAccount_003_Valid_FirstName_validEmail() {

		// click on login link
		driver.findElement(By.xpath("//span[contains(text(),'Create an Account')]")).click();

		String OnboardUrl = driver.getCurrentUrl();

		// provide First name
		driver.findElement(By.xpath(
				"//body/div[@id='ui']/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]/fieldset[1]/div[1]/input[1]"))
				.sendKeys("Rabaya");

		// provide email address
		driver.findElement(By.xpath(
				"//body/div[@id='ui']/div[1]/div[1]/form[1]/div[1]/div[3]/div[3]/div[1]/div[1]/fieldset[1]/div[1]/input[1]"))
				.sendKeys("rabaya.bagum@gmail.com");

		// click on next button

		driver.findElement(By.xpath("//input[@type='submit']")).click();

		String CurrentUrl = driver.getCurrentUrl();

		// assertion for the testcase pass or fail

		Assert.assertEquals(OnboardUrl, CurrentUrl);

	}

	@Test(priority = 4)

	public void LoginPage_CreateAnAccount_004_Valid_FirstName_validlastname() {

		// click on login link
		driver.findElement(By.xpath("//span[contains(text(),'Create an Account')]")).click();

		String OnboardUrl = driver.getCurrentUrl();

		// provide First name
		driver.findElement(By.xpath(
				"//body/div[@id='ui']/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]/fieldset[1]/div[1]/input[1]"))
				.sendKeys("Rabaya");

		// provide last name
		driver.findElement(By.xpath(
				"//body/div[@id='ui']/div[1]/div[1]/form[1]/div[1]/div[3]/div[2]/div[1]/div[1]/fieldset[1]/div[1]/input[1]"))
				.sendKeys("bagum");

		// click on next button

		driver.findElement(By.xpath("//input[@type='submit']")).click();

		String CurrentUrl = driver.getCurrentUrl();

		// assertion for the testcase pass or fail

		Assert.assertEquals(OnboardUrl, CurrentUrl);

	}

	@Test(priority = 5)

	public void LoginPage_CreateAnAccount_005_NoCredentials() {
		
		// click on login link
		driver.findElement(By.xpath("//span[contains(text(),'Create an Account')]")).click();

		String OnboardUrl = driver.getCurrentUrl();

		// provide no First name
		driver.findElement(By.xpath(
				"//body/div[@id='ui']/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]/fieldset[1]/div[1]/input[1]"))
				.sendKeys("");
		// provide no last name
		driver.findElement(By.xpath(
				"//body/div[@id='ui']/div[1]/div[1]/form[1]/div[1]/div[3]/div[2]/div[1]/div[1]/fieldset[1]/div[1]/input[1]"))
				.sendKeys("");
		// provide no email address
		driver.findElement(By.xpath(
				"//body/div[@id='ui']/div[1]/div[1]/form[1]/div[1]/div[3]/div[3]/div[1]/div[1]/fieldset[1]/div[1]/input[1]"))
				.sendKeys("");

		// click on next button

		driver.findElement(By.xpath("//input[@type='submit']")).click();

		String CurrentUrl = driver.getCurrentUrl();

		// assertion for the testcase pass or fail

		Assert.assertEquals(OnboardUrl, CurrentUrl);

	}
	
	@Test(priority = 6)

	public void LoginPage_CreateAnAccount_006_FirstName() {
		
		// click on login link
		driver.findElement(By.xpath("//span[contains(text(),'Create an Account')]")).click();

		String OnboardUrl = driver.getCurrentUrl();

		// provide First name only
		
		driver.findElement(By.xpath(
				"//body/div[@id='ui']/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]/fieldset[1]/div[1]/input[1]"))
				.sendKeys("rabaya");
		

		// click on next button

		driver.findElement(By.xpath("//input[@type='submit']")).click();

		String CurrentUrl = driver.getCurrentUrl();

		// assertion for the testcase pass or fail

		Assert.assertEquals(OnboardUrl, CurrentUrl);

	}
	
	@Test(priority = 7)

	public void LoginPage_CreateAnAccount_007_LastName() {
		
		// click on login link
		driver.findElement(By.xpath("//span[contains(text(),'Create an Account')]")).click();

		String OnboardUrl = driver.getCurrentUrl();

		
		// provide no last name
		driver.findElement(By.xpath(
				"//body/div[@id='ui']/div[1]/div[1]/form[1]/div[1]/div[3]/div[2]/div[1]/div[1]/fieldset[1]/div[1]/input[1]"))
				.sendKeys("bagum");
		
		// click on next button

		driver.findElement(By.xpath("//input[@type='submit']")).click();

		String CurrentUrl = driver.getCurrentUrl();

		// assertion for the testcase pass or fail

		Assert.assertEquals(OnboardUrl, CurrentUrl);

	}
	
	@Test(priority = 8)

	public void LoginPage_CreateAnAccount_008_Email() {
		
		// click on login link
		driver.findElement(By.xpath("//span[contains(text(),'Create an Account')]")).click();

		String OnboardUrl = driver.getCurrentUrl();

		
		// provide email address
		
		driver.findElement(By.xpath(
				"//body/div[@id='ui']/div[1]/div[1]/form[1]/div[1]/div[3]/div[3]/div[1]/div[1]/fieldset[1]/div[1]/input[1]"))
				.sendKeys("rabaya.bagum2gmail.com");

		// click on next button

		driver.findElement(By.xpath("//input[@type='submit']")).click();

		String CurrentUrl = driver.getCurrentUrl();

		// assertion for the testcase pass or fail

		Assert.assertEquals(OnboardUrl, CurrentUrl);

	}
	
	
}
