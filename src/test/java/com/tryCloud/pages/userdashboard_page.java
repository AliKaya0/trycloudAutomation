package com.tryCloud.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// about:blank
public class userdashboard_page {
    // No page elements added

    public userdashboard_page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}