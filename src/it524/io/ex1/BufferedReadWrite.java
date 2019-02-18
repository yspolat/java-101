package it524.io.ex1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReadWrite {

	public static void main(String[] args) {
		
		/*
		try (
				BufferedWriter writer 
				= new BufferedWriter(
						new FileWriter("/Users/user/Desktop/test2.txt"));
				
				)
		
		{
			
			for (int i = 0; i < 1000; i++) {
				
				
				for (int j = 0; j < 100; j++) {
					writer.write("test ");
				}
				
				writer.write("\n");
				
			}
			
			writer.flush();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		
		try(
				BufferedReader reader 
				= new BufferedReader(
						new FileReader("/Users/user/Desktop/test2.txt"));
				
				)
		
		{
			
			
			String line = "";
			
			while((line=reader.readLine())!=null) {
				
				System.out.println(line);
				
				
				
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
	
	
	
	
}
