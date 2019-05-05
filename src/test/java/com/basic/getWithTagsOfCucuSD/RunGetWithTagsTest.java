package com.basic.getWithTagsOfCucuSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
@RunWith(Cucumber.class)
@CucumberOptions(
			
			//dryRun=true,
			//tags={"@Important"}, //All scenario executed if this is tag for feature file
			 tags={"@Smoke"}, //only tag with @smoke
			//tags={"@Smoke","@Regression"}, //AND condition
			 //tags={"@Smoke,@Regression"} , // OR condition
			//tags={"~@Smoke"}, //will run all the test cases excluding smoke test
			monochrome=true,//by default monochrome is false. monochrome=true makes the logs more readable
			dryRun=false,
			features= {"src/test/resources/com/basic/getWithTagsOfCucuFF/GetWithCucumberTags.feature"},
			glue={"com/basic/getWithTagsOfCucuSD/"},
			plugin={"pretty",
					"html:target/cucumber-htmlreport",
					"json:target/cucumber-report6.json",
					"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"
			}
		)
		

public class RunGetWithTagsTest {


}
