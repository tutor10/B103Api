package get_requests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
public class RequestResponse {
    /*
    1)Postman manuel API testi icin kullanilir.
    2)API otomasyonu icin Rest-Assured Library
    3)Otomasyon kodlarinin yazimi icin su adimlari izliyoruz;
       a)Gereksinimleri anlama
       b)Test case'i yazma;
          -Test cas'i yazmak icin "Gherkin Language"kullaniyoruz
          x)Given:On kosullar-->Endpoint,body
          y)When:(Action kismi)islemeler-->Get,Put,Delete...
          z)Then:Donutler-->Assert
          t)And:coklu islemlerin art arda yazilacagi yerlerde kullanilir
       c)Test kodunu yazarken su adimlari izleriz;
          i)Set the URL
         ii)Set the expected data
        iii)Send the request and get the response
         iv)Do assertion

     */
    public static void main(String[] args) {
        String url="https://restful-booker.herokuapp.com/booking/55";

        //Get request nasil yapilir:
        Response response = given().when().get(url);//genelde bunu kullaniriz
        //Response response = get(url);//ikinci yontem

        response.prettyPrint();//prettyPrint() methodu response datayi JSON formatinda yazdirir.

        //Status Code nasil yazdirilir
        System.out.println("Status Code:"+response.statusCode());

        // Content Type nasil yazdirilir
        System.out.println("Content Type : "+response.contentType());

        //Status Line nasil yazdirilir
        System.out.println("Status Line :"+response.statusLine());

        //Header nasil yazdirilir.
        System.out.println(response.header("Connection"));
        System.out.println(response.header("Server"));

        //Headers nasil yazdirilir.
        System.out.println("--------------------- HEADERS --------------------");
        System.out.println(response.getHeaders());
        System.out.println("--------------------- ////// --------------------");

        //Time nasil yazdirilir.
        System.out.println("Time :"+response.getTime());

    }
}
