
  Feature: JDBC kullanarak yeterli bilgi ile database testi yapilabilir

@db
    Scenario: JDBC01 kullanici databasede sorgu yapabilmeli

      Given Kullanici JDBC ile database baglanir
      Then users tablosundaki first_name verilerini alir
      And isim verilerini test eder
