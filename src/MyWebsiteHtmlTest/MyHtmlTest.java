package MyWebsiteHtmlTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyHtmlTest {
	WebDriver driver = new ChromeDriver();

	@BeforeTest
	public void mySetup() {
		driver.get("http://127.0.0.1:5500/index.html");
		driver.manage().window().maximize();
	}

	@Test
	public void MyOwnWebsite() {

		WebElement UserNameInput = driver.findElement(By.id("input1"));
		WebElement paswordInput = driver.findElement(By.id("input2"));
		WebElement mobileNumberInput = driver.findElement(By.id("input3"));
		WebElement DateBirthInput = driver.findElement(By.id("input4"));

		UserNameInput.sendKeys("Hussein");
		paswordInput.sendKeys("mahasneh123");
		mobileNumberInput.sendKeys("798684127");
		DateBirthInput.sendKeys("1/28/1999");

		WebElement SubmitButton = driver.findElement(By.xpath("//button[@type='submit']"));

		SubmitButton.click();
		WebElement FacebookButton = driver.findElement(By.linkText("our facebook page"));
		FacebookButton.click();
		//WebElement InstagramkButton = driver.findElement(By.partialLinkText("instagram"));
		//InstagramkButton.click();
	}

}
