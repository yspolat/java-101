package it524.inner.ex1;

public class Book {

	private String title;
	private Chapter chapter;
	
	private Page coverPage;
	
	
	public void setCoverPage() {

		int yavuz=5;


		//Local inner class
				class CoverPage implements Page{
					String title;
					int year;
					public String getTitle() {
						return title;
					}
					
					public void setTitle(String title) {
						this.title = title;
					}
					public int getYear() {
						return year;
					}
					
					public void setYear(int year) {
						this.year = year;
					}


					@Override
					public String getContent() {
						return title + " " + year;
								
					}
					
				}
		
		CoverPage cvPage = new CoverPage();
		cvPage.setYear(1999);
		cvPage.setTitle("Cover Page");
		
		this.coverPage = cvPage;
	
	}
	
	public Page getCoverPage() {
		return this.coverPage;
	}
	
	interface Page{
		public String getContent();
	}
	
	//Member inner class
	class Chapter{
		private int no;
		private String title;
		
		public Chapter() {

		}
		
		public void setTitle(String title) {
			this.title = title;
		}
		public String getTitle() {
			return title;
		}
		
		public void setNo(int no) {
			this.no = no;
		}
		
		public int getNo() {
			return no;
		}
		
		
	}
	
	static class StaticTest{
		
	}
	
	public void setChapter(Chapter chapter) {
		this.chapter = chapter;
	}
	
	public Chapter getChapter() {
		return chapter;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	
}


