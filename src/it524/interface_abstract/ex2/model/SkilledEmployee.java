package it524.interface_abstract.ex2.model;

public class SkilledEmployee extends Employee{

	private String[] skillList;
	
	public SkilledEmployee(String title,String name,LevelType levelType,
			String[] skillList) {
		super(title, name, levelType);
		this.skillList = skillList;
		
	}
	
	
	public String[] getSkillList() {
		return skillList;
	}

	public void printInformation() {

		super.printInformation();

		for (String skill : skillList) {
			System.out.println(skill);
		}


	}
	
	
	
	
	
	
	
	
	
}
