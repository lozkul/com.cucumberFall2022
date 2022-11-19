package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HerokuappPage;
import utilities.ReusableMethods;

import java.util.NoSuchElementException;

public class HerokuappStepDefinitions {

    HerokuappPage herokuappPage=new HerokuappPage();

    @Then("Herokuapp Add Element butonuna basar")
    public void herokuapp_add_element_butonuna_basar() {
        herokuappPage.addButonu.click();
    }
    @Then("Herokuapp Delete butonu gorunmesini bekler")
    public void herokuapp_delete_butonu_gorunmesini_bekler() {
        ReusableMethods.bekle(3);
    }
    @Then("Herokuapp Delete butonunun gorunur oldugunu test eder")
    public void herokuapp_delete_butonunun_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(herokuappPage.deleteButonu.isDisplayed());
    }
    @Then("Herokuapp Delete butonuna basarak butonu siler")
    public void herokuapp_delete_butonuna_basarak_butonu_siler() {
        herokuappPage.deleteButonu.click();
    }
    @Then("Herokuapp Delete butonunun gorunmedigini test eder")
    public void herokuapp_delete_butonunun_gorunmedigini_test_eder() {
        boolean flag=false;
        try {
            Assert.assertFalse(herokuappPage.deleteButonu.isDisplayed());
        } catch (Exception e) {
            flag=true;
        }
        Assert.assertTrue(flag);
    }
}
