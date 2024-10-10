package com.omrbranch.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.omrbranch.baseclass.BaseClass1;
import com.omrbranch.report.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(tags = ("@Search"), stepNotifications = true, publish = true, snippets = SnippetType.CAMELCASE, monochrome = false, dryRun = false, plugin = {
		"pretty",
		"json:target//output1.json" }, glue = "com.omrbranch.stepdefinition", features = "src\\test\\resources")

public class TestRunner extends BaseClass1 {

//	@AfterClass
//	public static void generateReport() {
//		Reporting.generateJVMReport(getProjectPath()+"\\target\\output1.json");
//	}

}
//com.omrbranch.stepdefinition