package it524.io.ex1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopy {

	
	public static void main(String[] args) {
		
		
		try ( 
				BufferedInputStream reader = 
				new BufferedInputStream(
						new FileInputStream(
								"/Users/user/Desktop/download.jpg"));
				
				BufferedOutputStream writer 
					= new BufferedOutputStream(
							new FileOutputStream("/Users/user/Desktop/download_copy.jpg"));
				
				){
			
				int b = 0;
				
				while((b=reader.read())!=-1) {
					
					writer.write(((byte)b));
					
					
				}
		
					writer.flush();
					
					System.out.println("Done!!");
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	
	
}
