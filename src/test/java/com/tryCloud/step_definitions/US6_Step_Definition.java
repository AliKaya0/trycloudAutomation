package com.tryCloud.step_definitions;

import com.tryCloud.pages.FileModulePage2;
import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.bouncycastle.jcajce.provider.symmetric.IDEA;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class US6_Step_Definition {

    FileModulePage2 fileModulePage = new FileModulePage2();
    String firstDocumentName ="";


    @When("the users click action-icon from any file on the page to remove")
    public void the_users_click_action_icon_from_any_file_on_the_page_to_remove() {

        firstDocumentName = fileModulePage.firstDocument.getText();
        fileModulePage.actionIcon.click();
        //System.out.println(firstDocumentName);

    }
    @When("user click the {string} sub-module on the left side")
    public void user_click_the_sub_module_on_the_left_side(String subModule) {
        for (WebElement each : fileModulePage.subModules) {
            if(each.getText().equalsIgnoreCase(subModule)){
                each.click();
                break;
            }
        }




    }
    @Then("Verify that the file is removed from the Favorites sub-module’s table")
    public void verify_that_the_file_is_removed_from_the_favorites_sub_module_s_table() {
        System.out.println(fileModulePage.favoriteDoc.size());
        for (WebElement each : fileModulePage.favoriteDoc) {
            Assert.assertFalse(each.getText().equalsIgnoreCase(firstDocumentName));
        }


    }



    @When("user chooses the {string} option")
    public void user_chooses_the_option(String string) {

        for (WebElement each: fileModulePage.actionIconOptions) {
            if (each.getText().equals(string)){
                each.click();
                break;

            }



        }


    }



    @When("the user clicks the add icon on the top")
    public void the_user_clicks_the_add_icon_on_the_top() {
        fileModulePage.plusIcon.click();
        BrowserUtils.sleep(4);
    }
    //In order to pass this test, you need to provide the path of the file you would like to upload
    @When("user uploads file with the upload file option")
    public void user_uploads_file_with_the_upload_file_option() {
        String pathOfTheFile = "C:\\Users\\neyuc\\Downloads\\temp_image.jpg";
        fileModulePage.uploadFile2.sendKeys(pathOfTheFile);

//        try {
//            fileModulePage.cancelButton.click();
//            System.out.println("The file was already uploaded before");
//
//
//        } catch (RuntimeException e){
//
//
//            e.printStackTrace();
//
//        }

        //fileModulePage.uploadFile.click();
        //fileModulePage.uploadFile2.sendKeys(Keys.ESCAPE);
        BrowserUtils.sleep(4);

    }
    @Then("Verify the file is displayed on the page")
    public void verify_the_file_is_displayed_on_the_page() {
        Assert.assertTrue(fileModulePage.uploadedSampleFile.getText().contains("temp_image"));
        BrowserUtils.sleep(4);

    }


}
