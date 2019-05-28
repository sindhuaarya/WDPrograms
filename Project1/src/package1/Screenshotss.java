package package1;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Screenshotss {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/search?q=wolves+lyrics&rlz=1C1CHBD_enIN689IN689&oq=wolves+&aqs=chrome.1.69i57j0l5.2650j0j7&sourceid=chrome&ie=UTF-8");
		driver.manage().window().maximize();
		
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\home\\Desktop\\Web Driver 2.53\\Screenshot1.png"));
		
	}

}
