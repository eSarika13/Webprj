package mar23;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PrimusBank {
	public static void main(String[] args) throws Throwable {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.navigate().to("http://primusbank.qedgetech.com/");
		Thread.sleep(2000);
		
		Actions ac = new Actions(dr);
		
		String pagetitle = dr.getTitle();
		System.out.println( pagetitle);
		System.out.println("length of title::" +pagetitle.length());
		
		JavascriptExecutor js = (JavascriptExecutor)dr;
		js.executeScript("document.querySelector(\"#txtuId\").value='Admin'");
		js.executeScript("document.querySelector(\"#txtPword\").value='Admin'");
		js.executeScript("document.querySelector(\"#login\").click()");
		Thread.sleep(5000);
		
		String e=dr.switchTo().alert().getText();
		dr.switchTo().alert().accept();
		String actual = dr.getCurrentUrl();
		String expected = "adminflow";
		
				if(actual.contains(expected)) {
					System.out.println("login Sucessful" +expected +"....." +actual);
				}
				else if(!actual.contains(expected)){
					Thread.sleep(5000);
					
					 System.out.println("login not Sucessful" +"   "+e);
					 
				}
				
				
				
		}

}
