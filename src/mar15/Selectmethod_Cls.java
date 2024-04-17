package mar15;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectmethod_Cls {

	public static void main(String[] args) throws Throwable {
		WebDriver k = new ChromeDriver();
		k.manage().window().maximize();
		k.manage().deleteAllCookies();
		k.get("https://www.facebook.com/");
		k.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		
		//storing list box into select box
		Select daylistbox = new Select(k.findElement(By.name("birthday_day")));
		Select monthlistbox = new Select(k.findElement(By.id("month")));
		Select yearlistbox = new Select(k.findElement(By.name("birthday_year")));
		
		//verify list box is single or multiple selection
		boolean dr = daylistbox.isMultiple();
		boolean dr1 = monthlistbox.isMultiple();
		boolean dr2 = yearlistbox.isMultiple();
		System.out.println(dr +"    " +dr1 +"   " +dr2 );
		
		//select items in list box
		daylistbox.selectByIndex(20);
		Thread.sleep(2000);
		monthlistbox.selectByVisibleText("Jan");
		Thread.sleep(2000);
		yearlistbox.selectByIndex(10);
		Thread.sleep(2000);
		
		k.close();
	}

}
