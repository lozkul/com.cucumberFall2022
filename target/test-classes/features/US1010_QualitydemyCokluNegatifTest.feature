
  Feature: US1010 Kullanici liste olarak verilen wrong user ile negatif login testi

    Scenario Outline:


      Given Kullanici "myUrl" anasayfaya gider
      Then myCourse cookies linkine tiklar
      Then myCourse anasayfa login linkine tiklar
      Then myCourse kullanici adi olarak "<istenenEmail>" girer
      And myCourse password olarak "<istenenPassword>" girer
      And myCourse login butonuna basar
      And myCourse giris yapilamadigini test eder
      Then Sayfayi kapatir






      Examples:
      |istenenEmail|istenenPassword|
      |myYanlisEmail1|myYanlisPassword1|
      |myYanlisEmail2|myYanlisPassword2|
      |myYanlisEmail3|myYanlisPassword3|
      |myYanlisEmail4|myYanlisPassword4|
