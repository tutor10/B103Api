package get_requests;

import org.junit.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
public class Get01 {
    /*
        Given
            https://restful-booker.herokuapp.com/booking/55
        When
            User sends a GET Request to the url
        Then
            HTTP Status Code should be 200
        And
            Content Type should be JSON
        And
            Status Line should be HTTP/1.1 200 OK
          */

    @Test
    public void get01(){
//        i)Set the URL
       String url = "http://restful-booker.herokuapp.com/booking/55";
//
//        ii)Set the expected data
//
//        iii)Send the request and get the response
        Response response = given().when().get(url);
        response.prettyPrint();

//       iv)Do assertion
        response.
                then().
                statusCode(200).//HTTP Status Code should be 200
                contentType("application/json").// Content Type should be JSON
                statusLine("HTTP/1.1 200 OK");//Status Line should be HTTP/1.1 200 OK
    }
}
