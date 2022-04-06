package com.tryCloud.step_definitions;


import com.tryCloud.pages.FileModulePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US8_Step_Definitions {
    FileModulePage fileModulePage = new FileModulePage();

    @When("user click action-icon from any file on the page")
    public void user_click_action_icon_from_any_file_on_the_page() {
        fileModulePage.actionButton.click();
    }

    @When("user choose the {string} option")
    public void user_choose_the_option(String string) {

        for (int i = 0; i < fileModulePage.threeDotOptions.size(); i++) {
            if (fileModulePage.threeDotOptions.get(i).getText().equals(string)) {
                fileModulePage.threeDotOptions.get(i).click();
            }
        }

    }
       @When("the user clicks the {string} sub-module on the left side")
        public void the_user_clicks_the_sub_module_on_the_left_side(String string) {
        fileModulePage.deletedFolder.click();
        }
        @Then("Verify the deleted file is displayed on the page.")
        public void verify_the_deleted_file_is_displayed_on_the_page() {
            fileModulePage.deletedFolder.isDisplayed();
        }
}
