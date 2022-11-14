

Feature: US1003 Background kullanarak Amazon arama testi


  Background: Amazon anasayfaya gitme
    Given Kullanici amazon anasayfaya gider

  Scenario: TC05 Kullanici Amazonda Nutella aramasi yapar
    Then Arama cubuguna Nutella yazip aratir
    And Arama sonuclarinin Nutella icerdigini test eder
    And Sayfayi kapatir


  Scenario: TC06 Kullanici Amazonda Java aramasi yapar
    Then Arama cubuguna Java yazip aratir
    And Arama sonuclarinin Java icerdigini test eder
    And Sayfayi kapatir


  Scenario: TC07 Kullanici Amazonda Java aramasi yapar
    Then Arama cubuguna Apple yazip aratir
    And Arama sonuclarinin Apple icerdigini test eder
    And Sayfayi kapatir