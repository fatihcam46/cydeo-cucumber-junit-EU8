package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    /*
In this class we will store WebElements common to all pages
 */
     public BasePage(){
            PageFactory.initElements(com.cydeo.utilities.Driver.getDriver(), this);
        }
                                                        //https://web-table-2.cydeo.com/
        @FindBy(xpath = "//button[.='View all orders']")//inspect//copy//button xpath//
        public WebElement viewAllOrders;

        @FindBy(xpath = "//button[.='View all products']")
        public WebElement viewAllProducts;

        @FindBy(xpath = "//button[.='Order']")
        public WebElement order;

        @FindBy(xpath = "//button[.='Logout']")
        public WebElement logoutButton;


    }
