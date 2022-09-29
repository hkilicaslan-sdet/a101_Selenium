package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UrunSepet {
    public UrunSepet(){ PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy(partialLinkText = "Görüntüle")
    public WebElement sepetiGoruntule;

    @FindBy(xpath = "//a[@class='button green checkout-button block js-checkout-button']")
    public WebElement sepetiOnayla;
}
