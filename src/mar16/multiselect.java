package mar16;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiselect {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/MultiListboxHtmlpage_lyst8730.html");
		Thread.sleep(5000);
		Select dropdown = new Select(driver.findElement(By.name("multiSelection")));
		//verify listbox is single or multi selection listbox 
		boolean value = dropdown.isMultiple();
		System.out.println(value);
		
		List<WebElement> items = dropdown.getOptions();
		System.out.println("no.of items are::"+items.size());
		for (WebElement each : items) {
			System.out.println(each.getText());
			}
		//select 0 to 8 items
		for(int i=0;i<=8;i++)
		{
			Thread.sleep(3000);
			//select one by one item
			dropdown.selectByIndex(i);
		}
		
		//deselect from selection
		dropdown.deselectByVisibleText("Yellow");
		Thread.sleep(3000);
		dropdown.deselectByIndex(0);
		Thread.sleep(3000);
		dropdown.deselectAll();
		Thread.sleep(3000);
		driver.quit();


	}

}
