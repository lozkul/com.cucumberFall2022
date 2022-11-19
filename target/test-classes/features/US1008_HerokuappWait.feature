@wip
  Feature: US1008 Herokuapp Wait Testleri

    Scenario: TC16 Kullanici wait islemlerinin calstigini test eder

      Given Kullanici "herokuUrl" anasayfaya gider
      Then Herokuapp Add Element butonuna basar
      And Herokuapp Delete butonu görünmesini bekler
      And Herokuapp Delete butonunun görünür olduğunu test eder
      Then Herokuapp Delete butonuna basarak butonu siler
      And Herokuapp Delete butonunun gorunmedigini test eder
      Then Sayfayi kapatir



