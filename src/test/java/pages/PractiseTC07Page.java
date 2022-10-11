package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.webaudio.WebAudio;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PractiseTC07Page {
    public PractiseTC07Page() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//*[@href='/test_cases'])[1]")
    public WebElement testcaseLink;

    @FindBy(xpath = "(//h2)[1]")
    public WebElement testcaseTitle;
}
