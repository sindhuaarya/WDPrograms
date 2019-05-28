package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Axiom1 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\Desktop\\Web Driver 2.53\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://cf.axiomtelecom.com:458/Admin/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//*[@id='userId']")).sendKeys("administrator");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("CFAxiomPWD$123");
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		
		//Moving cursor to dropdown
		Actions a=new Actions(driver);
		WebElement master=driver.findElement(By.xpath("//*[@id='ul_Dynamic']/li[1]/a/span"));
		a.moveToElement(master).build().perform();	
		driver.findElement(By.xpath("//*[@id='ul_Dynamic']/li[1]/a/span")).click();
		
		WebElement zone=driver.findElement(By.xpath("//*[@id='top']"));
		a.moveToElement(zone).build().perform();
		
		WebElement zonesetup=driver.findElement(By.xpath("//*[@id=ul_Dynamic']/li[1]/ul/li[5]/ul/li/a"));
		a.moveToElement(zonesetup).build().perform();
		driver.findElement(By.xpath("//*[@id=ul_Dynamic']/li[1]/ul/li[5]/ul/li/a")).click();
		
		WebElement country=driver.findElement(By.xpath("//*[@id='accordion-control-right-group']/div[1]/div[1]/div[1]/div[2]/span/span[1]/span"));
		a.moveToElement(country).build().perform();
		driver.findElement(By.xpath("//*[@id='accordion-control-right-group']/div[1]/div[1]/div[1]/div[2]/span/span[1]/span")).click();
		
		WebElement saudi=driver.findElement(By.xpath("//*[@id='accordion-control-right-group']/div[1]/div[2]/div[1]"));
		a.moveToElement(saudi).build().perform();
		driver.findElement(By.xpath("//*[@id='accordion-control-right-group']/div[1]/div[2]/div[1]")).click();
		
		WebElement custid=driver.findElement(By.xpath("//*[@id='accordion-control-right-group']/div[1]/div[2]/div[1]/div[2]/span/span[1]/span/ul/li/input"));
		a.moveToElement(custid).build().perform();
		driver.findElement(By.xpath("//*[@id='accordion-control-right-group']/div[1]/div[2]/div[1]/div[2]/span/span[1]/span/ul/li/input")).click();
		
		WebElement axiomretail=driver.findElement(By.xpath("//*[@id='accordion-control-right']/div/div[4]/ul/li[2]/a"));
		a.moveToElement(axiomretail).build().perform();
		driver.findElement(By.xpath("//*[@id='accordion-control-right']/div/div[4]/ul/li[2]/a")).click();
		
		WebElement searchh=driver.findElement(By.xpath("//*[@id='btnsearch']/i"));
		a.moveToElement(searchh).build().perform();
		driver.findElement(By.xpath("//*[@id='btnsearch']/i")).click();
		
		WebElement newzone=driver.findElement(By.xpath("//*[@id='ddlCstNewZone']"));
		a.moveToElement(newzone).keyDown(newzone, Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//*[@id='ddlCstNewZone']")).click();
		
	}

}
