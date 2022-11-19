@wip
  Feature: US1011 Automation Practice Kullanici olusturma testi

    Scenario: TC18 Kullanici yeni kullanici olusturabilmeli


    1.http://automationexercise.com sayfasina gidelim
    2.Cucumber ile asagidaki testi yapalim
      Given Kullanici "automationUrl" anasayfaya gider
      And user signUp linkine tiklar
      And New user bölümüne name ve email adresi girer
      And SignUp butonuna basar
      And user kisisel bilgilerini ve iletisim bilgilerini girer
      And user create account butonuna basar
      Then hesap olustugunu dogrulayin