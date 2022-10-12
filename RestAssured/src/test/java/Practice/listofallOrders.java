
package Practice;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class listofallOrders {
	@Test
	public void getListofallOrders() {
		String token="a586fdcadc44454749e98e28c39865136d02ab3c2074aff7470d3cded412a235";
		String authToken=token;
		
		RequestSpecification request=RestAssured.given().header("Authorization",authToken)
				                          .contentType("application/json");
				   Response response=  request.get("https://simple-books-api.glitch.me/orders/");
				   System.out.println("status code..." + response.getStatusCode());
				   System.out.println("response time..."+ response.getTime());
				   System.out.println("body..." + response.getBody().asString());
		
		
		
		
		
		
		/*RestAssured.baseURI="https://simple-books-api.glitch.me";
		JSONObject request = new JSONObject();
		request.put("clientName","jitendray15");
		request.put("clientEmail","jitendray15@gmail.com");

		String payload=request.toJSONString();
		String token="a586fdcadc44454749e98e28c39865136d02ab3c2074aff7470d3cded412a235";
		String authToken=token;
		RequestSpecification req = RestAssured.given().header("Authorization",authToken).contentType("application/json").body(payload);
		Response response = req.get("/orders");
		System.out.println(response);
		ResponseBody allorders = response.getBody();
		System.out.println(allorders);
		int scode = response.getStatusCode();
		System.out.println("statuscode :" +scode);*/
		
		
		
		
		
	}

}