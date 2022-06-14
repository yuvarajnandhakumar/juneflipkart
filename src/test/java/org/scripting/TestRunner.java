package org.scripting;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test//resources//Feature//Flipkart.feature",
				glue="org.scripting",
				tags={"@execution"},
				dryRun=true,
				monochrome=true,	
				plugin={"html:target","json:target/reports.json"}
		)









public class TestRunner {

}
