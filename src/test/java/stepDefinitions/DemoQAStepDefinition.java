package stepDefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DemoPage;
import utilities.Driver;

import java.time.Duration;

public class DemoQAStepDefinition {
    DemoPage demoPage=new DemoPage();
    WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));

    @And("Visible After bes seconds butonunun gorunur olmasini bekleyin")
    public void visibleAfterBesSecondsButonununGorunurOlmasiniBekleyin() {
        wait.until(ExpectedConditions.visibilityOf(demoPage.visible));
    }

    @And("Visible After bes seconds butonunun gorunur oldugunu test edin")
    public void visibleAfterBesSecondsButonununGorunurOldugunuTestEdin() {
        Assert.assertTrue(demoPage.visible.isDisplayed());
    }
}
