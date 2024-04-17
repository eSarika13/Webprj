package mar15;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iteminlist {

	public static void main(String[] args) throws Throwable {
		String itempresent = "baby";
		boolean itemexist = false;
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.get("https://www.amazon.com/");
		Thread.sleep(2000);
		Select listbox = new Select(dr.findElement(By.id("searchDropdownBox")));
		List<WebElement> allitems = listbox.getOptions();
		System.out.println(allitems.size());
		for (WebElement each : allitems) {
			String actualitems = each.getText();
			Thread.sleep(2000);
			System.out.println(actualitems);
			if(actualitems.equalsIgnoreCase(itempresent))
			{
				itemexist = true ;
				break;	
			}	
		}
		if(itemexist)
		{
			System.out.println(itempresent +" " +" item exist in listbox");
		}
		else
		{
			System.out.println(itempresent +" " +" item does not exist in listbox");
		}
		Thread.sleep(2000);
		dr.close();
 
	}

}
