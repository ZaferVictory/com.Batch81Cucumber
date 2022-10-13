package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.HerOkuHtmlPages;
import utilities.Driver;

import java.util.List;

public class PracticeTestPageStepDefs {
    HerOkuHtmlPages herOkuHtmlPages=new HerOkuHtmlPages();
    Actions actions=new Actions(Driver.getDriver());
    int down32toplam;
    int clickTextToplam;
    int sonuc;

    @Given("{string} adresine gidin")
    public void adresineGidin(String istenenUrl) {
        Driver.getDriver().get(istenenUrl);

    }

    @And("{int} defa click me ye tiklayin")
    public void defaClickMeYeTiklayin(int istenenrakam) {

        for (int i = 0; i <istenenrakam ; i++) {
            herOkuHtmlPages.clickme.click();

        }


        }

    @And("{int} defa Space dugmesine basin")
    public void defaSpaceDugmesineBasin(int space) {
        for (int i = 0; i < space; i++) {
            actions.sendKeys(Keys.SPACE).perform();
        }
    }


    @And("Down yazisindaki iki basamakli sayilarin hepsini toplayin")
    public void downYazisindakiIkiBasamakliSayilarinHepsiniToplayin() {
        List<WebElement> down32= herOkuHtmlPages.down32;

        for (WebElement w: down32) {
            down32toplam+=Integer.parseInt(w.getText().replaceAll("\\D", ""));

        }
        System.out.println("down 32 toplamı= "+down32toplam);
    }

    @And("Tum click metinlerinin uzunlugunun toplamini onceki toplamdan cikarin")
    public void tumClickMetinlerininUzunlugununToplaminiOncekiToplamdanCikarin() {
        List<WebElement> clicktext=herOkuHtmlPages.clicktext;

        for (WebElement w:clicktext) {
            clickTextToplam+=w.getText().length();
        }

        sonuc=down32toplam-clickTextToplam;
        System.out.println("sonuc= "+sonuc);


    }

    @Then("sonucun {int} oldugunu dogrulayin")
    public void sonucunOldugunuDogrulayin(int result) {

        Assert.assertEquals("sonuc esit degil", result, sonuc);

    }
}
