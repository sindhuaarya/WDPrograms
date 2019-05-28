package package1;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Excel_PassData {

	public static void main(String[] args) throws Exception {
		
		FileInputStream f=new FileInputStream("C:\\Users\\home\\Desktop\\Web Driver 2.53\\test2.xls");
		Workbook wb=Workbook.getWorkbook(f);
		Sheet s=wb.getSheet("Sheet1");
		
		WebDriver driver=new FirefoxDriver();
		driver.get(s.getCell(0, 0).getContents());
		driver.manage().window().maximize();
		
		driver.findElement(By.id(s.getCell(0,1).getContents())).sendKeys(s.getCell(0, 2).getContents());
		driver.findElement(By.id(s.getCell(0,3).getContents())).sendKeys(s.getCell(0, 4).getContents());
			
	}

}
