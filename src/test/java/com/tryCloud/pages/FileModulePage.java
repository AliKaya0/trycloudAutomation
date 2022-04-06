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

  @FindBy(xpath ="//*[@id=\"appmenu\"]/li[7]/a" )
  public WebElement contactsModule;




    //Veronica's locators

    @FindBy(css = "#appmenu li[data-id='files'] svg")
    public WebElement tabElementSvg;

    @FindBy(css = ".icon-add")
    public WebElement addIconSpan;

    @FindBy(xpath = "//a[@class='menuitem']")
    public WebElement iconNewFolder;

    @FindBy(id = "view13-input-folder")
    public WebElement inputFolderName;

    @FindBy(xpath = "//span[@class='innernametext']")
    public List<WebElement> listOfAllFiles;

    @FindBy(xpath = "//form[@class='filenameform']/input[2]\n")
    public WebElement inputSubmitButton;

    @FindBy(xpath = "//span[.='testFolder']/..//span[.='Actions']/..")
    public WebElement testFolderOfActionButton;

    @FindBy(xpath = "//a[.='Deleted files']")
    public WebElement deletedFiles;

    @FindBy(xpath = "(//span[.='Delete permanently']/..)[2]")
    public WebElement deletePermanently;


}
