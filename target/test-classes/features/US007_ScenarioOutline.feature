@all
Feature:US007 Scenario outline kullanimi

  Scenario Outline: TC01 Configreader ile Scenario outline Kullanimi
    Given Kullanici "<arnanUrl>" sayfasina gider
    Then kullanici 3 saniye bekler
    When sonuclarin "<arananKelime>" icerdigini test eder
    And sayfayi kapatir
    Examples:
      | arnanUrl  | arananKelime |
      | amazonUrl | amazon       |
      | faceUrl   | facebook     |
      | brcUrl    | blue         |
      | google    | google       |