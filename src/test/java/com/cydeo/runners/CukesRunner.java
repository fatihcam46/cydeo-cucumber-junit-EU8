package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;//for Junit it is runnable

@RunWith(Cucumber.class)
@CucumberOptions(   //it is coming
        plugin = {  //location of plugin  :reports
        //  "pretty",   //used to print out additional information about the scenario currently executed
             "html:target/cucumber-reports.html",//will allow us to decide the type of the report we want to generate
             "rerun:target/rerun.txt",  //this generates rerun.txt for keep tracking of failed tests
             "me.jvt.cucumber.report.PrettyReports:target/cucumber",//MAVEN CUCUMBER REPORTING
        },
        features = "src/test/resources/features",  //we provide the path of the 'features' directory and let our project know where to find all of the feature files.
        glue="com/cydeo/step_definitions",     // glue gives path to the package of the step_definitions
        dryRun = false,   // if false:our code will run as expected.  if true:don't run step definitions //dryRun determines if we want to execute the step_definitions or not
        tags = "" //which I want to run write here
                    //look which scenario is running//Tags allows us to create different scenario suites or groups to run
       // publish = true
)

public class CukesRunner {
}
