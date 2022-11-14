
  Feature: US1007 Yanlis bilgilerle giris yapilamaz

    Scenario: TC13 dogru email, yanlis password ile giris yapilamamali

      Given Kullanici "myUrl" anasayfaya gider
      And myCourse cookies linkine tiklar
      And myCourse anasayfa login linkine tiklar
      And myCourse kullanici adi olarak "myGecerliEmail" girer
      And myCourse password olarak "myYanlisPassword" girer
      And myCourse login butonuna basar
      Then myCourse giris yapilamadigini test eder
      Then Sayfayi kapatir

    Scenario: TC14 yanlis email, yanlis password ile giris yapilamamali

      Given Kullanici "myUrl" anasayfaya gider
      And myCourse cookies linkine tiklar
      And myCourse anasayfa login linkine tiklar
      And myCourse kullanici adi olarak "myYanlisEmail" girer
      And myCourse password olarak "myYanlisPassword" girer
      And myCourse login butonuna basar
      Then myCourse giris yapilamadigini test eder
      Then Sayfayi kapatir

    Scenario: TC15 yanlis email, dogru password ile giris yapilamamali

      Given Kullanici "myUrl" anasayfaya gider
      And myCourse cookies linkine tiklar
      And myCourse anasayfa login linkine tiklar
      And myCourse kullanici adi olarak "myYanlisEmail" girer
      And myCourse password olarak "myGecerliPassword" girer
      And myCourse login butonuna basar
      Then myCourse giris yapilamadigini test eder
      Then Sayfayi kapatir