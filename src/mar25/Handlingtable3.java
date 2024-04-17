package mar25;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingtable3 {

	public static void main(String[] args) throws Throwable {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.get("https://money.rediff.com/mutual-funds");
		Thread.sleep(1000);
		
		WebElement webtable = dr.findElement(By.className("dataTable"));
		
	List<WebElement> rows,cols;
	rows = webtable.findElements(By.tagName("tr"));
	System.out.println("row size" +rows.size());
	
	for (WebElement eachrow : rows) {
		
		cols = eachrow.findElements(By.tagName("td"));
		System.out.println("Col size" +cols.size());
		for (WebElement eachcell : cols) {
			Thread.sleep(1000);
			System.out.println(eachcell.getText());
			
		}
		System.out.println("---------------------------------");
	}
	Thread.sleep(1000);
	dr.quit();
	}

}
