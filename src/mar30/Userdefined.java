package mar30;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Userdefined {
	public static String validateLogin( String expected , String actual) { 
		String str;
		if(actual.contains(expected)) {
			str="login sucessful";
		} else {
			str="login failed";
		}
		return str;
	}

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("E:/logindata.txt");
		BufferedReader br = new BufferedReader(fr);
		String str;
		while ((str=br.readLine())!=null) {
			String login[]= str.split(";");
			WebDriver dr = new ChromeDriver();
			dr.manage().window().maximize();
			dr.manage().deleteAllCookies();
			dr.get("http://orangehrm.qedgetech.com/");
			dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			dr.findElement(By.id("txtUsername")).sendKeys(login[0]);
			dr.findElement(By.id("txtPassword")).sendKeys(login[1]);
			dr.findElement(By.name("Submit")).click();
			
			String a = Userdefined.validateLogin("dashboard", dr.getCurrentUrl());
			System.out.println(a);
			dr.quit();
	}

}
	
}
