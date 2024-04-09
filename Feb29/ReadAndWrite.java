package Feb29;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadAndWrite {

	public static void main(String[] args) throws IOException {
		//reading file
		
		String filepath="C:\\software\\Java\\ReadAndWrite.txt";
		FileReader filereader=new FileReader(filepath);
		System.out.println(filepath);
		BufferedReader bufferReader =new BufferedReader(filereader);
		String str;
		while((str=bufferReader.readLine())!=null)
		{
			System.out.println(str);
		}
		// Writing into same file
		FileWriter filewriter=new FileWriter(filepath,true);
		
		BufferedWriter bufferwriter=new BufferedWriter(filewriter);
		
		bufferwriter.write("Wednesday");
		bufferwriter.write("\n");
		bufferwriter.write("Thurday");
		bufferwriter.write("\n");
		bufferwriter.write("Friday");
		bufferReader.close();
		bufferwriter.close();
	}

}
