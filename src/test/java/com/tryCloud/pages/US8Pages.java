package com.tryCloud.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US8Pages extends BasePage {


    @FindBy(xpath ="//*[@id=\"appmenu\"]/li[2]")
    public WebElement filesButton;

    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[1]/td[2]/a/span[2]/a[2]")
    public WebElement actionButton;

    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[1]/td[2]/div/ul/li[9]/a")
    public WebElement deleteButton;

    @FindBy (xpath =" //*[@id=\"app-navigation\"]/ul/li[7]/a" )
    public WebElement deletedFolder;

}
