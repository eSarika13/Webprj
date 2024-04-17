package mar19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifycheckbox {

	public static void main(String[] args) throws Throwable {
		WebDriver g = new ChromeDriver();
		g.manage().window().maximize();
		g.manage().deleteAllCookies();
		g.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(2000);
		WebElement checkbox = g.findElement(By.name("remember"));
		boolean value = checkbox.isSelected();
		System.out.println(value);
		
		if(value)
		{
			//if value is true uncheck checkbox
			checkbox.click();
		}
		else {
			//if value is false check checkbox 
			checkbox.click();
		}
		Thread.sleep(2000);
		g.quit();

	}

}