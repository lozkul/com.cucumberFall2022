package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
public class AmazonStepDefinitions {
    AmazonPage amazonPage=new AmazonPage();
    @Given("Kullanici amazon anasayfaya gider")
    public void kullanici_amazon_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }
    @When("Arama cubuguna Nutella yazip aratir")
    public void arama_cubuguna_nutella_yazip_aratir() {
        amazonPage.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
    }
    @Then("Arama sonuclarinin Nutella icerdigini test eder")
    public void arama_sonuclarinin_nutella_icerdigini_test_eder() {
        String actualAramaSonucu=amazonPage.aramaSonucElementi.getText();
        String expectedkelime="Nutella";
        Assert.assertTrue(actualAramaSonucu.contains(expectedkelime));
    }
    @Then("Arama cubuguna Java yazip aratir")
    public void arama_cubuguna_java_yazip_aratir() {
        amazonPage.aramaKutusu.sendKeys("Java" + Keys.ENTER);
    }
    @Then("Arama sonuclarinin Java icerdigini test eder")
    public void arama_sonuclarinin_java_icerdigini_test_eder() {
        String actualAramaSonucu=amazonPage.aramaSonucElementi.getText();
        String expectedkelime="Java";
        Assert.assertTrue(actualAramaSonucu.contains(expectedkelime));
    }
    @Then("Arama cubuguna Apple yazip aratir")
    public void arama_cubuguna_apple_yazip_aratir() {
        amazonPage.aramaKutusu.sendKeys("Apple" + Keys.ENTER);
    }
    @Then("Arama sonuclarinin Apple icerdigini test eder")
    public void arama_sonuclarinin_apple_icerdigini_test_eder() {
        String actualAramaSonucu=amazonPage.aramaSonucElementi.getText();
        String expectedkelime="Apple";
        Assert.assertTrue(actualAramaSonucu.contains(expectedkelime));
    }



    @Then("Sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }
}
