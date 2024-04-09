package Feb29;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadTextFile {

	public static void main(String[] args) throws IOException {
		//1. Define the path of the file
		String filepath="C:\\software\\Java\\ReadFile.txt";
		
		//2. Read the file 
		FileReader filereader=new FileReader(filepath);
		
		////3. Read the file line by Line
		BufferedReader bufferreader=new BufferedReader(filereader);
		
		/*
		 * System.out.println(bufferreader.readLine());
		 * System.out.println(bufferreader.readLine());
		 * System.out.println(bufferreader.readLine());
		 */
		String str;
		while((str = bufferreader.readLine())!=null) {
		
			System.out.println(str);
		}
	
	}

}