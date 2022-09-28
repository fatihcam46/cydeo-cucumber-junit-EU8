package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GoogleStepDefinitions {
    @When("user is on Google search page")
    public void user_is_on_google_search_page() {
        Driver.getDriver().get("https://google.com");
    }

    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        String expectedTitle ="Google";
        String actualTitle = Driver.getDriver().getTitle();
        WebElement acceptCookiesButton = Driver.getDriver().findElement(By.xpath("//*[@id=\"L2AGLb\"]/div"));
        acceptCookiesButton.click();

        Assert.assertEquals(actualTitle, expectedTitle);
        Driver.closeDriver();
}}
