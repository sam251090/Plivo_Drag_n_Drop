package page;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import action.Mouse_Action;
import page.Elements;
import webDriverCode.WebDriverPojo;

public class Operation {
		
//	public WebDriver driver=WebDriverPojo.getDriver();
	Mouse_Action action=new Mouse_Action();
	
	
	public void create_Ann_App(WebDriver driver ) throws InterruptedException, NullPointerException, MalformedURLException{
		
		WebDriverWait wait=new WebDriverWait(driver, 100);
		Elements ee=PageFactory.initElements(driver, Elements.class);
		
		wait.until(ExpectedConditions.visibilityOf(ee.create_An_App_Button));	
		ee.create_An_App_Button.click();
		
		wait.until(ExpectedConditions.visibilityOf(ee.start_Button));
		ee.start_Button.click();
		
		wait.until(ExpectedConditions.visibilityOf(ee.new_Page));
	}

	public void new_Page(WebDriver driver) throws InterruptedException, NullPointerException, MalformedURLException{
		
		WebDriverWait wait=new WebDriverWait(driver, 100);
		Elements ee=PageFactory.initElements(driver, Elements.class);
		
		ee.new_Page.click();
		
		wait.until(ExpectedConditions.visibilityOf(ee.page_Name));
		ee.page_Name.sendKeys("Test");
		
		wait.until(ExpectedConditions.elementToBeClickable(ee.page_Create_Button));
		ee.page_Create_Button.click();
	
		wait.until(ExpectedConditions.elementToBeClickable(ee.messaging_Button));
	}
	
public void messaging_Send_An_SMS(WebDriver driver) throws InterruptedException, NullPointerException, MalformedURLException{
		
		WebDriverWait wait=new WebDriverWait(driver, 100);
		Elements ee=PageFactory.initElements(driver, Elements.class);
		
		ee.messaging_Button.click();
		Thread.sleep(10000);
		
		wait.until(ExpectedConditions.elementToBeClickable(ee.send_An_SMS_Button));
		ee.send_An_SMS_Button.click();
	
		wait.until(ExpectedConditions.visibilityOf(ee.send_An_SMS_Sync_Node_Before));
		ee.SMS_Phone_no.sendKeys("1234567891");
		Thread.sleep(1000);

		ee.SMS_Messagetext.sendKeys("Hello World");
		Thread.sleep(2000);
}

public void start_to_send_An_SMS_Connector(WebDriver driver) throws InterruptedException, NullPointerException, MalformedURLException{
	
	WebDriverWait wait=new WebDriverWait(driver, 100);
	Elements ee=PageFactory.initElements(driver, Elements.class);
	
	WebElement dragBefore1=ee.start_Sync_Node_Before;
	WebElement dragAfter1=ee.start_Sync_Node_After;
	WebElement dragBefore2=ee.send_An_SMS_Sync_Node_Before;
	WebElement dragAfter2=ee.send_An_SMS_Sync_Node_After;
	
	action.connector(driver, dragBefore1, dragAfter1, dragBefore2, dragAfter2);
}

public void messaging_Send_An_Email(WebDriver driver, int x, int y) throws InterruptedException, NullPointerException, MalformedURLException{
	
	WebDriverWait wait=new WebDriverWait(driver, 100);
	Elements ee=PageFactory.initElements(driver, Elements.class);
	
	ee.send_An_Email_Button.click();
	Thread.sleep(2000);
	
	WebElement email_Panel=ee.send_An_Email_Panel;
	
	action.panel_DragNDrop(driver, email_Panel, x, y);
	
	wait.until(ExpectedConditions.visibilityOf(ee.email_Smtp_Host));
	
	ee.email_Smtp_Host.sendKeys("smtp.gmail.com");
	ee.email_Port.sendKeys("465");
	ee.email__Username.sendKeys("abc@gmail.com");
	ee.email_Password.sendKeys("123456789");
	ee.email_From.sendKeys("abc@gmail.com");
	ee.email_To.sendKeys("xyz@gmail.com");
	ee.email_Subject.sendKeys("SMS not sent");
	ee.email_Message.sendKeys("SMS to phone no 1234567891 not sent");
	Thread.sleep(2000);
}

public void basic_Exit(WebDriver driver, int exit_Module_no, int x, int y) throws InterruptedException, NullPointerException, MalformedURLException{
	
	WebDriverWait wait=new WebDriverWait(driver, 100);
	Elements ee=PageFactory.initElements(driver, Elements.class);
	
	ee.Basic_Button.click();
	Thread.sleep(2000);
	
	ee.add_Exit.click();
	Thread.sleep(2000);
	
	WebElement Exit_app_Panel=driver.findElement(By.xpath("(//*[contains(text(),'Exit App')])["+exit_Module_no+"]"));
	
//	WebElement exit=ee.Exit_app_Panel1;
	
	action.panel_DragNDrop(driver, Exit_app_Panel, x, y);
	Thread.sleep(2000);
}

public void sms_NS_To_Email_Connector(WebDriver driver) throws InterruptedException, NullPointerException, MalformedURLException{
	
	WebDriverWait wait=new WebDriverWait(driver, 100);
	Elements ee=PageFactory.initElements(driver, Elements.class);
	
	WebElement dragBefore1=ee.sms_Not_Sent_Before;
	WebElement dragAfter1=ee.sms_Not_Sent_After;
	WebElement dragBefore2=ee.email_Before;
	WebElement dragAfter2=ee.email_After;
	
	action.connector(driver, dragBefore1, dragAfter1, dragBefore2, dragAfter2);
	Thread.sleep(2000);
}

public void sms_Sent_To_Exit(WebDriver driver) throws InterruptedException, NullPointerException, MalformedURLException{
	
	WebDriverWait wait=new WebDriverWait(driver, 100);
	Elements ee=PageFactory.initElements(driver, Elements.class);
	
	WebElement dragBefore1=ee.sms_Sent_Before;
	WebElement dragAfter1=ee.sms_Sent_After;
	WebElement dragBefore2=ee.exit_Before1;
	WebElement dragAfter2=ee.exit_After1;
	
	action.connector(driver, dragBefore1, dragAfter1, dragBefore2, dragAfter2);
}

public void email_Sent_To_Exit(WebDriver driver) throws InterruptedException, NullPointerException, MalformedURLException{
	
	WebDriverWait wait=new WebDriverWait(driver, 100);
	Elements ee=PageFactory.initElements(driver, Elements.class);
	
	WebElement dragBefore1=ee.email_Sent_Before;
	WebElement dragAfter1=ee.email_Sent_After;
	WebElement dragBefore2=ee.exit_Before2;
	WebElement dragAfter2=ee.exit_After2;
	
	action.connector(driver, dragBefore1, dragAfter1, dragBefore2, dragAfter2);
}

public void email_NotSent_Exit(WebDriver driver) throws InterruptedException, NullPointerException, MalformedURLException{
	
	WebDriverWait wait=new WebDriverWait(driver, 100);
	Elements ee=PageFactory.initElements(driver, Elements.class);
	
	WebElement dragBefore1=ee.email_Not_Sent_Before;
	WebElement dragAfter1=ee.email_Not_Sent_After;
	WebElement dragBefore2=ee.exit_Before3;
	WebElement dragAfter2=ee.exit_After3;
	
	action.connector(driver, dragBefore1, dragAfter1, dragBefore2, dragAfter2);
	Thread.sleep(5000);
}

}
