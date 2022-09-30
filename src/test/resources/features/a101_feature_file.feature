@a101_test
Feature: a101_test
  Scenario: Uctan_uca_odeme_test
    Given Kullanici a101 anasayfasina gider
    When Giyim_aksesuar_kadinIcGiyim_dizaltiCorap bolumune girilir
    Then Acilan urunun siyah oldugu dogrulanir
    And Sepete ekle butonuna tiklanir
    And Sepeti Goruntule butonuna tiklanir
    And Sepeti Onayla butonuna tiklanir
    Then Uye olmadan devam et butonuna tiklanir
    And Mail ekrani gelir
    Then Sonrasinda adres ekrani gelir
    And Adres olustur dedikten sonra odeme ekrani gelir
    Then Siparisi tamamla butonuna tiklayarak, odeme ekranina gidildigi ,dogru ekrana yonlendiklerini kontrol edecekler