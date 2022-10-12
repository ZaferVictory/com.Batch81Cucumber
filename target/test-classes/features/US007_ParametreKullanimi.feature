Feature: US004 Parametre Kullanimi
  Scenario:TC01 Parametre Kullanimi
    Given Kullanici "https://www.trendyol.com" sayfasinda
    Then kullanici 3 saniye bekler
    When sonuclarin "trend" icerdigini test eder
    And sayfayi kapatir