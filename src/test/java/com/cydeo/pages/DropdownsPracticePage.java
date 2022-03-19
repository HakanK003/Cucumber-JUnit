package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DropdownsPracticePage {

    public DropdownsPracticePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//select[@id='month']")
    public WebElement monthDropdown;

    public WebElement selectMonth(String month){

        Select select = new Select(monthDropdown);

        select.selectByVisibleText(month);

        return select.getFirstSelectedOption();

    }

}
