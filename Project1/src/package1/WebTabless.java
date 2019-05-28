package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class WebTabless {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://money.rediff.com/sectors");
		driver.manage().window().maximize();
	
		
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//*[@id='showMoreLess']"))).build().perform();
		driver.findElement(By.xpath("//*[@id='showMoreLess']")).click();
		
		
		WebElement rows=driver.findElement(By.xpath("//*[@id='dataTable']/tbody"));
		List<WebElement> rowcount=rows.findElements(By.tagName("tr"));
		int i=rowcount.size();
		for(i=0; i>=5; i++) 
			System.out.println(rowcount.get(i).getText());
			System.out.println(rowcount.size());
			
		}
		
}

		
		
	
