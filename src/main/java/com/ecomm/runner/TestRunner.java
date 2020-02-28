package com.ecomm.runner;

 
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src/main/java/com/ecomm/qa/features/SummerDresses.feature",
		glue={"com/ecomm/qa/stepdefinitions"},//path to the step definitions
		format = {"pretty", "html:target/Destination"},
		monochrome=true, //display the ouput in readable format
		strict=true, // it will check if any step is not definited in the step defintion file
		dryRun=false) // to check the proper matching between feature file and step def file
		//tags={"-@SmokeTest"

public class TestRunner {
	
}
