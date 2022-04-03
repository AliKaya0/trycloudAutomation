package com.tryCloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SettingPage extends BasePage {


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
