
  Feature: JDBC 03 Kullanici databasete update yapabilmeli

    Scenario: TC03 kullanici id degeri ile istedigi soy ismi update ettigini test eder

      Given Kullanici JDBC ile database baglanir
      Then id degeri 14 olan kisinin "last_name" degerini "happiness" yapar
      And id'si 14 olan userin "last_name" degerinin "Happiness" oldugunu test eder