package Rest;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class FictionBooks3 {
	
	@Test
	public void test_03() {
		given().get("https://simple-books-api.glitch.me/books?type=fiction").
		
		then().
		statusCode(200).log().all();
	}

}
