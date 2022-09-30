package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;

import java.util.Locale;

public class a101_Step_Defs {

    A101_HomePage homePage=new A101_HomePage();
    AdresBigileri adresBigileri=new AdresBigileri();
    UrunSayfasi urunSayfasi=new UrunSayfasi();
    OdemeSayfasi odemeSayfasi=new OdemeSayfasi();
    @Given("Kullanici a101 anasayfasina gider")
    public void kullanici_a101_anasayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("a101_homepage_url"));
        homePage.popUp.click();
    }
    @Then("Giyim_aksesuar_kadinIcGiyim_dizaltiCorap bolumune girilir")
    public void giyim_aksesuar_kadin_ic_giyim_dizalti_corap_bolumune_girilir() {
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(homePage.kadinGiyim).perform();
        homePage.dizAltiCorap.click();
    }
    @Then("Acilan urunun siyah oldugu dogrulanir")
    public void acilan_urunun_siyah_oldugu_dogrulanir() {
      JSUtils.scrollIntoViewJS(urunSayfasi.siyahRenk);
      JSUtils.clickElementByJS(urunSayfasi.siyahRenk);
      Assert.assertTrue(urunSayfasi.urunBasligi.getText().contains("Siyah"));
    }
    @Then("Sepete ekle butonuna tiklanir")
    public void sepete_ekle_butonuna_tiklanir() {
        JSUtils.clickElementByJS(urunSayfasi.urunBasligi);
        System.out.println("seçili ürün başlığı :"+ urunSayfasi.seciliUrun.getText());
        JSUtils.clickElementByJS(urunSayfasi.sepeteEkle);
    }
    @Then("Sepeti Goruntule butonuna tiklanir")
    public void sepeti_goruntule_butonuna_tiklanir() {
        urunSayfasi.sepetiGoruntule.click();
    }
    @Then("Sepeti Onayla butonuna tiklanir")
    public void sepeti_onayla_butonuna_tiklanir() {
        urunSayfasi.sepetiOnayla.click();
    }
    @Then("Uye olmadan devam et butonuna tiklanir")
    public void uye_olmadan_devam_et_butonuna_tiklanir() {
        homePage.uyeOlmadanDevamet.click();
    }
    @Then("Mail ekrani gelir")
    public void mail_ekrani_gelir() {
        homePage.emailKutucugu.sendKeys(Faker.instance().internet().emailAddress());
        homePage.emailSonrasiDevamEt.click();
    }
    @Then("Sonrasinda adres ekrani gelir")
    public void sonrasinda_adres_ekrani_gelir() throws InterruptedException {
        adresBigileri.yeniAdresOlustur.click();
        adresBigileri.adresBasligi.sendKeys("Ev Adresim");
        adresBigileri.ad.sendKeys(Faker.instance(Locale.forLanguageTag("Tr")).name().firstName());
        adresBigileri.soyad.sendKeys(Faker.instance((Locale.forLanguageTag("Tr"))).name().lastName());
        adresBigileri.telefon.sendKeys(Faker.instance().number().digits(11));

        Select il=new Select(adresBigileri.il);
        Select ilce=new Select(adresBigileri.ilce);
        Select mahalle=new Select(adresBigileri.mahalle);
        il.selectByIndex(2);
        ilce.selectByIndex(5);
        Thread.sleep(3000);
        mahalle.selectByIndex(6);
        adresBigileri.adres.sendKeys(Faker.instance((Locale.forLanguageTag("Tr"))).address().streetAddress());
        JSUtils.clickElementByJS(adresBigileri.adresKaydet);
    }
    @Then("Adres olustur dedikten sonra odeme ekrani gelir")
    public void adres_olustur_dedikten_sonra_odeme_ekrani_gelir() {
        JSUtils.clickElementByJS(odemeSayfasi.kargoSecim);
        odemeSayfasi.kargoSecimDevam.click();
    }
    @Then("Siparisi tamamla butonuna tiklayarak, odeme ekranina gidildigi ,dogru ekrana yonlendiklerini kontrol edecekler")
    public void siparisi_tamamla_butonuna_tiklayarak_odeme_ekranina_gidildigi_dogru_ekrana_yonlendiklerini_kontrol_edecekler() throws InterruptedException {
        Thread.sleep(3000);
        String odemeEkraniTeyit=odemeSayfasi.odemeEkrani.getText();
    //    System.out.println("Ödeme ekranı: "+odemeEkraniTeyit);
        Assert.assertEquals("Başka bir kart ile ödemek istiyorum",odemeEkraniTeyit);
    }
}