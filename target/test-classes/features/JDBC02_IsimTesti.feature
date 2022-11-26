
  Feature: JDBC 02 Kullanici ID ile database testi yapar

    Scenario: JDBC 02 Kullanici id degeri ile isim testi yapabilmeli

      Given Kullanici JDBC ile database baglanir
      Then id'si 14 olan userin "last_name" degerinin "Pymar" oldugunu test eder
