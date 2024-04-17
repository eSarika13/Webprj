package mar22;

import javax.swing.text.Document;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) throws Throwable {
		WebDriver ddr = new ChromeDriver();
		ddr.manage().window().maximize();
		ddr.manage().deleteAllCookies();
		
		JavascriptExecutor js = (JavascriptExecutor)ddr;
		js.executeScript("window.location='https://google.in'");
		//scroll top to bottom vertically 
		String title = js.executeScript("return document.title").toString();
		System.out.println(title +"  " +title.length()  );
		Thread.sleep(2000);
		
		String url = js.executeScript("return document.URL").toString();
		System.out.println(url);
		Thread.sleep(2000);
		
		String doc = js.executeScript("return document.domain").toString();
		System.out.println(title);
		Thread.sleep(2000);
		
		

	}

}
