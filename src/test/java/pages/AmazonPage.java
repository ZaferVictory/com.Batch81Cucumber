package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {
    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="twotabsearchtextbox")
    public WebElement  aramaKutusu;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement aramaSonucElementi;

    @FindBy(xpath = "//*[@id='nav-link-accountList']")
    public WebElement AccountList;

    @FindBy(xpath = "//*[@class='nav-action-inner']")
    public WebElement signinButonu;

    @FindBy(xpath = "//*[@id='ap_email']")
    public WebElement email;

    @FindBy(xpath = "(//*[@id='continue'])[2]")
    public WebElement continioBox;

    @FindBy(xpath = "//*[text()='There was a problem']")
    public WebElement ProblemMesajı;

    @FindBy(xpath = "//*[@class='a-expander-prompt']")
    public WebElement needHelp;

    @FindBy(xpath = "//*[@id='auth-fpp-link-bottom']")
    public WebElement forgetpasswordLink;

    @FindBy(xpath = "//h1")
    public WebElement passwordasstanceText;

    @FindBy(xpath = "//*[@id='createAccountSubmit']")
    public WebElement createYourAccountButton;

    @FindBy (xpath = "//h1")
    public WebElement createAccountText;
}
