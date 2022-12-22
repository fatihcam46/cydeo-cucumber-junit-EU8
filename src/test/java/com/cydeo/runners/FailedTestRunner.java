package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/cydeo/step_definitions",//copy and paste from runner class
        features = "@target/rerun.txt"      //target is rerun,txt
)
//it is running just failing things
public class FailedTestRunner {
}