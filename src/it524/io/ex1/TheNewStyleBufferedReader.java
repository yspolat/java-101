package it524.io.ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TheNewStyleBufferedReader {

	
	public static void main(String[] args) {
		
		
		Path path =
				Paths.get("/Users/user/Desktop/test2.txt");
		
		try {
			BufferedReader reader =
					Files.newBufferedReader(path);
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		try {
			List<String> lines =  Files.readAllLines(path);
			
			for (String line : lines) {
				System.out.println(line);
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	
}
