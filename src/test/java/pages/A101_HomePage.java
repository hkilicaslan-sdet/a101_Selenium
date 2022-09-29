package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class A101_HomePage {
    public A101_HomePage(){ PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy(id = "CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")
    public WebElement popUp;

    @FindBy(xpath = "(//li[@data-pk='37a6c1c8-a180-4b87-9ec9-3a29f6453a0c'])[1]")
    public WebElement kadinGiyim;

    @FindBy(xpath = "//a[@title='Dizaltı Çorap']")
    public WebElement dizAltiCorap;

    @FindBy(xpath = "//a[@class='auth__form__proceed js-proceed-to-checkout-btn']")
    public WebElement uyeOlmadanDevamet;

    @FindBy(xpath = "//input[@name='user_email']")
    public WebElement emailKutucugu;

    @FindBy(xpath = "//button[@class='button block green']")
    public WebElement emailSonrasiDevamEt;

}
