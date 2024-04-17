package mar26;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handlingcalender {

	public static void main(String[] args) throws Throwable {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.navigate().to("https://jqueryui.com/");
		Thread.sleep(2000);
		
		Actions Ac = new Actions(dr);
		Ac.moveToElement(dr.findElement(By.linkText("Datepicker")));
		Ac.click().perform();
		
		String page =dr.getTitle();
		System.out.println(page);
		
		String dob = "June/13/2001";
		String temp[] = dob.split("/");
		String date = temp[1];
		String month = temp[0];
		String year = temp[2];
		Thread.sleep(2000);
		
		dr.switchTo().frame(0);
		dr.findElement(By.id("datepicker")).click();
		Thread.sleep(2000);
		
		String calYear = dr.findElement(By.className("ui-datepicker-year")).getText();
		while(!calYear.equals(year))
		{
			//click previous button
			dr.findElement(By.xpath("//span[contains(text(),'Prev')]")).click();
			calYear = dr.findElement(By.className("ui-datepicker-year")).getText();
		}
		
		String calMonth =dr.findElement(By.className("ui-datepicker-month")).getText();
		while(!calMonth.equalsIgnoreCase(month))
		{
			//click previous button
			dr.findElement(By.xpath("//span[contains(text(),'Prev')]")).click();
			calMonth =dr.findElement(By.className("ui-datepicker-month")).getText();
		}
		WebElement webtable = dr.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement> rows,cols;
		rows = webtable.findElements(By.tagName("tr"));
		for (WebElement eachrow : rows) {
			cols = eachrow.findElements(By.tagName("td"));
			for (WebElement eachcell : cols) {
				if(eachcell.getText().equals(date))
				{
					Thread.sleep(5000);
					//click date
					eachcell.click();
					
				}
		
	}
		}
	}
}
