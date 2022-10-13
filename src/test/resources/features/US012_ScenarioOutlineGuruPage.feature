Feature: US012 Class Work
  @guru
  Scenario Outline: TC01_kullanici_sütun_basligi_ile_liste_atabilmeli
    Given Kullanici "guruUrl" sayfasina gider
    Then "<Basliklar>" sutunundaki tum degerleri yazdirir
    Examples:
      | Basliklar |
      | Company |
      | Group |
      | Prev Close (Rs) |
      | Current Close (Rs) |
      | %Change |

    Scenario: Kullanici sayfayi kapatir
      Given sayfayi kapatir