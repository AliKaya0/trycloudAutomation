package com.tryCloud.step_definitions;

import com.tryCloud.pages.FileModulePage;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ManageFolder_stepDefinitions {

    FileModulePage userDashboardPage = new FileModulePage();

    @When("user clicks the add icon on the top")
    public void user_clicks_the_add_icon_on_the_top() {
        userDashboardPage.addIconSpan.click();


    }

    @When("user click \"new folder”")
    public void user_click_new_folder() {
        userDashboardPage.iconNewFolder.click();

    }

    @When("user write a folder name")
    public void user_write_a_folder_name() {
        userDashboardPage.inputFolderName.sendKeys("testFolder");

    }

    @When("the user click submit icon")
    public void the_user_click_submit_icon() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form[@class='filenameform']/input[2]\n")));
        userDashboardPage.inputSubmitButton.click();

    }

    @Then("Verify the folder is displayed on the page")
    public void verify_the_folder_is_displayed_on_the_page() {
        for (WebElement myElement : userDashboardPage.listOfAllFiles) {
            if (myElement.getText().equals("testFolder")) {
                Assert.assertTrue(myElement.isDisplayed());
            }
        }
    }


}