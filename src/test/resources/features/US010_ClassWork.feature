@parametre01
Feature: US 010 ClassWork
  Scenario: Herocap sitesi buton tarama
    Given   Kullanici "herokuUrl" sayfasina gider
    When Add Element butona basin
    And Delete butonu gorunur oluncaya kadar bekleyin
    Then Delete butonunun gorunur oldugunu test edin
    And Delete butonuna basarak butonu silin
    Then AddRemove Elements yazisinin gorunurlugunu test eder
    And kullanici 3 saniye bekler
    And Delete butonunun gorunmedigini test edin
    And kullanici 3 saniye bekler
    And sayfayi kapatir
