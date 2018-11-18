package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Elements {
	
	@FindBy(how = How.XPATH, using = "//a[@id='link-create']")
	public WebElement create_An_App_Button;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'get started!')]")
	public WebElement start_Button;

	@FindBy(how = How.ID, using = "add-page")
	public WebElement new_Page;
	
	@FindBy(how = How.XPATH, using = "//*[@class='indented submitonenter']")
	public WebElement page_Name;
	
	@FindBy(how = How.XPATH, using = "(//*[@class='ui-dialog-buttonpane ui-widget-content ui-helper-clearfix']//button[contains(text(),'Create')])[2]")
	public WebElement page_Create_Button;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Messaging')]")
	public WebElement messaging_Button;
	
	@FindBy(how = How.XPATH, using = "//div[@class='ui-accordion-content ui-helper-reset ui-widget-content ui-corner-bottom  ui-accordion-content-active']//ul//li[3]//a")
	public WebElement send_An_SMS_Button;
	
	@FindBy(how = How.XPATH, using = "(//*[@class='syn-node ui-draggable syn-node-active'])[2]")
	public WebElement start_Sync_Node_Before;
	
	@FindBy(how = How.XPATH, using = "(//*[@class='syn-node ui-draggable syn-node-active syn-node-dragging syn-node-drawing'])[2]")
	public WebElement start_Sync_Node_After;
	
	@FindBy(how = How.XPATH, using = "(//*[@class='syn-receptor ui-droppable syn-receptor-north ui-draggable syn-receptor-draggable'])[1]")
	public WebElement send_An_SMS_Sync_Node_Before;		
	
	@FindBy(how = How.XPATH, using = "(//*[@class='syn-receptor ui-droppable syn-receptor-north ui-draggable syn-receptor-draggable syn-receptor-active syn-receptor-hover'])[1]")
	public WebElement send_An_SMS_Sync_Node_After;		
	
	
	@FindBy(how = How.XPATH, using = "//*[@name='phone_constant']")
	public WebElement SMS_Phone_no;
	
	@FindBy(how = How.XPATH, using = "(//*[@name='message_phrase[]'])[1]")
	public WebElement SMS_Messagetext;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='ui-accordion-content ui-helper-reset ui-widget-content ui-corner-bottom  ui-accordion-content-active']//ul//li[2]//a")
	public WebElement send_An_Email_Button;
	
	@FindBy(how = How.XPATH, using = "//*[@class='panel']//*[contains(text(),'Send an Email')]")
	public WebElement send_An_Email_Panel;
	
	
	@FindBy(how = How.XPATH, using = "//*[@name='smtp_url']")
	public WebElement email_Smtp_Host;
	
	@FindBy(how = How.XPATH, using = "//*[@name='port']")
	public WebElement email_Port;
	
	@FindBy(how = How.XPATH, using = "(//*[@name='username'])[1]")
	public WebElement email__Username;
	
	@FindBy(how = How.XPATH, using = "//*[@name='password']")
	public WebElement email_Password;
	
	@FindBy(how = How.XPATH, using = "//*[@name='from_constant']")
	public WebElement email_From;
	
	@FindBy(how = How.XPATH, using = "//*[@name='to_constant']")
	public WebElement email_To;
	
	@FindBy(how = How.XPATH, using = "//*[@name='subject_constant']")
	public WebElement email_Subject;
	
	@FindBy(how = How.XPATH, using = "(//*[@name='message_phrase[]'])[3]")
	public WebElement email_Message;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Basic')]")
	public WebElement Basic_Button;
	
	@FindBy(how = How.XPATH, using = "//li[@class='module-item ui-widget-content ui-corner-all module-item-red ui-draggable']//a")
	public WebElement add_Exit;
	
	@FindBy(how = How.XPATH, using = "(//*[@class='syn-node syn-node-attached-e ui-draggable syn-node-active'])[1]")
	public WebElement sms_Not_Sent_Before;
	
	@FindBy(how = How.XPATH, using = "(//*[@class='syn-node syn-node-attached-e ui-draggable syn-node-active syn-node-drawing'])[1]")
	public WebElement sms_Not_Sent_After;
	
	@FindBy(how = How.XPATH, using = "(//*[@class='syn-receptor ui-droppable syn-receptor-north ui-draggable syn-receptor-draggable'])[2]")
	public WebElement email_Before;
	
	@FindBy(how = How.XPATH, using = "(//*[@class='syn-receptor ui-droppable syn-receptor-north ui-draggable syn-receptor-draggable syn-receptor-active syn-receptor-hover'])[1]")
	public WebElement email_After;
	
	@FindBy(how = How.XPATH, using = "(//*[@class='syn-node syn-node-attached-w ui-draggable syn-node-active'])[1]")
	public WebElement sms_Sent_Before;
	
	@FindBy(how = How.XPATH, using = "(//*[@class='syn-node syn-node-attached-w ui-draggable syn-node-active syn-node-drawing'])[1]")
	public WebElement sms_Sent_After;
	
	@FindBy(how = How.XPATH, using = "(//*[@class='syn-receptor ui-droppable syn-receptor-north ui-draggable syn-receptor-draggable'])[3]")
	public WebElement exit_Before1;
	
	@FindBy(how = How.XPATH, using = "(//*[@class='syn-receptor ui-droppable syn-receptor-north ui-draggable syn-receptor-draggable syn-receptor-active syn-receptor-hover'])[1]")
	public WebElement exit_After1;
	
	@FindBy(how = How.XPATH, using = "(//*[@class='syn-node syn-node-attached-w ui-draggable syn-node-active'])[1]")
	public WebElement email_Sent_Before;
	
	@FindBy(how = How.XPATH, using = "(//*[@class='syn-node syn-node-attached-w ui-draggable syn-node-active syn-node-drawing'])[1]")
	public WebElement email_Sent_After;
	
	@FindBy(how = How.XPATH, using = "(//*[@class='syn-receptor ui-droppable syn-receptor-north ui-draggable syn-receptor-draggable'])[4]")
	public WebElement exit_Before2;
	
	@FindBy(how = How.XPATH, using = "(//*[@class='syn-receptor ui-droppable syn-receptor-north ui-draggable syn-receptor-draggable syn-receptor-active syn-receptor-hover'])[1]")
	public WebElement exit_After2;
	
	@FindBy(how = How.XPATH, using = "(//*[@class='syn-node syn-node-attached-e ui-draggable syn-node-active'])[1]")
	public WebElement email_Not_Sent_Before;
	
	@FindBy(how = How.XPATH, using = "(//*[@class='syn-node syn-node-attached-e ui-draggable syn-node-active syn-node-drawing'])[1]")
	public WebElement email_Not_Sent_After;
	
	@FindBy(how = How.XPATH, using = "(//*[@class='syn-receptor ui-droppable syn-receptor-north ui-draggable syn-receptor-draggable'])[5]")
	public WebElement exit_Before3;
	
	@FindBy(how = How.XPATH, using = "(//*[@class='syn-receptor ui-droppable syn-receptor-north ui-draggable syn-receptor-draggable syn-receptor-active syn-receptor-hover'])[1]")
	public WebElement exit_After3;
}
