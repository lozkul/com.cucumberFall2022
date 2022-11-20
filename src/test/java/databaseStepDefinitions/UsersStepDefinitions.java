package databaseStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.*;

public class UsersStepDefinitions {
    /*
    Bir database'e baglanmak ve o database'deki tablolarda islem yapabilmek icin
oncelikle sistem yoneticisi ile gorusup gerekli bilgileri almalisiniz

Domain ve IP : sql748.main-hosting.eu ya da 82.180.174.52
Port : 3306
Veritabanı : u480337000_jdbc_data
Kullanıcı Adı : u480337000_jdbc_user
Parola : 4Ob8Y]DJU/f

Tablo : users
Users Tablosu Alanlar : id,first_name,last_name,email,gender,birth_date,ip_address,
                       is_customer,customer_number,status
database turu : mySql
1- ilk adim olarak database turune uygun JDBC dependency'yi pom'a eklemeliyiz.
2- database turune uygun olarak URL, user name ve password hazirlayin.

     */

    String url="jdbc:mysql://sql748.main-hosting.eu:3306/u480337000_jdbc_data";
    String username="u480337000_jdbc_user";
    String password="4Ob8Y]DJU/f";

    Connection connection; //database baglantimizi saglayacak
    Statement statement; // databaseteki istediğimiz queryleri calistirmamizi sağlar
    ResultSet resultSet; //statement ile yapılan sorgu sonucunu store etmek için kullanılır




    @Given("Kullanici JDBC ile databaseebaglanir")
    public void kullanici_jdbc_ile_databaseebaglanir() throws SQLException {
        // connection bu adımda adımda kuruldu
        // sonra queryleri çalıştıracağımız statement objesi de ilk adımda oluşturuldu
        connection= DriverManager.getConnection(url, username, password);
        statement= connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    }
    @Then("users tablosundaki isim verilerini alir")
    public void users_tablosundaki_isim_verilerini_alir() throws SQLException {
                // şimdi önce string olarak sorguyu hazırlayıp
        // sonra statement objesini kullanarak queryyi çalıştıracağız
        // ve dönen sonucu resultset objesine store edeceğiz
        String query="select isim from users";
        resultSet=statement.executeQuery(query);
    }
    @Then("isim verilerini test eder")
    public void isim_verilerini_test_eder() {
        // ilk 2 adımda gerrekli java sql objelerini oluşturduk
        // yani connection ile bağlatıyı sağladık
        // statement'a connection uzerinden sorgu yapma ozelliklerini yukledik
        // statement objesini kullanarak istedigimiz database sorgusunu calistirip
        // sonuclari resultSet objesine store ettik
        // yani şu anda elimizde 1000 adet isim barındıran bir resultSet objesi var
        // bu objeyi kullanarak istediğimiz isim bilfilerine ulaşabilir ve istenen testleri yapabiliriz.


    }


}
