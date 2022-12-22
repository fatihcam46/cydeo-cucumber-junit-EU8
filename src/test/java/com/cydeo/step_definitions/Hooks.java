package com.cydeo.step_definitions;

/*
In the class we will be able to pass pre- & post- conditions to
 each scenario and each step
 */

//  import cydeo.utilities.*;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.*;
import org.openqa.selenium.*;

public class Hooks {
    //import from io.cucumber.java not from junit
//   @Before (order = 1)  //second
    public void setupScenario(){
        System.out.println("====Setting up browser using cucumber @Before");
    }
//two @Before or more than @Before is possible
//    @Before (value = "@login", order = 2) //i added login.feature @login//third
   public void setupScenarioForLogins(){
      System.out.println("====this will only apply to scenarios with @login tag");
   }

//  @Before (value = "@db", order = 0)  //@db  database scenario//order of @Before`s//first
  public void setupForDatabaseScenarios(){
       System.out.println("====this will only apply to scenarios with @db tag");
  }


    @After
    public void teardownScenario(Scenario scenario){
//I want to take a screenshot after the scenario that's why teardownScenario
// scenario.isFailed() --> if scenario fails this method will return TRUE boolean value
        //if scenario fails this will true
      if (scenario.isFailed()){
//starting to learn how screenshot?? downcast to TakesScreenshot , I allow to use
          byte [] screenshot = ((TakesScreenshot) com.cydeo.utilities.Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
//attach(screenshot,... without if possible                    //current scenario name
       }


      BrowserUtils.sleep(5);
       // com.cydeo.utilities.Driver.closeDriver();

       System.out.println("====Closing browser using cucumber @After");
        System.out.println("====Scenario ended/ Take screenshot if failed!");
    }

//    @BeforeStep
   public void setupStep(){
      System.out.println("--------> applying setup using @BeforeStep");
   }

 //   @AfterStep
   public void afterStep(){
       System.out.println("--------> applying tearDown using @AfterStep");
    }


}
