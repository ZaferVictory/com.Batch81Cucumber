Feature: US17 ClassWork
  Scenario: explicitly wait
    Given Kullanici "demoqaUrl" sayfasina gider
    Then kullanici Will enable bes seconds butonunun enable olmasini bekler
    And kullanici Will enable bes seconds butonunun enable oldugunu test edir