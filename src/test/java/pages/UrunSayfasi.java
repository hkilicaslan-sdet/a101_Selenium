package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UrunSayfasi {
    public UrunSayfasi(){ PageFactory.initElements(Driver.getDriver(),this); }
   @FindBy(xpath = "(//input[@class='js-filter-choice'])[6]")
    //@FindBy(xpath = "//label[@for='attributes_integration_colourSİYAH']")
    public WebElement siyahRenk;

    @FindBy(xpath = "(//h3[@class='name'])[1]")
    public WebElement urunBasligi;

  //  @FindBy(xpath = "(//a[@class='name-price'])[1]")
    @FindBy(xpath = "((//h3[@class='name'])[1])")
    public WebElement urunSecimi;

    @FindBy(xpath = "//div[@class='product-heading']/h1")
    public WebElement seciliUrun;

    @FindBy(xpath = "//i[@class='icon-sepetekle']")
    public WebElement sepeteEkle;

    @FindBy(partialLinkText = "Görüntüle")
    public WebElement sepetiGoruntule;

    @FindBy(xpath = "//a[@class='button green checkout-button block js-checkout-button']")
    public WebElement sepetiOnayla;
}