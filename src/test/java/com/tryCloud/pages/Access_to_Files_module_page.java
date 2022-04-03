package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Access_to_Files_module_page extends BasePage {

    //Login page
    @FindBy(id = "user")
    public WebElement user_login;

    @FindBy(id = "password")
    public WebElement user_password;

    @FindBy(id = "submit-form")
    public WebElement submitButton;

    //********************************************************

    //Dashboard page

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[2]")
    public WebElement files_module_button;


    //Files page

    @FindBy(xpath = "//*[@for ='select_all_files']")
    public WebElement select_all;


    @FindBy(xpath = "//*[@class='selection']")
    public WebElement each_checkBox;




    //************* My Utils *************

    public static void CheckPageTitle() {
        for (String handle : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(handle);


        }




    }
}
