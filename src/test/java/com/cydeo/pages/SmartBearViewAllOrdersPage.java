package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SmartBearViewAllOrdersPage {

    public SmartBearViewAllOrdersPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//a[.='Order']")
    public WebElement orderTab;

    @FindBy(xpath = "//a[.='View all orders']")
    public WebElement allOrdersTab;

    @FindBy(xpath = "//table[@class='SampleTable']//tr")
    public List<WebElement> listedOrders;

}
