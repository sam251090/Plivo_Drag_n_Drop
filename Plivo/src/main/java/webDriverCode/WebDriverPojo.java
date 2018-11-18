package webDriverCode;

import org.openqa.selenium.WebDriver;

public class WebDriverPojo {
	public static WebDriver driver;

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		WebDriverPojo.driver = driver;
	}
	

}
