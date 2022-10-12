package Rest;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Order7 implements AccessToken {
	
	@Test
	public void test_07(){
		
		JSONObject request = new JSONObject();
		request.put("bookId","5");
		request.put("customerName", "Yash");
		
		String payload = request.toJSONString();
		
		String authToken= accessToken;
		
		RequestSpecification req = RestAssured.given().header("Authorization",authToken).
		contentType("application/json").
		body(payload);
		
		Response response = req.post("https://simple-books-api.glitch.me/orders/");
		
		int statusCode = response.getStatusCode();
		System.out.println("Status Code:"+statusCode);
		
		System.out.println("Body:"+response.body().asString());
		
		
		
	}

}
