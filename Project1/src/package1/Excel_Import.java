package package1;

import java.io.FileInputStream;
import jxl.Sheet;
import jxl.Workbook;

public class Excel_Import {

	public static void main(String[] args) throws Exception {

		FileInputStream f=new FileInputStream("C:\\Users\\home\\Desktop\\Web Driver 2.53\\test.xls");
		Workbook wb=Workbook.getWorkbook(f);
		Sheet s=wb.getSheet("Sheet1");
		System.out.println(s.getCell(0, 0).getContents());
	
		
		
	}

}
