package it524.interface_abstract.ex2.model;

public class Editor extends SkilledEmployee{

	private boolean prefersPaperEditing;

	public Editor(String title, String name, LevelType levelType, String[] skillList, boolean prefersPaperEditing) {
		super(title, name, levelType, skillList);
		this.prefersPaperEditing = prefersPaperEditing;
	}

	public boolean isPrefersPaperEditing() {
		return prefersPaperEditing;
	}

	public void setPrefersPaperEditing(boolean prefersPaperEditing) {
		this.prefersPaperEditing = prefersPaperEditing;
	}
	
	
	@Override
	public void printInformation() {
		System.out.println("Editor:");
		super.printInformation();
		
		System.out.println("Paper editing:" + prefersPaperEditing);
	}
	
	
}
