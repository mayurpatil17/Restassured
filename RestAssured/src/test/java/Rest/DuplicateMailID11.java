package Rest;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class DuplicateMailID11 implements AccessToken{
	@Test
	public void test_11() {
		JSONObject request = new JSONObject();
		request.put("clientName","Mayur");
		request.put("clientEmail","Mayur@example.com");

		String payload = request.toJSONString();

		RequestSpecification req = RestAssured.given().header("Authorization",accessToken)
				.contentType("application/json")
				.body(payload);

		         req.given().post("https://simple-books-api.glitch.me/api-clients/")
				.then()
				.statusCode(409)
				.log().all();
		       
	}
}
