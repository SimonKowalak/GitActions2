package resources;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	public WebDriver driver;
	final private int MaximumTimeout = 10;

	public WebDriver setup() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\selenium-java\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(MaximumTimeout, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}
}
