package it524.interface_abstract.ex2.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReportTool {

	private List<Reportable> reportables;
	
	public ReportTool() {
		reportables = new ArrayList<>();
	}
	
	public void generateReport() {
		for (Reportable reportable : reportables) {
			reportable.printInformation();
		}
	}
	
	
	public void addReportable(Reportable reportable) {
		
		this.reportables.add(reportable);
		
	}
	
	
	
	
}
