package mar22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HeadlingDragnddropby2 {

	public static void main(String[] args) throws Throwable {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.navigate().to("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		
		Actions ac = new Actions(dr);
		dr.switchTo().frame(0);
		WebElement Source = dr.findElement(By.id("draggable"));
		WebElement target = dr.findElement(By.id("droppable"));
		
		int x = target.getLocation().getX();
		int y = target.getLocation().getY();
		System.out.println(x +" " +y);		
		ac.dragAndDropBy(Source, x, y).perform();
		Thread.sleep(5000);
		
		dr.close();
		
	}

}
