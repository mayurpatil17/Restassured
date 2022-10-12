package Rest;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
public class NewAPI {
	@Test
	public void test()
	{
		given().get("http://dropx.io/api/v1/products/").
		then().log().all();
	}
   

}
