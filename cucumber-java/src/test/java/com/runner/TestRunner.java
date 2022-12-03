package com.runner;

import org.junit.runner.RunWith;

//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/main/resources/Feature/booking.feature"}
		,glue={"stepDefinitions"}
				
		)

public class TestRunner {

}
