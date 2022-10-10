Feature: Makas Search

  Scenario: Makas Aratılır
 Given Google'a gidildi
 Then trendyol'u aratıldı
Then trendyol linkine tiklandi
Then makas aratildi
Then toplam urun sayisini alindi
Then yeni sekmede morhipo'ya gidildi
Then morhipoda makas aratildi
Then morhipoda toplam urun sayisi alindi
Then iki sitedeki toplam makas sayisi karsilastirildi
Then urun sayisi fazla olan site kapatildi
And  acik kalan diger sayfa da kapatildi