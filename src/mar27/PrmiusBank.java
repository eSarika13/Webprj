package mar27;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrmiusBank {

	public static void main(String[] args) throws IOException, Throwable {
		FileReader fr = new FileReader("E:/logindata.txt");
		BufferedReader br = new BufferedReader(fr);
		String str;
		while ((str=br.readLine())!=null) {
			String login[]= str.split("@");
			WebDriver dr = new ChromeDriver();
			dr.manage().window().maximize();
			dr.manage().deleteAllCookies();
			dr.get("http://primusbank.qedgetech.com/");
			Thread.sleep(2000);
			
			WebElement user = dr.findElement(By.id("txtuId"));
			user.clear();
			user.sendKeys(login[0]);
			
			WebElement password = dr.findElement(By.id("txtPword"));
			password.clear();
			password.sendKeys(login[1]);
			
			dr.findElement(By.name("login")).click();
			Thread.sleep(2000);
			String expected = "adminflow";
			String actual = dr.getCurrentUrl();
			if (actual.contains(expected)) {
				System.out.println("Login Successfull" +expected +"------" +actual);
			}
			else {
				System.out.println("Login Fail" +expected +"------" +actual);
			}
			dr.quit();	

	}

}
}