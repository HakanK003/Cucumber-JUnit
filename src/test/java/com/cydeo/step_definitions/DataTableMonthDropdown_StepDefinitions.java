package com.cydeo.step_definitions;

import com.cydeo.pages.DropdownsPracticePage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class DataTableMonthDropdown_StepDefinitions {

    DropdownsPracticePage dropdownsPracticePage = new DropdownsPracticePage();

    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {

        Driver.getDriver().get("https://practice.cydeo.com/dropdown");

    }
    @Then("User should see see below info in month dropdown")
    public void user_should_see_months_in_month_dropdown(List<String> months) {

        for (String each : months) {

            String actualOption = dropdownsPracticePage.selectMonth(each).getText();

            Assert.assertEquals(each, actualOption);

        }


    }


}
