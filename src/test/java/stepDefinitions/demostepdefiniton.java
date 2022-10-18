package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DemoPage;
import utilities.Driver;

import java.time.Duration;

public class demostepdefiniton {
    DemoPage demoPage=new DemoPage();
    Actions actions=new Actions(Driver.getDriver());
    WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));

    @When("kullanici Alerts butonuna tiklar")
    public void kullaniciAlertsButonunaTiklar() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        demoPage.alertWE.click();

    }

    @And("kullanici On button click, alert will appear after {int} seconds karsisindaki click me  butonuna basar")
    public void kullaniciOnButtonClickAlertWillAppearAfterSecondsKarsisindakiClickMeButonunaBasar(int arg0) {

        demoPage.click.click();
    }

    @And("kullanci Allert’in gorunur olmasini bekler")
    public void kullanciAllertInGorunurOlmasiniBekler() {

        wait.until(ExpectedConditions.alertIsPresent());
    }

    @And("kullanici Allert uzerindeki yazinin “This alert appeared after {int} seconds” oldugunu test  eder")
    public void kullaniciAllertUzerindekiYazininThisAlertAppearedAfterSecondsOldugunuTestEder(int arg0) {
        String alertyazısı=Driver.getDriver().switchTo().alert().getText();
        String expectedalertyazısı="This alert appeared after 5 seconds";
        Assert.assertEquals(expectedalertyazısı,alertyazısı);
    }

    @And("kullanici ok diyerek alerti kapatir")
    public void kullaniciOkDiyerekAlertiKapatir() {

        Driver.getDriver().switchTo().alert().accept();
    }

    @Then("kullanici Will enable bes seconds butonunun enable olmasini bekler")
    public void kullaniciWillEnableBesSecondsButonununEnableOlmasiniBekler() {
    wait.until(ExpectedConditions.elementToBeClickable(demoPage.enable));
    }

    @And("kullanici Will enable bes seconds butonunun enable oldugunu test edir")
    public void kullaniciWillEnableBesSecondsButonununEnableOldugunuTestEdir() {

        Assert.assertTrue(demoPage.enable.isEnabled());
    }
}
