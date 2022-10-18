package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.PractiseFormPage;
import utilities.Driver;

import java.util.Random;

public class Practise_ScenarioOutline_Checkbox_dropdown_selection {
        PractiseFormPage practiseFormPage=new PractiseFormPage();

    @Given("Kullanici {string} sayfasindadır")
    public void kullaniciSayfasindadır(String url) {
        Driver.getDriver().get(url);
    }

    @And("username {string} password {string} ve textarea {string} kisimlarini doldurur")
    public void usernamePasswordVeTextareaKisimlariniDoldurur(String username, String password, String textarea) {
        username= Faker.instance().name().username();
        password= Faker.instance().internet().password();
        textarea= Faker.instance().animal().name();

        practiseFormPage.username.sendKeys(username);
        practiseFormPage.password.sendKeys(password);
        practiseFormPage.textcomment.clear();
        practiseFormPage.textcomment.sendKeys(textarea);

    }

    @And("bir dosya yukler")
    public void birDosyaYukler() {
       // practiseFormPage.chooseFile.sendKeys("C:\\Users\\TR\\Desktop\\test.txt.txt");/* 2.yol*/

        String homeDirectory=System.getProperty("user.home");
        String filepath=homeDirectory+"/Desktop/test.txt.txt";

        practiseFormPage.chooseFile.sendKeys(filepath);

    }

    @And("checkbox{int} i secer")
    public void checkboxISecer(int arg0) {
        if (!practiseFormPage.checkBox1.isSelected()){
            practiseFormPage.checkBox1.click();
        }
        if (practiseFormPage.checkBox2.isSelected()){
            practiseFormPage.checkBox2.click();
        }
        if (practiseFormPage.checkBox3.isSelected()){
            practiseFormPage.checkBox3.click();
        }


    }

    @And("radio{int} yi secer")
    public void radioYiSecer(int arg0) {
        practiseFormPage.radiobutton2.click();

    }

    @And("selection item{int} secer")
    public void selectionItemSecer(int arg0) {
        practiseFormPage.selectionItem.click();
    }

    @And("dropdown itmem{int} secer")
    public void dropdownItmemSecer(int arg0) {
        Select select=new Select(practiseFormPage.dropdown);
        Random random=new Random();
       int rastgele=random.nextInt(select.getOptions().size());
        select.selectByIndex(rastgele);

    }

    @And("submite tiklar")
    public void submiteTiklar() {
        practiseFormPage.submitButonu.click();
    }

    @Then("dosyanin yuklendigini dogrular")
    public void dosyaninYuklendiginiDogrular() {

        Assert.assertTrue(practiseFormPage.filename.isDisplayed());

    }


}
