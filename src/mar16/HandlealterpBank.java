package mar16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlealterpBank {

	public static void main(String[] args) throws Throwable {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.get("http://primusbank.qedgetech.com/");
		Thread.sleep(2000);
		
		dr.findElement(By.id("txtuId")).sendKeys("Admin");
		dr.findElement(By.id("txtPword")).sendKeys("Admin");
		dr.findElement(By.name("login")).click();
		dr.findElement(By.xpath("//img[@src='images/Branches_but.jpg']")).click();
		dr.findElement(By.xpath("(//img)[11]")).click();
		Thread.sleep(1000);
		
		String altertext = dr.switchTo().alert().getText();
		System.out.println(altertext);
		dr.switchTo().alert().dismiss();
		Thread.sleep(1000);
		
		// click ok
		dr.findElement(By.xpath("(//img)[11]")).click();
		Thread.sleep(1000);
		
		dr.switchTo().alert().accept();
		Thread.sleep(1000);
		
		String alter2 = dr.switchTo().alert().getText();
		System.out.println(alter2);
		Thread.sleep(1000);
		
		dr.switchTo().alert().accept();
		Thread.sleep(1000);
		
		dr.quit();
		
		

	}

}
