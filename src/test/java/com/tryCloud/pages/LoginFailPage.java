package com.tryCloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginFailPage extends BasePage{



    @FindBy(id = "user")
    public WebElement login;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "submit-form")
    public WebElement loginButton;

    @FindBy(css="[class*='warning']")
    public WebElement message;





}
