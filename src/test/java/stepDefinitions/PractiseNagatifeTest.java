package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.PractiseNagatifTestPage;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.swing.*;

public class PractiseNagatifeTest {
    PractiseNagatifTestPage practiseNagatifTestPage=new PractiseNagatifTestPage();
    Actions action=new Actions(Driver.getDriver());


    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String url) {
        Driver.getDriver().get(url);
    }

    @And("login olmak icin signin e tiklar")
    public void loginOlmakIcinSigninETiklar() {
        ReusableMethods.waitForClickablility(practiseNagatifTestPage.signinsembol,5);
    practiseNagatifTestPage.signinsembol.click();
    practiseNagatifTestPage.signinbuton.click();
    }

    @And("username icin {string} kullanici adini gonderir")
    public void usernameIcinKullaniciAdiniGonderir(String username) {

        username=Faker.instance().name().username();
        practiseNagatifTestPage.email.sendKeys(username);

    }

    @And("password icin {string} parolasini gonderir")
    public void passwordIcinParolasiniGonderir(String password) {
        password=Faker.instance().internet().password();
        practiseNagatifTestPage.password.sendKeys(password);
    }

    @And("signine tiklar")
    public void signineTiklar() {
        practiseNagatifTestPage.signinWithCredentials.click();
    }

    @And("Authentication information not correct uyarisini dogrular")
    public void authenticationInformationNotCorrectUyarisiniDogrular() {
    // String actual=  practiseNagatifTestPage.popUpMessage.getText();
    // String expected="Authentication information not correct";

    //   Assert.assertTrue(expected.contains(actual));

        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),5);
        wait.until(ExpectedConditions.visibilityOf(practiseNagatifTestPage.popUpMessage));

        Assert.assertTrue(practiseNagatifTestPage.popUpMessage.isDisplayed());

        //*[contains(text(), 'Authentication information not correct.')]
        //contains text() olayı tum web elementleri icinde,
        // icerisinde text olarak 'şu'  text i iceren locateleri bul diyor.
        // bunu baska bir text icerigi ile aranan metni değistirerek te kullanabiliriz
    }
}
