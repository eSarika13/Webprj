package mar21;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Context {

	public static void main(String[] args) throws Throwable {
		WebDriver f = new ChromeDriver();
		f.manage().window().maximize();
		f.manage().deleteAllCookies();
		f.get("https://www.google.com/");
		Thread.sleep(2000);
		
		Actions ac = new Actions(f);
		ac.moveToElement(f.findElement(By.linkText("Gmail")));
		ac.contextClick().perform();
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		ArrayList<String> hand = new ArrayList<String>(f.getWindowHandles());
		f.switchTo().window(hand.get(1));
		ac.moveToElement(f.findElement(By.xpath("/html/body/header/div/div/div/a[2]"))).click().perform();
		System.out.println(f.getTitle());
		Thread.sleep(2000);
		
		f.switchTo().window(hand.get(0));
		ac.moveToElement(f.findElement(By.linkText("Images"))).click().perform();
		System.out.println(f.getTitle());
		Thread.sleep(2000);
		f.close();
	}

}
