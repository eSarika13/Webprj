package mar23;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import mar16.listboxinindex;

public class Microsoft {

	public static void main(String[] args) throws Throwable {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.get("https://www.msn.com/");
		Thread.sleep(5000);
		
		List<WebElement> alllink = dr.findElements(By.tagName("li"));
		System.out.println(alllink.size());
		Thread.sleep(1000);
		
		for (WebElement each : alllink) {
			System.out.println(each.getText());
			
		}
		
		
		
		
	}

}
