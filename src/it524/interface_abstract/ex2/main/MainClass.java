package it524.interface_abstract.ex2.main;

import it524.interface_abstract.ex2.model.Editor;
import it524.interface_abstract.ex2.model.Employee;
import it524.interface_abstract.ex2.model.GraphicsIllustrator;
import it524.interface_abstract.ex2.model.LevelType;
import it524.interface_abstract.ex2.model.ReportTool;
import it524.interface_abstract.ex2.model.TechnicalWriter;

public class MainClass {
	
	
	public static void main(String[] args) {
		
		Employee illustrator = 
				new GraphicsIllustrator("Mr", "Ahmet",LevelType.EXPERIENCED,
						new String[] {"Adobe","Photoshop"});
		
		Employee writer = new TechnicalWriter("Ms", "Yasemin", LevelType.JUNIOR, new String[] {});
		
		Employee editor = new Editor("Mr", "Mehmet", LevelType.INTERMEDIATE, new String[] {"Word","Excel"}, true);
		
		
		//illustrator.printInformation();
		//System.out.println("----------");
		//writer.printInformation();
		//System.out.println("----------");
		//editor.printInformation();
		
		
		ReportTool tool = new ReportTool();
		tool.addReportable(editor);
		tool.addReportable(illustrator);
		tool.addReportable(writer);
		
		tool.generateReport();
		
		
	}
	

}
