package com.cydeo.step_definitions;

import com.cydeo.pages.SmartBearLoginPage;
import com.cydeo.pages.SmartBearOrderPage;
import com.cydeo.pages.SmartBearViewAllOrdersPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.Objects;

public class SmartBear_StepDefinitions {

    SmartBearLoginPage smartBearLoginPage = new SmartBearLoginPage();
    SmartBearViewAllOrdersPage smartBearViewAllOrdersPage = new SmartBearViewAllOrdersPage();
    SmartBearOrderPage smartBearOrderPage = new SmartBearOrderPage();


    @Given("User is logged into SmartBear Tester account and on Order page")
    public void user_is_logged_into_smart_bear_tester_account_and_on_order_page() {

        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2ftestcomplete12%2fweborders%2fDefault.aspx ");

        smartBearLoginPage.usernameInputBox.sendKeys("Tester");

        smartBearLoginPage.passwordInputBox.sendKeys("test");

        smartBearLoginPage.loginButton.click();

        smartBearViewAllOrdersPage.orderTab.click();

    }

    @When("User selects {string} from product dropdown")
    public void user_selects_family_album_from_product_dropdown(String productType) {

        BrowserUtils.selectFromDropdown(smartBearOrderPage.productDropdown, productType);

    }

    @When("User enters {string} to quantity")
    public void user_enters_to_quantity(String quantity) {

        smartBearOrderPage.quantityInputBox.sendKeys(quantity);
      
    }

    @When("User enters {string} to costumer name")
    public void user_enters_john_wick_to_costumer_name(String name) {

        smartBearOrderPage.customerNameInputBox.sendKeys(name);
      
    }

    @When("User enters {string} Ave to street")
    public void user_enters_kinzie_ave_to_street(String street) {

        smartBearOrderPage.streetInputBox.sendKeys(street);

    }

    @When("User enters {string} to city")
    public void user_enters_chicago_to_city(String city) {

        smartBearOrderPage.cityInputBox.sendKeys(city);

    }

    @When("User enters {string} to state")
    public void user_enters_il_to_state(String state) {

        smartBearOrderPage.stateInputBox.sendKeys(state);

    }

    @When("User enters {string} to zip")
    public void user_enters_to_zip(String zip) {

        smartBearOrderPage.zipInputBox.sendKeys(zip);

    }

    @When("User selects {string} as card type")
    public void user_selects_visa_as_card_type(String cardType) {

        for (WebElement each : smartBearOrderPage.cards) {

            if (Objects.equals(each.getText(), cardType)){
                each.click();
                break;
            }

        }

    }

    @When("User enters {string} to card number")
    public void user_enters_to_card_number(String cardNo) {

        smartBearOrderPage.cardNo.sendKeys(cardNo);
      
    }

    @When("User enters {string} to expiration date")
    public void user_enters_to_expiration_date(String expirationDate) {

        smartBearOrderPage.expireDate.sendKeys(expirationDate);

    }

    @When("User clicks process button")
    public void user_clicks_process_button() {

        smartBearOrderPage.processButton.click();
      
    }

    @Then("User verifies {string} is in the list")
    public void user_verifies_john_wick_is_in_the_list(String name) {

        smartBearOrderPage.allOrdersTab.click();

        for (WebElement eachOrder : smartBearViewAllOrdersPage.listedOrders) {


            if (eachOrder.getText().contains(name)) {

                Assert.assertTrue(eachOrder.getText().contains(name));
                break;

            }

        }

      
    }


}
