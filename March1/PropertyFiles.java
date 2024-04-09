package March1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Properties;

public class PropertyFiles {

	public static void main(String[] args) throws Exception {
	// 1. define th path of the file 
		String filepath="C:\\Users\\hypat\\eclipse-workspace\\AdvanceJ_ava\\Files\\AppPropeti.properties.properites";
		System.out.println(filepath);
	
		//2. load thi file into the file object
		FileInputStream fileinput =new FileInputStream(filepath);
		// 3. create the object as propetyfile
		
		Properties prop=new Properties();
		prop.load(fileinput);
		
		//String str;
		
		for(Map.Entry display:prop.entrySet()) 
		{
			System.out.println(display.getKey()+" "+display.getValue());
		}
		System.out.println(prop.get("username"));
		System.out.println(prop.size());
		prop.setProperty("age","33");
		
		
		fileinput.close();
		
		
		
	
		

	}

}
