package mar23;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptforSendkeys {

	public static void main(String[] args) throws Throwable {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.navigate().to("https://demo.opencart.com/");
		Thread.sleep(2000);
		
		Actions Ac = new Actions(dr);
		
		dr.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		dr.findElement(By.linkText("Register")).click();
		
		dr.findElement(By.id("input-firstname")).sendKeys("selenium");
		dr.findElement(By.id("input-lastname")).sendKeys("tesing");
		dr.findElement(By.name("email")).sendKeys("testing@gmail.com");
		dr.findElement(By.name("password")).sendKeys("sele@215");
		Thread.sleep(5000);
		Ac.moveToElement(dr.findElement(By.xpath("//input[@id='input-newsletter-yes']"))).click().perform();
		Thread.sleep(5000);
		Ac.moveToElement(dr.findElement(By.name("agree"))).click().perform();
		Thread.sleep(5000);
		
		JavascriptExecutor js = (JavascriptExecutor)dr;
		js.executeScript("document.querySelector(\"button[type='submit']\").click()");
		Thread.sleep(5000);
		dr.close();
	}

}
