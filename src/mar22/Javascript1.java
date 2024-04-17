package mar22;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript1 {

	public static void main(String[] args) throws Throwable {
		WebDriver ddr = new ChromeDriver();
		ddr.manage().window().maximize();
		ddr.manage().deleteAllCookies();
		
		JavascriptExecutor js = (JavascriptExecutor)ddr;
		js.executeScript("window.location='https://amazon.in'");
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,5000)");
		Thread.sleep(5000);
		
		ddr.quit();

	}

}
