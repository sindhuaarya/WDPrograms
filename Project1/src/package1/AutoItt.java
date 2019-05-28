package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoItt {

	public static void main(String[] args) throws Exception {

		WebDriver driver=new FirefoxDriver();
		driver.get("https://transfer.pcloud.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("emails")).sendKeys("sindhu.cs0105@gmail.com");
		driver.findElement(By.id("sendermail")).sendKeys("sindhu.sham88@gmail.com");
		driver.findElement(By.id("ppaccepted")).click();
	
		driver.findElement(By.xpath("//*[@src='//pcdn-transfer.pcloud.com/Zeb/img/add_files_ico.png']")).click();
		Runtime.getRuntime().exec("C:\\Users\\home\\Desktop\\Web Driver 2.53\\AutoIt\\test1.exe");
		driver.findElement(By.xpath("//*[@id='begin-transfer']")).click();
							         
		
		
	}

}
