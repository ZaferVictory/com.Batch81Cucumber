@Background
Feature: US001 Background Kullanimi

  Background: Ortak Adimlar
    Given Kullanici amazon sayfasina gider

  Scenario: TC01 kullanıcı amazonda nutella aratır

    Then kullanici nutella aratir
    And sonuclarin nutella icerdigini test eder


  Scenario: TC02 kullanıcı amazonda Selenium aratır

    Then kullanici Selenium aratir
    And sonuclarin Selenium icerdigini test eder


  Scenario: TC03 kullanıcı amazonda iphone aratır

    Then kullanici iphone aratir
    And sonuclarin iphone icerdigini test eder
    And sayfayi kapatir
