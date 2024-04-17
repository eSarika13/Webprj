package mar22;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript2 {

	public static void main(String[] args) throws Throwable {
		WebDriver ddr = new ChromeDriver();
		ddr.manage().window().maximize();
		ddr.manage().deleteAllCookies();
		
		JavascriptExecutor js = (JavascriptExecutor)ddr;
		js.executeScript("window.location='https://amazon.in'");
		String paget = ddr.getTitle();
		System.out.println(paget);
		WebElement element = ddr.findElement(By.linkText("Women's Clothing"));
		js.executeScript("window.scrollInTOView",element);
		Thread.sleep(2000);
		element.click();
		Thread.sleep(2000);
		String paget1 = ddr.getTitle();
		System.out.println(paget1);
		
		
		
	}

}
