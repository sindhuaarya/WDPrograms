package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmaill {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\Desktop\\Web Driver 2.53\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String baseurl="https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
		driver.get(baseurl);
		driver.manage().window().maximize();
	
		WebElement signin=driver.findElement(By.id("identifierId"));
		signin.sendKeys("sindhu.sham88@gmail.com");
		
	
	}

}
