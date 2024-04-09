package Feb29;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UseOfDirecotyWiterFile {

	public static void main(String[] args) throws IOException {
		/*1.define th path of the file
		 * user dir : it will give path till project
		 * filesaperaore is use insted of slash \\ int th path
		
		*/
		String userDir=System.getProperty("user.dir");
		System.out.println(userDir);
	String filesaperatore=System.getProperty("file.saparatore");
	System.out.println(filesaperatore);
	//String filepath="C:\\Users\\hypat\\eclipse-workspace\\AdvanceJ_ava\\Files\\Write1.txt";
	String filepath1=userDir+filesaperatore+"Files"+filesaperatore+"Write1.txt";
	System.out.println(filepath1);
	
	// 2. write the file
	
	FileWriter filewriter =new FileWriter(filepath1);
	
	//3. write line by line
	
	BufferedWriter bufferwriter=new BufferedWriter(filewriter);
	bufferwriter.write("Welcome to Java \n ");
	bufferwriter.write("\n");
	
	bufferwriter.write("Welcome to Python ");
	//bufferwriter.write("Welcome to c ");
	//bufferwriter.write("Welcome to Selenium");
	bufferwriter.close();
	//System.out.println("Program completed");
	}

}
