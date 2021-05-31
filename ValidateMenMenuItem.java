package testCases77BugsStore;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.base;

public class ValidateMenMenuItem extends base {
	public WebDriver driver;

	@BeforeTest
	public void testSetup() throws IOException {
		driver = setup();
	}

	@Test
	public void checkIsProductPriceCorrectWhenFillAddressForm() throws InterruptedException {
		driver.get("http://www.77bugs.pl/shop/");
		// get text of menu item and validate it
		String men = driver.findElement(By.xpath("//li[@id='menu-item-97']/a")).getText();
		Assert.assertTrue(men.equals("MEN"));
	}

	@AfterTest
	public void teardown() {
		driver.close();
	}
}