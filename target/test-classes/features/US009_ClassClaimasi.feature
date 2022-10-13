Feature:

  Scenario Outline:
    When kullanici "dataUrl" adresine gider
    Then new butonuna basar
    And isim bolumune "<firstname>" girer
    And kullanici 1 saniye bekler
    And soy isim bolumune "<lastname>" girer
    And kullanici 1 saniye bekler
    And position bolumune "<position>" girer
    And kullanici 1 saniye bekler
    And ofis bilgsi bolumune "<ofisbilgisi>" girer
    And kullanici 1 saniye bekler
    And extension bolumune "<extension>" girer
    And kullanici 1 saniye bekler
    And startdate bolumune "<startdate>" girer
    And kullanici 1 saniye bekler
    And salary bolumune "<salary>" girer
    And kullanici 1 saniye bekler
    And Create tusuna basar
    And kullanici 3 saniye bekler
    When kullanici "<firstname>" ile arama yapar
    And kullanici 1 saniye bekler
    Then isim bolumunde "<firstname>" oldugunu dogrular
    Examples:
      | firstname | lastname | position | ofis bilgisi | extension | start date | salary |
      | ALi       | Veli     | Qa       | Google       | Senior    | 2022-10-12 | 15000  |
      | Ahmet     | Mehmet   | Qa       | Google       | Junior    | 2022-10-12 | 10500  |
      | Hasan     | Duman    | Dev      | Amazon       | Junior    | 2022-10-12 | 25000  |
      | Akin      | Alkan    | Dev      | Amazon       | Senior    | 2022-10-12 | 50000  |
      | Orhan     | Duman    | PO       | WallMart     | Senior    | 2022-10-12 | 30000  |


    #bes farklı kullanıvcı bılgısı girer