package com.cydeo.step_definitions;

import com.cydeo.pages.EtsyHomePage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SD_EtsySearchAndTitle {

    EtsyHomePage etsyHomePage = new EtsyHomePage();

    @Given("User is on the Etsy home page")
    public void user_is_on_the_https_www_etsy_com() {

        Driver.getDriver().get("https://www.etsy.com");

    }
    @Then("User sees title is as expected")
    public void user_sees_title_is_as_expected() {

        String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";

        Assert.assertEquals("Title isn't as expected", expectedTitle, Driver.getDriver().getTitle());

    }

    @When("User types {string} in the search box")
    public void user_types_wooden_spoon_in_the_search_box(String str) {

        etsyHomePage.searchInputBox.sendKeys(str);

    }
    @When("User clicks etsy search button")
    public void user_clicks_etsy_search_button() {

        etsyHomePage.searchButton.click();

    }
    @Then("User sees {string} is in the title")
    public void user_sees_wooden_spoon_is_in_the_title(String expectedTitle) {

        Assert.assertTrue("Title doesn't contains expected words", Driver.getDriver().getTitle().contains(expectedTitle) );

    }


}
