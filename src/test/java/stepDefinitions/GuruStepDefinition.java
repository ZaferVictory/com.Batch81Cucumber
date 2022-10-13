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

            if (guruPage.basliklar.get(i).getText().equals(istenenBaslik)){//Feature'dan gelen string değeri i degerine eşitledik
                System.out.println(guruPage.basliklar.get(i).getText());//Feature'dan gelen başlığı yazdırdık
                index=i+1;// Feature'dan gelen ve i değerine eşitlediğimiz string'i aynı değere sahip sutunlarıda yazdırabilmek için
                // boş bir konternar oluşturup ona atadık. Listte index 0(sıfır) dan başladığı için ve webTable locate'imiz 1 den
                //başladığı için i değerini bir arttırdık.
                List<WebElement> sutunelement= Driver.getDriver().
                        findElements(By.xpath("//tbody//tr//td["+index+"]"));
                //Sonrasında webTable'daki body'i locate edip eşitlediğimiz index'i başlık altındaki sutunu getirebilmesi için bu liste koyduk.
                sutunelement.forEach(t-> System.out.println(t.getText()));//lambda ıle

               //for each ile
              // for (WebElement w:sutunelement) {
              //     System.out.println(w.getText());
              // }
            }


        }


    }
}
