package Rest;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class OutOfStock8 implements AccessToken{

	@Test
	public void test_08() {

		JSONObject request = new JSONObject();
		request.put("bookId",2);

		String payload = request.toJSONString();

		String token = accessToken;

		RequestSpecification req = RestAssured.given().header("Authorization",token).
				contentType("application/json").
				body(payload);

		Response response = req.post("https://simple-books-api.glitch.me/orders/");

		int statusCode = response.getStatusCode();
		String body = response.body().asString();
		String statusLine = response.getStatusLine();

		System.out.println("Status Code:"+statusCode+statusLine);
		System.out.println("Body:"+body);
		




	}
}
