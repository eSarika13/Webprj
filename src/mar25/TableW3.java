package mar25;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableW3 {

	public static void main(String[] args) throws Throwable {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.navigate().to("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(5000);
		
		WebElement webtable = dr.findElement(By.className("ws-table-all"));
		List<WebElement> rows, cols;
		rows = webtable.findElements(By.tagName("tr"));
		System.out.println(rows.size()-1 +"    no.of rows" );
		for(int i=0;i<rows.size();i++) {
			cols= rows.get(i).findElements(By.tagName("td"));
			System.out.println("no.of columns:::::" +cols.size());
			for (WebElement eachcells : cols) {
				Thread.sleep(1000);
				System.out.println(eachcells.getText());
				}
			System.out.println("_____________________");
		}
		Thread.sleep(1000);
		dr.quit();
	}

}
