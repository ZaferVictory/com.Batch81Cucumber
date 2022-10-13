package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HerOkuHtmlPages {

    public HerOkuHtmlPages() {

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id='button']")
    public WebElement clickme;

    @FindBy(xpath = "//p[.=' down 32']")
    public List<WebElement> down32;

    @FindBy(xpath = "//p[.='click']")
    public List<WebElement> clicktext;

}
