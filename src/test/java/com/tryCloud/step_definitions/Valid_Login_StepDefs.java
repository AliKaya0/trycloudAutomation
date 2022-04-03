package com.tryCloud.step_definitions;


import com.tryCloud.pages.LoginPage;
import com.tryCloud.utilities.ConfigurationReader;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class Valid_Login_StepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("user on the login page")
    public void user_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }
    @When("user uses username {string} and passcode {string}")
    public void user_uses_username_and_passcode(String username, String password) {
        loginPage.login(username, password);


    }
    @When("user clicks the login button")
    public void user_clicks_the_login_button() {
        loginPage.loginButton.click();
    }
    @Then("should be at the dashboard page")
    public void should_be_at_the_dashboard_page() {
        Driver.getDriver().getCurrentUrl().contains("dashboard");
    }




}
