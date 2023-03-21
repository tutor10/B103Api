package get_requests;

import base_urls.RegresBaseUrl;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class Odev02 extends RegresBaseUrl {
      /*
        Given
            https://reqres.in/api/users/23
        When
            User send a GET Request to the url
        Then
            HTTP Status code should be 404
        And
            Status Line should be HTTP/1.1 404 Not Found
        And
            Server is "cloudflare"
        And
            Response body should be empty
     *
       */

    @Test
    public void odev02Test(){
        //Set the URL
        spec.pathParams("first","users","second",23);

        //Set the expected data

        //Send the request and get te response
        Response response = given().when().spec(spec).get("/{first}/{second}");
        response.prettyPrint();

        //Do Assertion
     assertEquals(404,response.statusCode());
     assertEquals("HTTP/1.1 404 Not Found",response.statusLine());
     assertEquals("cloudflare",response.header("Server"));
     assertEquals(2,response.asString().replaceAll("\\s","").length());
    }
}
