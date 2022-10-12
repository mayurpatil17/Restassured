
import org.testng.annotations.Test;
import io.restassured.RestAssured;


public class ParticularPersonOrderDetails implements AccessToken{

	@Test
	public void test_10() {

		RestAssured.given()
		.header("Authorization",accessToken)
		.contentType("application/json")
		.get("https://simple-books-api.glitch.me/orders/gg7frbcfC1ArqbTZABfny")
		.then()
		.statusCode(200)
		.log().body();
		
	}
	
}
