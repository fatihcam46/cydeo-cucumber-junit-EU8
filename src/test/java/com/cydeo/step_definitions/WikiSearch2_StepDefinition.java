package com.cydeo.step_definitions;


import com.cydeo.pages.WikiSearchPage2;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WikiSearch2_StepDefinition {
    WikiSearchPage2 wikiSearchPage2 = new WikiSearchPage2();
    @Given("User is on Wikipedia home page2")
    public void user_is_on_wikipedia_home_page2() {
        com.cydeo.utilities.Driver.getDriver().get("https://www.wikipedia.org");
    }
    @Then("User clicks English wiki search button")
    public void user_clicks_english_wiki_search_button() {
        wikiSearchPage2.englishButton.click();
    }
    @When("User types {string} in the English wiki search box")
    public void user_types_in_the_english_wiki_search_box(String string) {
        wikiSearchPage2.searchBox.sendKeys(string);
    }
    @When("User clicks search button")
    public void user_clicks_search_button() {
        wikiSearchPage2.searchButton.click();
    }
    @Then("User sees {string} is in the English wiki title")
    public void user_sees_is_in_the_english_wiki_title(String string) {
        Assert.assertTrue(wikiSearchPage2.mainHeader.isDisplayed());

    }

}
