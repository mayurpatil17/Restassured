import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

public class PathParameter {
	@Test
	public void test_5(){

		RestAssured.baseURI="https://simple-books-api.glitch.me";
		given().pathParam("id", 3).
		get("books/{id}").
		then().statusCode(200).log().all();
		
	}
}


