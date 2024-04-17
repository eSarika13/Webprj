package mar22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HeadlingDragnddrop1 {

	public static void main(String[] args) throws Throwable {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		
		Actions ac = new Actions(dr);
		
		dr.switchTo().frame(0);
		WebElement source = dr.findElement(By.xpath("//div[@id='draggable']"));
		System.out.println(source.getText());
		WebElement target = dr.findElement(By.xpath("//div[@id='droppable']"));
		System.out.println(target.getText());
		ac.dragAndDrop(source, target).perform();
		
		
		
		dr.close();

	}

}
