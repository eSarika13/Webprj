package mar21;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Headlingaction {

	public static void main(String[] args) throws Throwable {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.get("https://www.google.com/");
		Thread.sleep(1000);
		
		//create an action class object
		Actions ac = new Actions(dr);
		dr.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium openings in ");
		Thread.sleep(5000);
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
		ac.sendKeys(Keys.ENTER).perform();
		dr.close();
		}

}
