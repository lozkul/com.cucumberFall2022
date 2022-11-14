

Feature: US1002_Amazon Arama Testi

  Scenario: TC02 Kullanici Amazonda Nutella aramasi yapar
    Given Kullanici amazon anasayfaya gider
    Then Arama cubuguna Nutella yazip aratir
    And Arama sonuclarinin Nutella icerdigini test eder
    And Sayfayi kapatir


    Scenario: TC03 Kullanici Amazonda Java aramasi yapar
      Given Kullanici amazon anasayfaya gider
      Then Arama cubuguna Java yazip aratir
      And Arama sonuclarinin Java icerdigini test eder
      And Sayfayi kapatir


      Scenario: TC04 Kullanici Amazonda Java aramasi yapar
        Given Kullanici amazon anasayfaya gider
        Then Arama cubuguna Apple yazip aratir
        And Arama sonuclarinin Apple icerdigini test eder
        And Sayfayi kapatir