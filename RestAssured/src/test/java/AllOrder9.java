import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AllOrder9 implements AccessToken{

	@Test
	public void test_09() {
		
		RequestSpecification req = RestAssured.given().header("Authorization",accessToken).
		contentType("application/json");
		
		Response res = req.get("https://simple-books-api.glitch.me/orders");
		
		int statusCode = res.getStatusCode();
		String body = res.getBody().asString();
		System.out.println("Status Code:"+statusCode);
		System.out.println("Body:"+body);
		
	}
}
