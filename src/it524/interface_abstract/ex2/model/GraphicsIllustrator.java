package it524.interface_abstract.ex2.model;

public class GraphicsIllustrator extends SkilledEmployee{

	public GraphicsIllustrator(String title, String name, LevelType levelType, String[] skillList) {
		super(title, name, levelType, skillList);
		
		
		
		
		
	}
	
	public void drawGraphics() {
		System.out.println("Drawing....");
	}
	
	
	@Override
	public void printInformation() {
		
		System.out.println("Graphics Inllustrator:");
		super.printInformation();
		
		
	}

	
	
	
	
}
