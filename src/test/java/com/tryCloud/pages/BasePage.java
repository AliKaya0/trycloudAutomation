package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//ul[@id='appmenu'])/li")
    public List<WebElement> modules;

    @FindBy(xpath = "(//ul[@id='appmenu'])/li/a/span")
    public List<WebElement> modulesText;


}
