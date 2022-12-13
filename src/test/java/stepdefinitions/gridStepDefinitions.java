package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class gridStepDefinitions {

    WebDriver driver;
    @Given("get URL")
    public void get_url() throws MalformedURLException {
        driver= new RemoteWebDriver(new URL("http://192.168.0.106:4444"), new ChromeOptions());
        driver.get("https://www.google.com/");
    }
    @Then("verify title")
    public void verify_title() {
        String title = driver.getTitle();
        Assert.assertEquals("Google", title);
    }
    @Then("verify currentURL")
    public void verify_current_url() {
        String currentURL = driver.getCurrentUrl();
        Assert.assertEquals("https://www.google.com/", currentURL);

    }

    @Given("get URL edge")
    public void get_url_edge() throws MalformedURLException {
        driver= new RemoteWebDriver(new URL("http://192.168.0.106:4444"),new EdgeOptions());
        driver.get("https://www.google.com/");
    }
    @Then("verify title edge")
    public void verify_title_edge() {
        String title = driver.getTitle();
        Assert.assertEquals("Google", title);
    }
    @Then("verify currentURL edge")
    public void verify_current_url_edge() {
        String currentURL = driver.getCurrentUrl();
        Assert.assertEquals("https://www.google.com/", currentURL);
    }

}
