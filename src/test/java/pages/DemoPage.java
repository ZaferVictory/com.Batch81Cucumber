package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DemoPage {

    public DemoPage() {

        PageFactory.initElements(Driver.getDriver(),this);

    }


    @FindBy(xpath = "//*[@class='header-text'])[3]")
    public WebElement AlertWe;

    @FindBy(xpath = "(//*[text()='Alerts'])[2]")
    public WebElement Alert;
}
