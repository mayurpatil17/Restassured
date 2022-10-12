
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class NonFiction {
	@Test
	public void test_04() {
		given().get("https://simple-books-api.glitch.me/books?type=non-fiction&limit=3").
		then().statusCode(200).
		statusLine("HTTP/1.1 200 OK").
		log().all();		
	    
	}

}
