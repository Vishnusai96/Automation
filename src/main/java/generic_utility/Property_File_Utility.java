package generic_utility;

import java.io.FileInputStream;
import java.util.Properties;

public class Property_File_Utility {

public String readDataFromPF(String keyString) throws Throwable {
	FileInputStream fiS =new FileInputStream("Iconstant_Utility.propertypath");
	Properties p=new Properties();
	p.load(fiS);
	String value=p.getProperty(keyString);
	return value;
	
}	
	

	}


