package it524.interface_abstract.ex2.model;

public class Manager extends Employee{

	
	private Employee[] employeeList;
	
	public Manager(String title, String name, LevelType levelType,
			Employee[] employeeList) {
		super(title, name, levelType);
		this.employeeList = employeeList;
		
	}
	
	public Employee[] getEmployeeList() {
		return employeeList;
	}
	
	
	public void printInformation() {
		
		super.printInformation();
		for (Employee employee : employeeList) {
			System.out.println(employee.getName());
		}
		
		
	}
	
	
	
	
	
	
}
