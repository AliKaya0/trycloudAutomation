package com.tryCloud.pages;

import com.tryCloud.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Map;

public class LoginPage extends BasePage {

    @FindBy(id="user")
    public WebElement inputUsername;

    @FindBy(id="password")
    public WebElement inputPassword;

    @FindBy(id="submit-form")
    public WebElement loginButton;

    public void login(String username, String password){
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
    }


    public void login(){
        inputUsername.sendKeys(ConfigurationReader.getProperty("username"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();
    }

}
