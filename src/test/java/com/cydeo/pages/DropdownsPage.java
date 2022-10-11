package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropdownsPage {
    public DropdownsPage(){
        PageFactory.initElements(com.cydeo.utilities.Driver.getDriver(), this);
    }

    @FindBy(id = "month")//inspect//copy//id month
    public WebElement monthDropdown;
}
