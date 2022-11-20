
  Feature: JDBC kullanarak yeterli bilgi ile database testi yapilabilir

@db
    Scenario: JDBC01 kullanici databasede sorgu yapabilmeli

      Given Kullanici JDBC ile databaseebaglanir
      Then users tablosundaki isim verilerini alir
      And isim verilerini test eder
