package it524.interface_abstract.ex2.model;

public abstract class Employee  implements Reportable{

	//id, title, name, level
	
	private int id;
	private String title;
	private String name;
	private LevelType levelType;
	
	private static int empidcounter = 0;
	
	
	
	public Employee(String title, String name, LevelType levelType) {
		super();

		this.title = title;
		this.name = name;
		this.levelType = levelType;
		this.id = empidcounter++;
	}
	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LevelType getLevelType() {
		return levelType;
	}
	public void setLevelType(LevelType levelType) {
		this.levelType = levelType;
	}

	public void printInformation() {
		 System.out.println(
				 "Employee [id=" + id + ", title=" + title + ", name=" + name + ", levelType=" + levelType + "]");
	}
	
	
	
	
	
}
