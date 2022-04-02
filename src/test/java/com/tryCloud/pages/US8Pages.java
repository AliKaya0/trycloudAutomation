package com.tryCloud.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US8Pages extends BasePage {


    @FindBy(xpath ="//*[@id=\"appmenu\"]/li[2]")
    public WebElement filesButton;

    @FindBy(xpath = "//tbody[@id='fileList']/tr[2]/td[2]//a[2]")
    public WebElement actionButton;

    @FindBy(xpath = "//span[text()='Delete file']/..")
    public WebElement deleteButton;

    @FindBy (xpath =" //*[@id=\"app-navigation\"]/ul/li[7]/a" )
    public WebElement deletedFolder;

}
