package base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class JsonPlaceHolderBaseUrl {

  protected RequestSpecification spec;

    @Before//Her test methodundan önce çalışır.
    public void setUp() {
         spec = new RequestSpecBuilder().setContentType(ContentType.JSON).setAccept(ContentType.JSON).setBaseUri("https://jsonplaceholder.typicode.com").build();
    }
}