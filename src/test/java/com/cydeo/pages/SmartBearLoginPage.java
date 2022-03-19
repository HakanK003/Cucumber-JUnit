package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearLoginPage {

    public SmartBearLoginPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//input[@name='ctl00$MainContent$username']")
    public WebElement usernameInputBox;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$password']")
    public WebElement passwordInputBox;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$login_button']")
    public WebElement loginButton;

}
