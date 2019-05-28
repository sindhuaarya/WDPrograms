package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FB {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\Desktop\\Web Driver 2.53\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("sindhu.sham88@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Pegasus@88Sai");
		
		Actions a=new Actions(driver);
		WebElement login=driver.findElement(By.xpath("//*[@id='u_0_2']"));
		a.moveToElement(login).build().perform();   
		a.click();
		
		//Actions b=new Actions(driver);
		WebElement master=driver.findElement(By.xpath("//*[@id='u_0_c']/a"));
		a.moveToElement(master).build().perform();	
		driver.findElement(By.xpath("//*[@id='u_0_c']/a")).click();
		
		//Actions c=new Actions(driver);
		WebElement zone=driver.findElement(By.xpath("//*[@id='js_qx']/div"));
		a.moveToElement(zone).build().perform();
		driver.findElement(By.xpath("//*[@id='js_qx']/div")).click();
		
		
	}

}
