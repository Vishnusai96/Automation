package ddf;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
public static void main(String[] args) throws Throwable {
	//create object of fileinputstream class
			FileInputStream fise=new FileInputStream("C:\\Users\\VISHNU\\Documents\\EclipseWrokSpaces\\SeleniumJava\\src\\External\\Testdata.xlsx");
			//workbookfactrory open excel sheet
			Workbook wb = WorkbookFactory.create(fise);
			
			String data = wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
			System.out.println(data);//CHITTARI VISHNUSAI VARMA

			Double data1 = wb.getSheet("Sheet1").getRow(0).getCell(1).getNumericCellValue();
			System.out.println(data1);//28
			
			boolean data2 = wb.getSheet("Sheet1").getRow(0).getCell(2).getBooleanCellValue();
			System.out.println(data2);//true
			

}
}
