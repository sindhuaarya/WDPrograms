package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Framess {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		driver.manage().window().maximize();
		
		WebElement f1=driver.findElement(By.name("packageListFrame"));
		driver.switchTo().frame(f1).findElement(By.xpath("//a[@href='java/awt/color/package-frame.html']")).click();
		
		driver.switchTo().parentFrame();
		
		WebElement f2=driver.findElement(By.name("packageFrame"));
		driver.switchTo().frame(f2).findElement(By.xpath("//a[@href='ICC_Profile.html']")).click();
			
		driver.switchTo().parentFrame();
		
		WebElement p1=driver.findElement(By.name("classFrame"));
		driver.switchTo().frame(p1).findElement(By.xpath("//a[@href='#field_summary']")).click();
		
		//List<WebElement> frames=driver.findElements(By.tagName("frame"));
		

		
		
		
		
	}

}
