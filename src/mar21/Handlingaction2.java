package mar21;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Handlingaction2 {

	public static void main(String[] args) throws Throwable {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.navigate().to("https://accounts.google.com/v3/signin/identifier?authuser=0&continue=https%3A%2F%2Fmail.google.com%2Fmail&ec=GAlAFw&hl=en-GB&service=mail&flowName=GlifWebSignIn&flowEntry=AddSession&dsh=S1023960877%3A1711020564485614&theme=mn&ddm=0");
        Thread.sleep(2000);
        //mouse to  create account link and click
		//press up arrow for three times
		//click enter key
        
        Actions ac = new Actions(dr);
        ac.moveToElement(dr.findElement(By.xpath("//span[normalize-space()='Create account']")));
        ac.click().perform();
        Thread.sleep(2000);
        
        //press up arrow
        ac.sendKeys(Keys.ARROW_UP).perform();
        Thread.sleep(1000);
        ac.sendKeys(Keys.ARROW_UP).perform();
        Thread.sleep(1000);
        ac.sendKeys(Keys.ARROW_UP).perform();
        Thread.sleep(1000);
        ac.sendKeys(Keys.ENTER).perform();
        
        dr.findElement(By.id("firstName")).sendKeys(" sai sari");
        Thread.sleep(1000);
        dr.findElement(By.id("lastName")).sendKeys(" 2541kih");
        Thread.sleep(1000);
        dr.findElement(By.xpath("//span[normalize-space()='Next']")).click();
        Thread.sleep(1000);
        
        dr.findElement(By.id("day")).sendKeys("23");
        
        Select listbox = new Select(dr.findElement(By.id("month")));
        List<WebElement> allitems = listbox.getOptions();
        System.out.println(allitems.size());
        for (WebElement each : allitems) {
        	System.out.println(each.getText());
			
		}
        dr.quit();   
	}

}
