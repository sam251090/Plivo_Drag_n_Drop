package webDriverCode;

import java.net.MalformedURLException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class WebDriverUtil {
	static WebDriver driver;
	static String URL= "http://quickfuseapps.com/";
	static Path currentDir = Paths.get(System.getProperty("user.dir"));
	static Path chromedriverfilePath = Paths.get(currentDir.toString(), "src", "test", "resources", "Driver", "chromedriver.exe");
	@BeforeTest
	public static WebDriver webDriverLaunch() throws MalformedURLException
	{
		try {
	System.setProperty("webdriver.chrome.driver",chromedriverfilePath.toString());
	driver = new ChromeDriver();
	driver.get(URL);
	driver.manage().window().maximize();
	WebDriverPojo.setDriver(driver);
	}
	catch(Exception e){
	    System.out.println(e);}
	return driver;
	}
	
	@AfterTest()
	public static void webDriverTearDown() throws InterruptedException
	{
		driver.close();
		driver.quit();
	}
}
