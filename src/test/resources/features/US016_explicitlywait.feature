@demo
Feature: US016
  Scenario: TC01 alerts and explicitly wait
  Given Kullanici "demogaUrl" sayfasina gider
    And kullanici 4 saniye bekler
  When kullanici Alerts butonuna tiklar
    And kullanici 4 saniye bekler
  And kullanici On button click, alert will appear after 5 seconds karsisindaki click me  butonuna basar
    And kullanici 4 saniye bekler
  And kullanci Allert’in gorunur olmasini bekler
    And kullanici 4 saniye bekler
  And kullanici Allert uzerindeki yazinin “This alert appeared after 5 seconds” oldugunu test  eder
    And kullanici 4 saniye bekler
  And kullanici ok diyerek alerti kapatir
