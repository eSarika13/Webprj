package mar16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handlealter {

	public static void main(String[] args) throws Throwable {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.get("https://www.rediff.com/");
		Thread.sleep(2000);
		
		Actions ac = new Actions(dr);
		ac.moveToElement(dr.findElement(By.xpath("//a[normalize-space()='Sign in']")));
		ac.click().perform();
		
		dr.findElement(By.name("proceed")).click();
		String altermsg = dr.switchTo().alert().getText();
		System.out.println(altermsg);
		Thread.sleep(2000);
		
		dr.switchTo().alert().accept();
		Thread.sleep(1000);
		dr.quit();
	

	}

}
