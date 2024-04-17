package mar15;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Noofitems {

	public static void main(String[] args) throws Throwable {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.get("https://www.amazon.com/");
		Thread.sleep(5000);
		Select listbox = new Select(dr.findElement(By.id("searchDropdownBox")));
		List<WebElement> allitems = listbox.getOptions();
		System.out.println("no.of items are" +allitems.size() );
		Thread.sleep(5000);
		for (WebElement each : allitems) {
			Thread.sleep(5000);
			System.out.println(each.getText());	
		}
		Thread.sleep(5000);
		dr.close();

	}

}
