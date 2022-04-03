package com.tryCloud.step_definitions;
import com.tryCloud.pages.Access_to_Files_module_page;
import com.tryCloud.utilities.ConfigurationReader;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class Access_to_Files_module_stepDefinition {

    Access_to_Files_module_page MyPage = new Access_to_Files_module_page();



    @Given("User on the dashboard page")
    public void user_on_the_dashboard_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

        for (
                String handle : Driver.getDriver().getWindowHandles()) {
                Driver.getDriver().switchTo().window(handle);
        }


        if (!Driver.getDriver().getTitle().contains("Dashboard - Trycloud QA"))
        {
            MyPage.user_login.sendKeys(ConfigurationReader.getProperty("username"));
            MyPage.user_password.sendKeys(ConfigurationReader.getProperty("password"));
            MyPage.submitButton.click();
        }
    }


    @When("The user clicks the -Files module")
    public void the_user_clicks_the_files_module() {
        MyPage.files_module_button.click();
    }

    @When("User click the top-left checkbox of the table")
    public void user_click_the_top_left_checkbox_of_the_table() {
        MyPage.select_all.click();
    }

    @Then("Verify all the files are selected")
    public void verify_all_the_files_are_selected() {


        ////*[@class='selection']

        List<WebElement> ck_bxs =Driver.getDriver().findElements(By.cssSelector("input:checked"));

        for (WebElement each:ck_bxs) {

            Assert.assertTrue(each.isSelected());

        }


    }

    @Then("Verify the page title is \"Files - Trycloud QA.”")
    public void verify_the_page_title_is_files_trycloud_qa() {

        for (String handle : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(handle);
        }

        String ActualTitle      = Driver.getDriver().getTitle();
        String ExpectedTitle    = "Files - Trycloud QA";

        Assert.assertEquals(ActualTitle, ExpectedTitle);

    }
}