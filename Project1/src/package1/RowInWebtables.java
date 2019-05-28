package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RowInWebtables {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://money.rediff.com/sectors");
		driver.manage().window().maximize();
	
		
		WebElement column=driver.findElement(By.xpath("//*[@id='dataTable']/tbody/tr[4]/td[1]"));
		List<WebElement> rowthree=column.findElements(By.tagName("a"));
		System.out.println(rowthree.size());
		
	}
		
}
