package stepDefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.w3c.dom.stylesheets.LinkStyle;
import pages.GuruPage;
import utilities.Driver;

import java.util.List;

public class GuruStepDefinition {
    GuruPage guruPage=new GuruPage();

    @And("{string} sutunundaki tum degerleri yazdirir")
    public void sutunundakiTumDegerleriYazdirir(String istenenBaslik) {
        int index=0;
        for (int i = 0; i < guruPage.basliklar.size(); i++) {

            if (guruPage.basliklar.get(i).getText().equals(istenenBaslik)){
                System.out.println(guruPage.basliklar.get(i).getText());
                index=i+1;
                List<WebElement> sutunelement= Driver.getDriver().
                        findElements(By.xpath("//tbody//tr//td["+index+"]"));
                sutunelement.forEach(t-> System.out.println(t.getText()));//lambda ıle

               //for each ile
              // for (WebElement w:sutunelement) {
              //     System.out.println(w.getText());
              // }
            }


        }


    }
}
