package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdresBigileri {
    public AdresBigileri(){ PageFactory.initElements(Driver.getDriver(),this); }
    @FindBy(xpath = "(//li[@class='half'])[1]")
    public WebElement yeniAdresOlustur;
    @FindBy(xpath = "//input[@name='title']")
    public WebElement adresBasligi;
    @FindBy(xpath = "//input[@name='first_name']")
    public WebElement ad;
    @FindBy(xpath = "//input[@name='last_name']")
    public WebElement soyad;
    @FindBy(xpath = "//input[@name='phone_number']")
    public WebElement telefon;
    @FindBy(xpath = "//select[@name='city']")
    public WebElement il;
    @FindBy(xpath = "//select[@name='township']")
    public WebElement ilce;
    @FindBy(xpath = "//select[@name='district']")
    public WebElement mahalle;
    @FindBy(xpath = "//textarea[@class='js-address-textarea']")
    public WebElement adres;
    @FindBy(xpath = "(//button[@type='button'])[6]")
    public WebElement adresKaydet;
}