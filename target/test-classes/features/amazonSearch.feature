Feature: Amazon Search
  @gp1
  Scenario: TC01 kullanıcı amazonda nutella aratır
    Given Kullanici amazon sayfasina gider
    Then kullanici nutella aratir
    And sonuclarin nutella icerdigini test eder


  @gp3
  Scenario: TC02 kullanıcı amazonda Selenium aratır

    Given Kullanici amazon sayfasina gider
    Then kullanici Selenium aratir
    And sonuclarin Selenium icerdigini test eder



  Scenario: TC03 kullanıcı amazonda iphone aratır

    Given Kullanici amazon sayfasina gider
    Then kullanici iphone aratir
    And sonuclarin iphone icerdigini test eder
    And sayfayi kapatir