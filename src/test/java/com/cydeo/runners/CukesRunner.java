package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-reports.html",
        features = "src/test/resources/features",
        glue="com/cydeo/step_definitions",
        dryRun = false,   // if false:our code will run as expected.  if true:don't run step definitions
        tags = "@Regression"//look here which scenario is running
)
public class CukesRunner {
}
