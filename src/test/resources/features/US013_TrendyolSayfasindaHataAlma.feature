Feature: US013 Parametre Kullanimi
  @gp6
  Scenario:TC01 Parametre Kullanimi
    Given Kullanici "https://www.trendyol.com" sayfasinda
    Then kullanici 3 saniye bekler
    When sonuclarin "amazon" icerdigini test eder
    And sayfayi kapatir