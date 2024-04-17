package mar25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingtable_rediffSpfcol {

	public static void main(String[] args) throws Throwable {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.navigate().to("https://money.rediff.com/mutual-funds");
		Thread.sleep(2000);
		
		String tabletext = dr.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[15]/td[1]")).getText();
		String tabletext1 = dr.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[15]/td[2]")).getText();
		
		System.out.println(tabletext +"    "+tabletext1);
		dr.quit();

	}

}
