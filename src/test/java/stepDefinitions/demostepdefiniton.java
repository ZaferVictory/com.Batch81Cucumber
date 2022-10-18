package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.DemoPage;
import utilities.Driver;

public class demostepdefiniton {
    DemoPage demoPage=new DemoPage();
    Actions actions=new Actions(Driver.getDriver());

    @When("kullanici Alerts butonuna tiklar")
    public void kullaniciAlertsButonunaTiklar() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        demoPage.AlertWe.click();

    }

    @And("kullanici On button click, alert will appear after {int} seconds karsisindaki click me  butonuna basar")
    public void kullaniciOnButtonClickAlertWillAppearAfterSecondsKarsisindakiClickMeButonunaBasar(int arg0) {
    }

    @And("kullanci Allert’in gorunur olmasini bekler")
    public void kullanciAllertInGorunurOlmasiniBekler() {
    }

    @And("kullanici Allert uzerindeki yazinin “This alert appeared after {int} seconds” oldugunu test  eder")
    public void kullaniciAllertUzerindekiYazininThisAlertAppearedAfterSecondsOldugunuTestEder(int arg0) {
    }

    @And("kullanici ok diyerek alerti kapatir")
    public void kullaniciOkDiyerekAlertiKapatir() {
    }
}
