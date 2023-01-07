package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiSearchPage2 {
    public WikiSearchPage2(){
        PageFactory.initElements(com.cydeo.utilities.Driver.getDriver(), this);
    }
    @FindBy(xpath = "//*[@id=\"js-link-box-en\"]/strong")
    public WebElement englishButton;
    @FindBy(xpath = "//*[@id=\"searchInput\"]") // inspect>>copy>>paste
    public WebElement searchBox;
    @FindBy(xpath = "//*[@id=\"searchButton\"]")
    public WebElement searchButton;

    @FindBy(id = "firstHeading")
    public WebElement mainHeader;


}
