package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingPages extends BasePage{


    @FindBy(id = "user")
    public WebElement usernameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(id = "submit-form")
    public WebElement login;

    @FindBy(xpath = "(//li[@data-id='files'])[1]")
    public WebElement files;

    @FindBy(xpath = "//button[@class='settings-button']")
    public WebElement settings;


}
