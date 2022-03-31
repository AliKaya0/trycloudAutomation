package com.tryCloud.step_definitions;

import com.tryCloud.pages.SettingPages;
import com.tryCloud.utilities.ConfigurationReader;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Setting_StepDefs {

    SettingPages settingPages = new SettingPages();

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        settingPages.usernameInput.sendKeys(ConfigurationReader.getProperty("username"));
        settingPages.passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
        settingPages.login.click();


    }
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {

        settingPages.files.click();

    }
    @When("user clicks Settings on the left bottom corner")
    public void user_clicks_settings_on_the_left_bottom_corner() {

        settingPages.settings.click();

    }
    @Then("the user should be able to click any buttons")
    public void the_user_should_be_able_to_click_any_buttons() {

    }

    @When("user checks the current storage usage")
    public void user_checks_the_current_storage_usage() {

    }
    @When("user uploads file with the upload file option")
    public void user_uploads_file_with_the_upload_file_option() {

    }
    @When("user refresh the page")
    public void user_refresh_the_page() {

    }
    @Then("the user should be able to see storage usage is increased")
    public void the_user_should_be_able_to_see_storage_usage_is_increased() {

    }



}
