package it524.io.ex1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadWrite {

	public static void main(String[] args) {
		
		//Char based
		
		//Absolute path vs relative path:
		
		//Absolute Path
		// /Users/....
		// c://tt/tt/test.txt
		
		
		//Relative Path
		// Documents
		
		// jboss/
		
		
		//File f =new File("/Users/user/Desktop/test.txt");
	
		//FileWriter writer =  null;
		
		/*
		try {
			writer = 
					new FileWriter("/Users/user/Desktop/test.abc");
			
			writer.write("test test testtt.....\nnew line llll");
			writer.flush();
			System.out.println("Done!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		*/
		/*
		try(
				FileWriter writer = 
				new FileWriter("/Users/user/Desktop/test.abc");
				
				){
			
			
			writer.write("test test testtt.....\nnew line llll");
			writer.flush();
			System.out.println("Done!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		try(
				FileReader reader = new FileReader("/Users/user/Desktop/test.abc");

				){
				
				StringBuilder buffer = new StringBuilder();
			
				int c = 0;
				while((c=reader.read())!=-1) {
					
					buffer.append((char)c);
					
					
				}
				
				System.out.println(buffer);
		
		
			} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
}
