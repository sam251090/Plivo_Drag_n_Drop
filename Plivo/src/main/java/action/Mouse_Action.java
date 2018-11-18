package action;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import page.Elements;

public class Mouse_Action {
	
public void connector(WebDriver driver, WebElement dragBefore1, WebElement dragAfter1, WebElement dragBefore2, WebElement dragAfter2) throws InterruptedException, NullPointerException, MalformedURLException{
		
		WebDriverWait wait=new WebDriverWait(driver, 100);
		Elements ee=PageFactory.initElements(driver, Elements.class);
		
		Actions action=new Actions(driver);
		action.clickAndHold(dragAfter1).build();
		
		Action dragDrop = action.clickAndHold(dragBefore1).moveToElement(dragBefore2).moveToElement(dragAfter2).click().build();
		dragDrop.perform();
		Thread.sleep(10000);
}

public void panel_DragNDrop(WebDriver driver, WebElement panel, int x, int y) throws InterruptedException, NullPointerException, MalformedURLException{
	
	WebDriverWait wait=new WebDriverWait(driver, 100);
	Elements ee=PageFactory.initElements(driver, Elements.class);
	
	Actions action=new Actions(driver);
action.dragAndDropBy(panel, x, y).click().build().perform();
Thread.sleep(10000);
}

}
