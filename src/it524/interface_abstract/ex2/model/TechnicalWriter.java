package it524.interface_abstract.ex2.model;

public class TechnicalWriter extends SkilledEmployee{

	public TechnicalWriter(String title, String name, LevelType levelType, String[] skillList) {
		super(title, name, levelType, skillList);
		// TODO Auto-generated constructor stub
	
	}

	public void write() {
		System.out.println("Ediyor Writing...");
	}
	
	@Override
	public void printInformation() {
		System.out.println("TEchnical Writer");
		super.printInformation();
	}
	
	
}
