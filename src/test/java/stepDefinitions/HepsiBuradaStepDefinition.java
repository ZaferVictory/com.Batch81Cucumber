package stepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Driver;

import java.util.List;

public class HepsiBuradaStepDefinition {
    @Given("Kullanici {string} sayfasinda")
    public void kullaniciSayfasinda(String arananUrl) {

        Driver.getDriver().get(arananUrl);
    }


}
