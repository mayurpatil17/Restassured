import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class ListOfBooks {

	@Test
	public void test_02() {
		given().
		get("https://simple-books-api.glitch.me/books").
		
		then().
		log().all().statusCode(200);
		
	}
}
