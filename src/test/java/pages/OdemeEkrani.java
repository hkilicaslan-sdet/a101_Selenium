package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OdemeEkrani {
    public OdemeEkrani(){ PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy(xpath = "(//input[@name='name'])[2]")
    public WebElement kartIsim;

    @FindBy(xpath = "//input[@class='js-masterpassbin-payment-card']")
    //@FindBy(xpath = "(//input[@type='tel'])[3]")
    public WebElement kartNumara;

    @FindBy(xpath = "(//select[@class='js-payment-month'])[1]")
    public WebElement kartSktAy;

    @FindBy(xpath = "(//select[@class='js-payment-year'])[1]")
    public WebElement kartYil;

    @FindBy(xpath = "(//input[@class='js-payment-cvv'])[2]")
    public WebElement kartCvc;

    @FindBy(id = "agrement2")
    public WebElement satisKabul;

    @FindBy(xpath = "(//button[@type='submit'])[3]")
    public WebElement siparisTamamla;

    @FindBy(xpath = "(//span[@class='hidden-xs'])[2]")
    public WebElement odemeSecenekleri;


}
