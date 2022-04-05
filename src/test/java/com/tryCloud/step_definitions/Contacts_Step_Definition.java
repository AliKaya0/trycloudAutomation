package com.tryCloud.step_definitions;

import com.tryCloud.pages.FileModulePage;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Contacts_Step_Definition {
    FileModulePage fileModulePage=new FileModulePage();
    @When("the user clicks the Contacts module")
    public void the_user_clicks_the_contacts_module() {
   fileModulePage.contactsModule.click();
    }
    @Then("verify the page title is {string}")
    public void verify_the_page_title_is(String string) {
        String actualT=Driver.getDriver().getTitle();
        Assert.assertEquals(string,actualT);

    }
}
