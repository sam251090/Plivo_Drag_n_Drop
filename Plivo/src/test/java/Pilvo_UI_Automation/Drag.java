package Pilvo_UI_Automation;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.Elements;
import page.Operation;
import webDriverCode.WebDriverPojo;
import webDriverCode.WebDriverUtil;

public class Drag extends WebDriverUtil {
public WebDriver driver;
Operation oo=new Operation();
	
	@Test
	public void TestCase1() throws InterruptedException, NullPointerException, MalformedURLException{
		driver=WebDriverPojo.getDriver();
		
		Elements ee=PageFactory.initElements(driver, Elements.class);
		
		oo.create_Ann_App(driver);
		oo.new_Page(driver);
		oo.messaging_Send_An_SMS(driver);
		oo.start_to_send_An_SMS_Connector(driver);
		oo.messaging_Send_An_Email(driver, 240, -50);
		oo.basic_Exit(driver, 1, -200, 100);
		oo.basic_Exit(driver, 2, 50, 190);
		oo.basic_Exit(driver, 3, 550, 170);
	}

}
