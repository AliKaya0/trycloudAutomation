package com.tryCloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FileModulePage2 extends BasePage {

    @FindBy(xpath = "(//table[@id='filestable']//tr)[2]/td[2]//span[@class='icon icon-more']")
    public WebElement actionIcon;

    @FindBy (xpath = "//div[@class='fileActionsMenu popovermenu bubble open menu']//li//span")
    public List<WebElement> actionIconOptions;

    @FindBy(xpath = "//a[@class='menu-option option-favorite']//span[.='Remove from favorites']")
    public WebElement removeFromFavorites;

    @FindBy(xpath = "//div[@id='app-navigation']//li//a")
    public List<WebElement> subModules;

    @FindBy (xpath = "(//table[@id='filestable']//tr)[2]/td[2]//span[@class='innernametext']")
    public WebElement firstDocument;

    @FindBy(css = "a.button.new")
    public WebElement plusIcon;

    @FindBy(css = "span.svg.icon.icon-upload")
    public WebElement uploadFile;


    @FindBy(xpath = "//input[@id='file_upload_start']")
    public WebElement uploadFile2;

    @FindBy (xpath = "//button[.='Cancel']")
    public WebElement cancelButton;


    @FindBy(xpath = "//span[.='temp_image']")
    public WebElement uploadedSampleFile;



    //Favorite page

    @FindBy (xpath = "//td[@class='filename']//span[@class='nametext']")
    public List<WebElement> favoriteDoc;

}
