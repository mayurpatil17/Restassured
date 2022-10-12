package Rest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class StatusOfSimpleBooksAPI {

	@Test
	void test_01() {
		Response response=RestAssured.get("https://simple-books-api.glitch.me/status");
		System.out.println(response.body().asString());
		
	}
}

