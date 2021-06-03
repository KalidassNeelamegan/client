package org.testRunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.resources.Utility;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(glue="org.stepDefinition",features="src/test/resources",dryRun=false, plugin= {"pretty","json:target/cucumber_report/report.json"},monochrome=true)
public class TestRunner {
	@AfterClass
	public static void generatereport(){
		Utility.generateJvmReport("target/cucumber_report/report.json");
	}

}
