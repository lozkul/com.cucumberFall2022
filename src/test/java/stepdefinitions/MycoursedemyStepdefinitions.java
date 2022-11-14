package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.MyCoursedemyPage;
import utilities.ConfigReader;

public class MycoursedemyStepdefinitions {
    MyCoursedemyPage myCoursedemyPage=new MyCoursedemyPage();

    //Cookies ekle

    @Then("myCourse anasayfa login linkine tiklar")
    public void my_course_anasayfa_login_linkine_tiklar() {
        myCoursedemyPage.loginLinki.click();

    }
    @Then("myCourse kullanici adi olarak {string} girer")
    public void my_course_kullanici_adi_olarak_girer(String verilenEmail) {
        myCoursedemyPage.emailKutusu.sendKeys(ConfigReader.getProperty(verilenEmail));
    }
    @Then("myCourse password olarak {string} girer")
    public void my_course_password_olarak_girer(String verilenPassword) {
        myCoursedemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty(verilenPassword));

    }
    @Then("myCourse login butonuna basar")
    public void my_course_login_butonuna_basar() {
        myCoursedemyPage.loginButonu.click();
    }
    @Then("myCourse giris yapabildigini test eder")
    public void my_course_giris_yapabildigini_test_eder() {
        Assert.assertTrue(myCoursedemyPage.coursesLinki.isDisplayed());
    }

    @Then("myCourse cookies linkine tiklar")
    public void mycourseCookiesLinkineTiklar() {
        myCoursedemyPage.cookies.click();
    }

    @Then("myCourse giris yapilamadigini test eder")
    public void mycourseGirisYapilamadiginiTestEder() {
        Assert.assertTrue(myCoursedemyPage.loginLinki.isDisplayed());
    }
}