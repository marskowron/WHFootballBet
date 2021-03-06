package tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions (
		monochrome=true,
		features = "src/feature",
		glue = {"stepDefinitions"},
		format = {"pretty", "json:output/cucumber.json", "html:output/cucumber-pretty"}
		)

public class TestRun {

}
