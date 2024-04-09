package Feb29;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {

	public static void main(String[] args) throws IOException {
		String filepath="C:\\software\\Java\\WriteFile.txt";
		
		FileWriter filewriter=new FileWriter(filepath);
		
		BufferedWriter bufferedWriter = new BufferedWriter(filewriter);
		bufferedWriter.write("Welcome to Java Writing");
 		bufferedWriter.write("\n");
 		bufferedWriter.write("Second Line");
 		bufferedWriter.write("\n");
 		bufferedWriter.write("Another Line");
 		
 		bufferedWriter.close();
	}

}
