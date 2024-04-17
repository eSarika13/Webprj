package mar23;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptHRM {

	public static void main(String[] args) throws Throwable {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		
		JavascriptExecutor js =(JavascriptExecutor)dr;
		js.executeScript("window.location='http://orangehrm.qedgetech.com/'");
		Thread.sleep(2000);
		String title = dr.getTitle();
		System.out.println(title);
		
		js.executeScript("document.querySelector(\"#txtUsername\").value='Admin'");
		js.executeScript("document.querySelector(\"#txtPassword\").value='Qedge123!@#5'");
		js.executeScript("document.querySelector(\"#btnLogin\").click()");
		Thread.sleep(2000);
		
		String expeccted = "dashboard";
		String actual = js.executeScript("return document.URL").toString();
		
		if(actual.contains(expeccted)) {
			System.out.println(" Login Success:" +expeccted +"------" +actual);
		}
		else {
			String error =js.executeScript("return document.querySelector('#spanMessage').innerHTML").toString();
			System.out.println("login not Success" +error +" " +expeccted +"-----" +actual);
		}
		Thread.sleep(2000);
		dr.quit();
		
		
	}

}
