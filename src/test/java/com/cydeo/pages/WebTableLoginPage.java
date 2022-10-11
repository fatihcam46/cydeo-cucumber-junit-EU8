package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage {
    public WebTableLoginPage(){
        PageFactory.initElements(com.cydeo.utilities.Driver.getDriver(), this);
    }

    @FindBy(name = "username") // copy from https://web-table-2.cydeo.com/login
    public WebElement inputUsername;

    @FindBy(name = "password")  // copy from https://web-table-2.cydeo.com/login
    public WebElement inputPassword;

    @FindBy(xpath = "//button[.='Login']")  // copy from https://web-table-2.cydeo.com/login
    public WebElement loginButton;

    /**
     * No parameters.
     * When we call this method, it will directly login using
     *
     * Username: Test
     * Password: Tester
     */
    public void login(){
        this.inputUsername.sendKeys("Test");//this keyword:referring object
        this.inputPassword.sendKeys("Tester");
        this.loginButton.click();
    }

    /**
     * This method will accept two arguments and login.
     * @param username  //@param means parameter
     * @param password
     */
    public void login(String username, String password){
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        loginButton.click();
    }

    /**
     * This method will log in using credentials from
     * configuration.properties
     */
    public void loginWithConfig(){
        inputUsername.sendKeys(com.cydeo.utilities.ConfigurationReader.getProperty("web.table.username"));//from configuration.properties
        inputPassword.sendKeys(com.cydeo.utilities.ConfigurationReader.getProperty("web.table.pw"));
        loginButton.click();
    }
}
