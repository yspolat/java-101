package it524.inner.ex1;

import it524.inner.ex1.Book.Chapter;

public class MainClass {

	public static void main(String[] args) {

		//Inner Classes
		// 1) Member Inner Class
				//1-a) Normal
				//1-b) Static
		
		// 2) Local Inner Classes
		
		// 3) Anonymous Inner Class
		
		
		Book book = new Book();
		Chapter ch = new Book() .new Chapter(); // Member Inner Class - Normal (Non-Static)
		
		book.setChapter(ch);
		
		//StaticTest tst = new Book.StaticTest();
		
		book.setCoverPage();
		System.out.println(book.getCoverPage().getContent());
		
	}
}
