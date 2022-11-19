@wip
  Feature: US1009 Kullanici liste olarak verilen urunleri amazonda aratir

    Scenario Outline: TC17 Kullanici liste olarak arama testi yapabilmeli

      Given Kullanici "amazonUrl" anasayfaya gider
      Then Arama cubuguna "<istenenKelime>" yazip aratir
      And Arama sonuclarinin "<istenenKelime>" icerdigini test eder
      Then Sayfayi kapatir

      Examples:
      |istenenKelime|
      |Nutella      |
      |Java         |
      |Apple        |
      |SAmsung      |
      |LG           |
