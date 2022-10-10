package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class googlePage {

    public googlePage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='gLFyf gsfi']")
    public WebElement googAramaKutusu;

    @FindBy(xpath = "(//*[@class='LC20lb MBeuO DKV0Md'])[1]")
    public WebElement trendyolLink;

    @FindBy(xpath = "//*[@class='vQI670rJ']")
    public WebElement trendyolsearchbox;

    @FindBy(xpath = "//*[@class='dscrptn']")
    public WebElement trendyolMakasSonucu;

    @FindBy(xpath = "//*[@id='pw-search-input']")
    public WebElement morhipoaramaButonu;

    @FindBy(xpath = "//*[@id='total-product-count']")
    public WebElement morhipomakasSonucu;

}
