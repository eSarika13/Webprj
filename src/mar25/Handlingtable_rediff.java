package mar25;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingtable_rediff {

	public static void main(String[] args) throws Throwable {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.navigate().to("https://money.rediff.com/mutual-funds");
		Thread.sleep(2000);
		
		//store table in webelement 
		WebElement table = dr.findElement(By.className("dataTable"));
		//get collection of rows in web element
		List<WebElement> rows, cols;
		rows = table.findElements(By.tagName("tr"));
		System.out.println(rows.size()-1);
		for(int i=1;i<rows.size();i++)
		{
			//get collection cells from each rows
			cols = rows.get(i).findElements(By.tagName("td"));
			System.out.println("row size" +i  +"     colum size    " +cols.size());
			//iterate EACH cell
		for (WebElement eachcell: cols) {
			//print each cell data
			Thread.sleep(2000);
			System.out.println(eachcell.getText());
		}
		System.out.println("-------------------------");
		}
		dr.quit();
	}

}
