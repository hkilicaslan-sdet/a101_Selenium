package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OdemeSayfasi {
    public OdemeSayfasi(){ PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy(xpath = "(//input[@class='js-shipping-radio'])[1]")
    public WebElement kargoSecim;
    @FindBy(xpath ="//button[@data-index='1']" )
    public WebElement kargoSecimDevam;

   // @FindBy(xpath = "//div[@class='card-detail']/b")
    @FindBy(xpath = "//div[@class='masterpass-pay-another-card']")
    public WebElement odemeEkrani;
}
