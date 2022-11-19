package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationPage {


    public AutomationPage(){PageFactory.initElements(Driver.getDriver(), this);}


    @FindBy(xpath = "//a[@href='/login']")
    public WebElement loginLinki;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement nameKutusu;

    @FindBy(xpath = "(//input[@type='email'])[2]")
    public WebElement emailKutusu;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement signupButtonu;

    @FindBy(xpath = "(//input[@type='radio'])[1]")
    public WebElement erkekTitleButtonu;

    @FindBy(xpath = "//*[text()='Account Created!']")
    public WebElement createAccountButonu;

    @FindBy(xpath = "//*[text()='Account Created!']")
    public WebElement accountCreatedElementi;
}
