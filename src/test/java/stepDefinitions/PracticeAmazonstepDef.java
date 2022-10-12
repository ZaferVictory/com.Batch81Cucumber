package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class PracticeAmazonstepDef {
    Actions actions=new Actions(Driver.getDriver());
    AmazonPage amazonPage=new AmazonPage();
    Faker faker=new Faker();

    @Given("kullanici Amazon web sitesine gider")
    public void kullaniciAmazonWebSitesineGider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }

    @When("sign in butonuna tiklar")
    public void signInButonunaTiklar() {
    actions.moveToElement(amazonPage.AccountList).moveToElement(amazonPage.signinButonu).click().perform();


    }

    @And("faker kullanarak e-posta gonderir")
    public void fakerKullanarakEPostaGonderir() {
        amazonPage.email.sendKeys(faker.internet().emailAddress());
        //amazonPage.email.sendKeys(Faker.instance().internet().emailAddress());
    }

    @And("gonderdigi e-postanın ekran goruntusunu alir")
    public void gonderdigiEPostanınEkranGoruntusunuAlir() throws IOException {
        ReusableMethods.getScreenshotWebElement("FakeEmail",amazonPage.email);

    }

    @And("continiue'a tiklar")
    public void continiueATiklar() {
        amazonPage.continioBox.click();

    }

    @Then("There was a problem mesajini dogrular")
    public void thereWasAProblemMesajiniDogrular() {
        //Assert.assertTrue(amazonPage.ProblemMesajı.isDisplayed());

        String expectedtext="There was a problem";
        String actual=amazonPage.ProblemMesajı.getText();
        Assert.assertEquals("Problem Mesajı Esit Değil",expectedtext,actual);
    }

    @And("Need help e tiklar")
    public void needHelpETiklar() {
        amazonPage.needHelp.click();
    }

    @And("forgot your password e tiklar")
    public void forgotYourPasswordETiklar() {
        amazonPage.forgetpasswordLink.click();
    }

    @And("Password assistance metnini dogrular")
    public void passwordAssistanceMetniniDogrular() {
    Assert.assertTrue(amazonPage.passwordasstanceText.isDisplayed());
    }

    @And("Geri gider")
    public void geriGider() {
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();

    }

    @And("Create your account butonuna tiklar")
    public void createYourAccountButonunaTiklar() {
        amazonPage.createYourAccountButton.click();
    }

    @Then("Create account metnini dogrular")
    public void createAccountMetniniDogrular() {
    Assert.assertTrue("Create Account Text icermiyor",amazonPage.passwordasstanceText.getText().contains("Create account"));
    }

    @And("websayfasini kapatir")
    public void websayfasiniKapatir() {
        Driver.quitDriver();

    }
}
