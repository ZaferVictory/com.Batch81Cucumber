package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PractiseFormPage {
    public PractiseFormPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
        @FindBy(xpath = "//*[@name='username']")
        public WebElement username;

        @FindBy(xpath = "//*[@name='password']")
        public WebElement password;

    @FindBy(xpath = "//*[text()='Comments...']")
    public WebElement textcomment;

    @FindBy(xpath = "//*[@name='filename']")
    public WebElement chooseFile;

    @FindBy(xpath = "(//*[@name='checkboxes[]'])[1]")
    public WebElement checkBox1;

    @FindBy(xpath = "(//*[@name='checkboxes[]'])[2]")
    public WebElement checkBox2;

    @FindBy(xpath = "(//*[@name='checkboxes[]'])[3]")
    public WebElement checkBox3;

    @FindBy(xpath = "(//*[@name='radioval'])[2]")
    public WebElement radiobutton2;


    @FindBy(xpath = "//option[@value='ms3']")
    public WebElement selectionItem;

    @FindBy(xpath = "//select[@name='dropdown']")
    public WebElement dropdown;

    @FindBy(xpath = "(//*[@name='submitbutton'])[2]")
    public WebElement submitButonu;

    @FindBy(xpath = "//*[@id='_valuefilename']")
    public WebElement filename;




}
