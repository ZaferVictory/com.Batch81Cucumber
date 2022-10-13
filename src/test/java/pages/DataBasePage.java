package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DataBasePage {
    public DataBasePage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='New']")
    public WebElement newButon;

    @FindBy(xpath = "//*[@id='DTE_Field_first_name']")
    public WebElement firstname;

    @FindBy(xpath = "//*[@type='text']")
    public WebElement search;

    @FindBy(xpath = "//*[@class='sorting_1']")
    public WebElement isimVar;
}
