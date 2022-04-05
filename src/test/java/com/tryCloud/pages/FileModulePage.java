package com.tryCloud.pages;

import io.cucumber.java.de.Wenn;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FileModulePage extends BasePage {

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    String fileName;
    String deletedFileXpath="//span[contains(text(),'"+fileName+"')]";

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[2]")
    public WebElement filesButton;

    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[1]/td[2]/a/span[3]/a[2]/span[1]")
    public WebElement actionButton;

    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[1]/td[2]/div/ul/li[8]/a")
    public WebElement deleteButton;

    @FindBy(xpath = "//div[@class='fileActionsMenu popovermenu bubble open menu']/ul//li//a/*/following-sibling::span")
    public List<WebElement> threeDotOptions;

    @FindBy(xpath = " //*[@id=\"app-navigation\"]/ul/li[7]/a")
    public WebElement deletedFolder;


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


    @FindBy(xpath = "//a[@class='action action-restore permanent']")
    public WebElement restoreButton;



    @FindBy(xpath = "//span[@class='innernametext'][1]")
    public WebElement firstFileName;

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[7]/a")
    public WebElement contactsModule;

    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[1]/td[2]/a/span[1]/span")
    public WebElement firstFileToBeDeleted;

    @FindBy(xpath = "//div[3]/div[2]/div[13]/table/tbody/tr/td[2]/a/span[1]/span[1]")
    public WebElement deletedFile;

}
