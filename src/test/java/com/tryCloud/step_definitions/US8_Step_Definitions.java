package com.tryCloud.step_definitions;


import com.tryCloud.pages.FileModulePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US8_Step_Definitions {
    FileModulePage fileModulePage = new FileModulePage();
    String nameInFileModule="";
    @When("user click action-icon from any file on the page")
    public void user_click_action_icon_from_any_file_on_the_page() {
        nameInFileModule=fileModulePage.firstFileToBeDeleted.getText();
        fileModulePage.actionButton.click();

    }

    @When("user choose the {string} option")
    public void user_choose_the_option(String string) {
        /*fileModulePage.setFileName(fileModulePage.firstFileName.getText());
        for (int i = 0; i < fileModulePage.threeDotOptions.size(); i++) {
            if (fileModulePage.threeDotOptions.get(i).getText().equals(string)) {
                fileModulePage.threeDotOptions.get(i).click();
            }
        }*/
        fileModulePage.deleteButton.click();

    }

    @When("the user clicks the {string} sub-module on the left side")
    public void theUserClicksTheSubModuleOnTheLeftSide(String arg0) {

        fileModulePage.deletedFolder.click();
    }

    @Then("Verify the deleted file is displayed on the page.")
    public void verifyTheDeletedFileIsDisplayedOnThePage() {



        String nameInDeletedFolder=fileModulePage.deletedFile.getText();

        Assert.assertEquals(nameInFileModule, nameInDeletedFolder);

        fileModulePage.restoreButton.click();

    }

}
