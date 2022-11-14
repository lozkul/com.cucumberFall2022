
  Feature: US1006 Dogru kullanici adi ve password ile pozitif login testi

    Scenario: TC12 kullanici mycoursedemy sitesite giris yapabilmeli

      Given Kullanici "myUrl" anasayfaya gider
      Then myCourse cookies linkine tiklar
      Then myCourse anasayfa login linkine tiklar
      And myCourse kullanici adi olarak "myGecerliEmail" girer
      And myCourse password olarak "myGecerliPassword" girer
      And myCourse login butonuna basar
      Then myCourse giris yapabildigini test eder
      And Sayfayi kapatir