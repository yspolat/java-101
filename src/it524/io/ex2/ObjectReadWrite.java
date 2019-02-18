package it524.io.ex2;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class ObjectReadWrite {

	
	public static void main(String[] args) {

		// First create dat
		
		/*
		Person p1 = new Person(1,"pinar","altay");
		Person p2 = new Person(1,"ali","altay");
		Person p3 = new Person(1,"veli","altay");
		Person p4 = new Person(1,"osman","altay");
		Person p5 = new Person(1,"ahmet","altay");
		
		List<Person> people = new ArrayList<>();
		
		people.add(p1);
		people.add(p2);
		people.add(p3);
		people.add(p4);
		people.add(p5);
		
		
		try (ObjectOutputStream writer 
				= new ObjectOutputStream(
						new FileOutputStream("/Users/user/Desktop/person.dat"));
		
		
				){
			
		//writer.writeObject(p1);
			writer.writeObject(people);
			writer.flush();
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		*/

		// Second read dat

		try(
				
				ObjectInputStream reader 
					= new ObjectInputStream(new FileInputStream("/Users/user/Desktop/person.dat"));
				
				)
		
		{
			
		 //Person p =	 (Person)reader.readObject();
			//System.out.println(p.getName());
			
			List<Person> people = (List<Person>)reader.readObject();
			
			for (Person person : people) {
				System.out.println(person.getName());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}
	

	
	
}
