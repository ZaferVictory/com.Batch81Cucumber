package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import pages.googlePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class MakasSearchDefinition {
    googlePage googlePage=new googlePage();
     int trendyolMaksaSonucu;
     int morhipoMakasSonucu;
     String trendyolHandle;
     String morhipoHandle;

    @Given("Google'a gidildi")
    public void googleAGidildi() {
        Driver.getDriver().get(ConfigReader.getProperty("google"));
    }

    @Then("trendyol'u aratıldı")
    public void trendyolUAratıldı() {
       googlePage.googAramaKutusu.sendKeys("trendyol", Keys.ENTER);

    }

    @Then("trendyol linkine tiklandi")
    public void trendyolLinkineTiklandi() {
        googlePage.trendyolLink.click();
        trendyolHandle=Driver.getDriver().getWindowHandle();

    }

    @Then("makas aratildi")
    public void makasAratildi() {
        googlePage.trendyolsearchbox.sendKeys("Makas",Keys.ENTER);
    }

    @Then("toplam urun sayisini alindi")
    public void toplamUrunSayisiniAlindi() {
        String temp;
       temp= googlePage.trendyolMakasSonucu.getText().replaceAll("\\D","");
       trendyolMaksaSonucu=Integer.parseInt(temp);

    }

    @Then("yeni sekmede morhipo'ya gidildi")
    public void yeniSekmedeMorhipoYaGidildi() {
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("morhipo"));
        morhipoHandle=Driver.getDriver().getWindowHandle();
    }

    @Then("morhipoda makas aratildi")
    public void morhipodaMakasAratildi() {
        googlePage.morhipoaramaButonu.sendKeys("Makas",Keys.ENTER);

    }

    @Then("morhipoda toplam urun sayisi alindi")
    public void morhipodaToplamUrunSayisiAlindi() {
        morhipoMakasSonucu= Integer.parseInt(googlePage.morhipomakasSonucu.getText());
    }

    @Then("iki sitedeki toplam makas sayisi karsilastirildi")
    public void ikiSitedekiToplamMakasSayisiKarsilastirildi() {



    }

    @Then("urun sayisi fazla olan site kapatildi")
    public void urunSayisiFazlaOlanSiteKapatildi() {
        if (trendyolMaksaSonucu>morhipoMakasSonucu){
            Driver.getDriver().switchTo().window(trendyolHandle).close();

        }
        else Driver.getDriver().switchTo().window(morhipoHandle).close();
    }

    @And("acik kalan diger sayfa da kapatildi")
    public void acikKalanDigerSayfaDaKapatildi() {
        //Driver.getDriver().switchTo().window(morhipoHandle);
        Driver.quitDriver();
    }
}
