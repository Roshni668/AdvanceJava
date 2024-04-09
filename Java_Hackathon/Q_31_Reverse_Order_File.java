package Java_Hackathon;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q_31_Reverse_Order_File {
	public static void main(String[] args) {

	        String inputFile = "C:\\software\\Java\\Hello.txt";
	        String outputFile = "C:\\software\\Java\\Hello.output";

	        List<String> lines = new ArrayList<>();

	        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                lines.add(line);
	            }
	        } catch (IOException e) {
	            e.getMessage();
	            return;
	        }
	        Collections.reverse(lines);

	        try (FileWriter writer = new FileWriter(outputFile)) { 
	            for (String line : lines) {
	                writer.write(line + System.lineSeparator());
	            }
	            System.out.println("File content reversed and written to " + outputFile);
	        } catch (IOException e) {
	            e.getMessage();
	        }
	    }

}
