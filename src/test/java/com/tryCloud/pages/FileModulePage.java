package com.tryCloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FileModulePage extends BasePage {


    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[2]")
    public WebElement filesButton;

    @FindBy(xpath = "//tbody[@id='fileList']/tr[2]/td[2]//a[2]")
    public WebElement actionButton;

    @FindBy(xpath = "//span[text()='Delete file']/..")
    public WebElement deleteButton;

    @FindBy(xpath = "//div[@class='fileActionsMenu popovermenu bubble open menu']/ul//li//a/*/following-sibling::span")
    public List<WebElement> threeDotOptions;

    @FindBy(xpath = " //*[@id=\"app-navigation\"]/ul/li[7]/a")
    public WebElement deletedFolder;

}
