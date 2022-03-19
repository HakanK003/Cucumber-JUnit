package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SmartBearOrderPage {

    public SmartBearOrderPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }


    @FindBy(xpath = "//a[.='Order']")
    public WebElement orderTab;

    @FindBy(xpath = "//a[.='View all orders']")
    public WebElement allOrdersTab;

    @FindBy(xpath = "//select[@name='ctl00$MainContent$fmwOrder$ddlProduct']")
    public WebElement productDropdown;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$txtQuantity']")
    public WebElement quantityInputBox;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$txtName']")
    public WebElement customerNameInputBox;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox2']")
    public WebElement streetInputBox;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox3']")
    public WebElement cityInputBox;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox4']")
    public WebElement stateInputBox;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox5']")
    public WebElement zipInputBox;

    @FindBy(xpath = "//table[@id='ctl00_MainContent_fmwOrder_cardList']//td")
    public List<WebElement> cards;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox6']")
    public WebElement cardNo;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox1']")
    public WebElement expireDate;

    @FindBy(xpath = "//a[@id='ctl00_MainContent_fmwOrder_InsertButton']")
    public WebElement processButton;

}
