package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.DataBasePage;
import utilities.ConfigReader;
import utilities.Driver;

public class DataBaseOutline {
    DataBasePage dataBasePage=new DataBasePage();

    Actions actions=new Actions(Driver.getDriver());

    @When("kullanici {string} adresine gider")
    public void kullaniciAdresineGider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @Then("new butonuna basar")
    public void newButonunaBasar() {
        dataBasePage.newButon.click();

    }

    @And("isim bolumune {string} girer")
    public void isimBolumuneGirer(String firstname) {
        dataBasePage.firstname.sendKeys(firstname);


    }

    @And("soy isim bolumune {string} girer")
    public void soyIsimBolumuneGirer(String lastname) {
        actions.sendKeys(Keys.TAB).sendKeys(lastname).perform();
    }

    @And("position bolumune {string} girer")
    public void positionBolumuneGirer(String position) {
        actions.sendKeys(Keys.TAB).sendKeys(position).perform();
    }

    @And("ofis bilgsi bolumune {string} girer")
    public void ofisBilgsiBolumuneGirer(String ofisbilgisi) {
        actions.sendKeys(Keys.TAB).sendKeys(ofisbilgisi).perform();
    }

    @And("extension bolumune {string} girer")
    public void extensionBolumuneGirer(String extencion) {
        actions.sendKeys(Keys.TAB).sendKeys(extencion).perform();
    }

    @And("startdate bolumune {string} girer")
    public void startdateBolumuneGirer(String startdate) {
        actions.sendKeys(Keys.TAB).sendKeys(startdate).perform();
    }

    @And("salary bolumune {string} girer")
    public void salaryBolumuneGirer(String salary) {
        actions.sendKeys(Keys.TAB).sendKeys(salary).perform();
    }

    @And("Create tusuna basar")
    public void createTusunaBasar() {
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER);
    }

    @When("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String firstname) {
        dataBasePage.search.sendKeys(firstname);
    }

    @Then("isim bolumunde {string} oldugunu dogrular")
    public void isimBolumundeOldugunuDogrular(String isim) {
        Assert.assertTrue(dataBasePage.isimVar.getText().contains(isim));
    }


}
