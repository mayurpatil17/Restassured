import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Program6 {
	@Test
	public void test_6() {
		JSONObject request = new JSONObject();
		request.put("clientName", "MayurPatil");
		request.put("clientEmail", "MayurPatil5641@gmail.com");
		
		System.out.println(request.toJSONString());
		
		given().
		header("Content-Type","application/json").
		contentType(ContentType.JSON).accept(ContentType.JSON).
		body(request.toJSONString()).
		when().
		post("https://simple-books-api.glitch.me/api-clients/").
		then().
		statusCode(201).log().all();
		
		
		
	}

}
