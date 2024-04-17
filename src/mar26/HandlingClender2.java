package mar26;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingClender2 {

	public static void main(String[] args) throws Throwable {
		String dol = "2024-May-31";
		String temp[]= dol.split("-");
		String year = temp[0];
		String month = temp[1];
		String date = temp[2];
		
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(2000);
		
		dr.findElement(By.id("txtUsername")).sendKeys("Admin");
		dr.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		dr.findElement(By.name("Submit")).click();
		
		dr.findElement(By.xpath("//b[normalize-space()='Leave']")).click();
		dr.findElement(By.xpath("//li[1]//img[1]")).click();
		//select your year from calendar
		new Select(dr.findElement(By.className("ui-datepicker-year"))).selectByVisibleText(year);
		Thread.sleep(5000);
		new Select(dr.findElement(By.className("ui-datepicker-month"))).selectByVisibleText(month);
		Thread.sleep(5000);
		
		WebElement webtable = dr.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement> rows,cols;
		rows = webtable.findElements(By.tagName("tr"));
		for (WebElement eachrow : rows) {
			cols = eachrow.findElements(By.tagName("td"));
			for (WebElement eachcol : cols) {
				if(eachcol.getText().equals(date)) {
					Thread.sleep(5000);
					eachcol.click();
				}
			}
			
		}
	}

}
