package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinition {
    AmazonPage amazonpage=new AmazonPage();

    @Given("Kullanici amazon sayfasina gider")
    public void kullaniciAmazonSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @Then("kullanici nutella aratir")
    public void kullaniciNutellaAratir() {
        amazonpage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);
    }

    @And("sonuclarin nutella icerdigini test eder")
    public void sonuclarinNutellaIcerdiginiTestEder() {
    String arananKelime="Nutella";
    String actual=amazonpage.aramaSonucElementi.getText();
    Assert.assertTrue(actual.contains(arananKelime));
    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }

    @Then("kullanici Selenium aratir")
    public void kullaniciSeleniumAratir() {
        amazonpage.aramaKutusu.sendKeys("Selenium", Keys.ENTER);
    }

    @And("sonuclarin Selenium icerdigini test eder")
    public void sonuclarinSeleniumIcerdiginiTestEder() {
        String arananKelime="Selenium";
        String actual=amazonpage.aramaSonucElementi.getText();
        Assert.assertTrue(actual.contains(arananKelime));
    }

    @Then("kullanici iphone aratir")
    public void kullaniciIphoneAratir() {
        amazonpage.aramaKutusu.sendKeys("iphone", Keys.ENTER);
    }

    @And("sonuclarin iphone icerdigini test eder")
    public void sonuclarinIphoneIcerdiginiTestEder() {
        String arananKelime="iphone";
        String actual=amazonpage.aramaSonucElementi.getText();
        Assert.assertTrue(actual.contains(arananKelime));

    }


    @Then("kullanici {string} icin arama yapar")
    public void kullaniciIcinAramaYapar(String aranankelime) {

        amazonpage.aramaKutusu.sendKeys(aranankelime,Keys.ENTER);
    }

    @And("sonuclarin {string} icerdigini test eder")
    public void sonuclarinIcerdiginiTestEder(String aranankelime) {

        String actual=amazonpage.aramaSonucElementi.getText();
        Assert.assertTrue(actual.contains(aranankelime));

    }
}
