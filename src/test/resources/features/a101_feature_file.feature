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



#Uçtan uca ödeme ekranına kadar Selenium’da java dili ile chrome browser kullanarak test otomasyon ödevi yapılacak.
#
#Ödeme ekranı doldurulmayacak. Aşağıdaki senaryoyu web ve mobil olmak üzere 2 çeşit oluşturabilirlerse çok iyi olur. En az Web’de yapmak zorunlu.
#- Senaryoya üye kaydı oluşturmadan devam edilecek.
#- Giyim--> Aksesuar--> Kadın İç Giyim-->Dizaltı Çorap bölümüne girilir.
#- Açılan ürünün siyah olduğu doğrulanır.
#- Sepete ekle butonuna tıklanır.
#- Sepeti Görüntüle butonuna tıklanır.
#- Sepeti Onayla butonuna tıklanır.
#- Üye olmadan devam et butonuna tıklanır.
#- Mail ekranı gelir.
#- Sonrasında adres ekranı gelir. Adres oluştur dedikten sonra ödeme ekranı gelir.
#- Siparişi tamamla butonuna tıklayarak, ödeme ekranına gidildiği ,doğru ekrana yönlendiklerini kontrol edecekler.
