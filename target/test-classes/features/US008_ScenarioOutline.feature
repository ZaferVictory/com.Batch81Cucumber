Feature: US008 parametre kullanimi
  Scenario Outline: : TC11 kullanici gecersiz bilgilerle giris yapar
    Given kullanici "brcUrl" ana sayfasinda
    Then Login yazisina tiklar
    Then kullanici 3 saniye bekler
    And gecersiz "<username>" girer
    Then kullanici 3 saniye bekler
    And supersize "<password>" girildi
    Then kullanici 3 saniye bekler
    And Login butonuna basar
    Then kullanici 3 saniye bekler
    Then sayfaya giris yapilamadigini kontrol eder
    Then kullanici 3 saniye bekler
    And sayfayi kapatir
    Examples:
      | username | password |
      | Manager5@gmail.com | Manager5! |
      | Manager6@gmail.com | Manager6! |
      | Manager7@gmail.com | Manager7! |
      | Manager8@gmail.com | Manager8! |
      | Manager9@gmail.com | Manager9! |

