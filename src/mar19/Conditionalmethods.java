package mar19;

import java.sql.Driver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditionalmethods {

	public static void main(String[] args) throws Throwable {
		WebDriver fb = new ChromeDriver();
		fb.manage().window().maximize();
		fb.manage().deleteAllCookies();
		fb.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		
		fb.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);  
		
		//verify first name is enabled or hidden 
		WebElement firstname = fb.findElement(By.name("firstname"));
		boolean is_Enabled = firstname.isEnabled();
		System.out.println(is_Enabled);
		
		//verify re-enter textbox is displayed or hidden
		WebElement emailadd = fb.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		boolean is_Displayed = emailadd.isDisplayed();
		System.err.println(is_Displayed);
		
		//verify female radio button is selected or not 
		WebElement radiobutton = fb.findElement(By.xpath("//label[normalize-space()='Female']"));
		boolean isselected = radiobutton.isSelected();
		System.out.println(isselected);
		fb.quit();
		
		
		

	}

}
