package com.Cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="./src/test/java/com/Cucumber", 
glue= {"com.Cucumber.LoginSteps"},
plugin= {
		"pretty","html:target/CucumberHTMLreport.html"
}					
	)

public class Runner {

}
