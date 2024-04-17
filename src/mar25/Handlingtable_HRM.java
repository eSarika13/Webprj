package mar25;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingtable_HRM {

	public static void main(String[] args) throws Throwable {
		
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.navigate().to("http://orangehrm.qedgetech.com/");
		Thread.sleep(2000);
		
		dr.findElement(By.id("txtUsername")).sendKeys("Admin");
		dr.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		dr.findElement(By.id("btnLogin")).click();
		dr.findElement(By.id("menu_admin_viewAdminModule")).click();
		
		WebElement webtable = dr.findElement(By.id("resultTable"));
		List<WebElement> rows = webtable.findElements(By.tagName("tr"));
		System.out.println(rows.size()-1);
		//iterate
		for (WebElement eachrow: rows) {
			List<WebElement> cols = eachrow.findElements(By.tagName("td"));
			System.out.println("no of col::" +cols.size());
			for (WebElement eachcol : cols) {
				Thread.sleep(2000);
				System.out.println(eachcol.getText());
				}
			System.out.print("==========================");
		}
		Thread.sleep(2000);
		dr.quit();
	}

}
