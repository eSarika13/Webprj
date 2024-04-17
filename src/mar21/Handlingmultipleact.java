package mar21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handlingmultipleact {

	public static void main(String[] args) throws Throwable {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.get("https://www.myntra.com/");
		Thread.sleep(1000);
		
		Actions ac = new Actions(dr);
		ac.moveToElement(dr.findElement(By.xpath("//a[@data-group='kids']")));
		ac.perform();
		Thread.sleep(2000);
		ac.moveToElement(dr.findElement(By.linkText("Flipflops")));
		ac.click().perform();
		Thread.sleep(2000);
		ac.moveToElement(dr.findElement(By.xpath("//a[@data-group='beauty']")));
		ac.perform();
		Thread.sleep(2000);
		ac.moveToElement(dr.findElement(By.linkText("Hair Oil")));
		ac.click().perform();
		Thread.sleep(2000);
		

	}

}
