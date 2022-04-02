package com.tryCloud.step_definitions;


import com.tryCloud.pages.US8Pages;
import com.tryCloud.utilities.ConfigurationReader;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

    public class US8_Step_Definitions {
            US8Pages us8Pages=new US8Pages();
        @When("user click action-icon from any file on the page")
        public void user_click_action_icon_from_any_file_on_the_page() {
        us8Pages.actionButton.click();
        }
        @When("user choose the {string} option")
        public void user_choose_the_option(String string) {
        us8Pages.deleteButton.click();
        }
       /* @When("the user clicks the {string} sub-module on the left side")
        public void the_user_clicks_the_sub_module_on_the_left_side(String string) {
        us8Pages.deletedFolder.click();
        }
        @Then("Verify the deleted file is displayed on the page.")
        public void verify_the_deleted_file_is_displayed_on_the_page() {

        }*/
}
