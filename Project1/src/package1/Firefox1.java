package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox1 {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("dealers.axiomtelecom.com:8010");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("LoginName")).sendKeys("super@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Axion@123");
		driver.findElement(By.id("btnlogin")).click();
		
		
	}

}
