package com.tryCloud.step_definitions;

import com.tryCloud.pages.BasePage;
import com.tryCloud.pages.SettingPage;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class MainModules_stepDef {

    BasePage mainPage = new SettingPage();

    @Then("Verify the user see the following modules")
    public void verify_the_user_see_the_following_modules(List<String> expectedList) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(mainPage.modules.get(1)).perform();
        List <String> actualList = new ArrayList<>();
        for (WebElement webElement : mainPage.modulesText) {
            if(!webElement.getText().isBlank()){
                actualList.add(webElement.getText());
                Assert.assertTrue(webElement.isDisplayed());
            }

        }
        Assert.assertEquals(expectedList, actualList);




    }
}
