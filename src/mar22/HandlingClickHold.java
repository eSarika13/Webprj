package mar22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingClickHold {

	public static void main(String[] args) throws Throwable {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		
		Actions ac = new Actions(dr);
		List<WebElement> frames = dr.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		
		dr.switchTo().frame(0);
		WebElement source = dr.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target = dr.findElement(By.xpath("//div[@id='droppable']"));
		ac.clickAndHold(source).moveToElement(target).release(target) .perform();
		
		dr.switchTo().defaultContent();
		dr.findElement(By.xpath("//a[normalize-space()='Checkboxradio']")).click();
		Thread.sleep(5000);
		dr.close();
	}

}
