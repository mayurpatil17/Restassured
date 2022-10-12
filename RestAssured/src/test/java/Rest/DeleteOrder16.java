package Rest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DeleteOrder16 implements AccessToken {

	@Test
	public void test_16() {

		RestAssured.baseURI="https://simple-books-api.glitch.me";
		RestAssured.given().header("Authorization",accessToken).delete("/orders/TZ4D-t_DHJpHWFeKjRjXY")
	    .then().log().all();
		
	}

}
