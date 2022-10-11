package com.cydeo.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewAllOrdersPage extends BasePage {
    public ViewAllOrdersPage(){
    PageFactory.initElements(com.cydeo.utilities.Driver.getDriver(), this);
}

    //we need to locate the first cell of the first row
    //                  table                         table body 1st row  table row table 1st cell
    @FindBy(xpath = "//table[@class='table is-fullwidth']/tbody/tr[1]/td[1]")
    public WebElement newCustomerCell;
}

