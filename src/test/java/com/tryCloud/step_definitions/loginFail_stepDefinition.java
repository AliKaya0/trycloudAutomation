package com.tryCloud.step_definitions;

import com.tryCloud.pages.LoginFailPage;
import com.tryCloud.utilities.ConfigurationReader;
import com.tryCloud.utilities.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class loginFail_stepDefinition {
    LoginFailPage myNewObject= new LoginFailPage();

    @Given("user on the login page")
    public void user_on_the_login_page() {

    }
    //

    @When("user enter invalid {string} and {string}")
    public void user_enter_invalid_and(String login,String password) {

        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

        myNewObject.login.sendKeys(login);
        myNewObject.password.sendKeys(password);




    }

    @When("user click the login button")
    public void user_click_the_login_button() {
        myNewObject.loginButton.submit();

    }

    @Then("verify {string} message should be displayed")
    public void verify_message_should_be_displayed(String message) {
       Assert.assertEquals(myNewObject.message.getText(),message);

    }


}