package stepDefinitions;

import io.cucumber.java.en.*;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.PractiseTC07Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class Practise_TC_07steps {
    PractiseTC07Page practiseTC07Page=new PractiseTC07Page();

    @Given("Tarayıciyi baslatarak {string} url'sine gidin")
    public void tarayiciyi_baslatarak_url_sine_gidin(String istenenUrl) {
        Driver.getDriver().get(istenenUrl);

    }
    @Then("Ana sayfanın basariyla gorunur oldugunu dogrulayin")
    public void ana_sayfanin_basariyla_gorunur_oldugunu_dogrulayin() {
        String homeUrl="https://automationexercise.com/";
        Assert.assertEquals("home url esit degil", homeUrl,Driver.getDriver().getCurrentUrl());

    }
    @Then("Test Case buttonu na tiklayin")
    public void test_case_buttonu_na_tiklayin() {
    practiseTC07Page.testcaseLink.click();

    }
    @Then("Kullanicinin test case sayfasina basariyla yonlendirildigini dogrulayin")
    public void kullanicinin_test_case_sayfasina_basariyla_yonlendirildigini_dogrulayin() {
    Assert.assertTrue(practiseTC07Page.testcaseTitle.isDisplayed());

    }
    @Then("Ilgili sayfanin ekran goruntusunu alin")
    public void ilgili_sayfanin_ekran_goruntusunu_alin() {

        try {
            ReusableMethods.getScreenshot("TestCase07 Page");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    }
