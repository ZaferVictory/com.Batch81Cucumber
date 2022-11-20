package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import utilities.Driver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class GridStepDefs {

    WebDriver driver;

    @Given("user is on the application_url {string}")
    public void user_is_on_the_application_url(String url) throws MalformedURLException {
      driver= new RemoteWebDriver(new URL("http://192.168.1.104:4444"), new ChromeOptions());
                                        //http://localhost:4444 bunu da kullanabılırsın
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(url);
    }

    @Then("verify the page title is {string}")
    public void verify_the_page_title_is(String expectedTitle) {
      String actualTitle=driver.getTitle();

        Assert.assertEquals("title uyusmadi "+expectedTitle,actualTitle);
    }

    @Then("close the remote driver")
    public void close_the_remote_driver() {

        driver.quit();
    }

    @Given("user is on the application_url with edge {string}")
    public void userIsOnTheApplication_urlWithEdge(String url2) throws MalformedURLException {

        driver= new RemoteWebDriver(new URL("http://192.168.1.104:4444"), new EdgeOptions());
        //http://localhost:4444 bunu da kullanabılırsın
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(url2);
    }
}
