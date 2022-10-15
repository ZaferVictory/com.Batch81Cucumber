Feature:
  @bunu
  Scenario: TC01 Parametre kullaniminda ConfigReader Kullanimi
    Given Kullanici "faceUrl" sayfasina gider
    Then kullanici 3 saniye bekler
    When sonuclarin "facebook" icerdigini test eder
    And sayfayi kapatir
  @gp2
  Scenario: TC02 Parametre kullaniminda ConfigReader Kullanimi
    Given Kullanici "google" sayfasina gider
    Then kullanici 3 saniye bekler
    When sonuclarin "google" icerdigini test eder
    And sayfayi kapatir

  Scenario: TC03 Parametre kullaniminda ConfigReader Kullanimi
    Given Kullanici "brcUrl" sayfasina gider
    Then kullanici 3 saniye bekler
    When sonuclarin "blue" icerdigini test eder
    And sayfayi kapatir

  Scenario: TC04 Parametre kullaniminda ConfigReader Kullanimi
    Given Kullanici "amazon" sayfasina gider
    Then kullanici 3 saniye bekler
    When sonuclarin "amazon" icerdigini test eder
    And sayfayi kapatir