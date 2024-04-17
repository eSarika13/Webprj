package mar20;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingcheckboxes {

	public static void main(String[] args) throws Throwable {
		//NO of check boxes in checklist 
		//collection of check box in checklist 
		//verify the check is checked or unchecked
		//uncheck the checked box and check unchecked check box 
		
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.navigate().to("file:///E:/checkbox_1_lyst2257.html");
		Thread.sleep(2000);
		
		List<WebElement> allcheckbox = dr.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(allcheckbox.size());
		for (WebElement each : allcheckbox) {
		boolean  value = each.isSelected();
		System.out.println(each.getAttribute("value")+"  " +value);
		Thread.sleep(2000);
		each.click();
		}
		dr.quit();

	}

}
