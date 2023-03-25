package base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class GmiBankBaseUrl {

  protected RequestSpecification spec;

    @Before//Her test methodundan önce çalışır.
    public void setUp() {
         spec = new RequestSpecBuilder().setBaseUri("https://www.gmibank.com").build();
    }
}