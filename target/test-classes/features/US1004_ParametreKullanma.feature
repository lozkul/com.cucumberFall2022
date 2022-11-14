
  Feature: US1004 Parametre Kullanma
    @wip
    Scenario: TC08 kullanici parametre ile verilen kelimeyi amazonda aratabilmeli
      Given Kullanici amazon anasayfaya gider
      Then Arama cubuguna "Nutella" yazip aratir
      And Arama sonuclarinin "Nutella" icerdigini test eder
      And Sayfayi kapatir