package generic_utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_File_Utility {

	public String readDatafromExcl(String Sheetname,int rownum,int cellnum) throws Throwable {
		FileInputStream fise=new FileInputStream("Iconstant_Utility.excelpath");
		Workbook wb = WorkbookFactory.create(fise);
		String value = wb.getSheet(Sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
		return value;

}
}
