package com.weborders.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(  //Is like parameterization of xml runner in testNG
        glue = "com/vytrack/step_definitions",   //right click on step_definitions, copy "path from source root"
        features = "src/test/resources/features/", // right click on feature and copy path  "Path From Content Root"
        dryRun = false, //use true to verify then after use false to run actual test
        strict = false,
        tags =  "@create_car_ddt",      //@driver and @Dashboard -->some test is name like these
        plugin= {
                "html:target/default-report",
                "json:target/cucumber1.json"
        }
)
public class CucumberRunner {
    //Click run here and run this class. --->anytime you want to run click here
    //Open the console and copy all the snippets below
    //Paste the snippets in the "LoginStepDefinitions" class  under step_definition Package

}