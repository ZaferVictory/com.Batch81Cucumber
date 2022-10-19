package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PractiseNagatifTestPage {

    public PractiseNagatifTestPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement signinsembol;

    @FindBy(xpath = "//*[text()='Sign in']")
    public WebElement signinbuton;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement email;


    @FindBy(xpath = "//*[@id='password']")
    public WebElement password;

    @FindBy (xpath = "(//*[.='Sign in'])[4]")
    public WebElement signinWithCredentials;

    @FindBy (xpath = "//*[contains(text(), 'Authentication information not correct.')]")
    public WebElement popUpMessage;

}
