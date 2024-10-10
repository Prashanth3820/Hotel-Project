package com.omrbranch.report;

import java.io.File;  
import java.util.ArrayList;
import java.util.List;

import com.omrbranch.baseclass.BaseClass1;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting extends BaseClass1{
	
	public static void generateJVMReport(String jsonFileReport) {
		//1. Mention the path of jvm report where to store ?
		File file = new File(getProjectPath()+"\\CucumberClass\\target");
		
		//2. Create the object for Configuration Class
		Configuration config = new Configuration(file, "Facebook Automation");
		
		//3. Pass the key,value as Details--browser,os,versions,sprint
		config.addClassifications("OS","WIN11");
		config.addClassifications("Browser", "Chrome");
		
		
		//4. Create the object for Reportbuilder class to read res from JSON file
		List<String> jsonFiles = new ArrayList<>();
		jsonFiles.add(jsonFileReport);
		ReportBuilder builder = new ReportBuilder(jsonFiles, config);
		
		//5. Generate the JVM Report
		builder.generateReports();
		
			

	}

}
