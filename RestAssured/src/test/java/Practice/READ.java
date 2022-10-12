package Practice;


import org.apache.commons.lang3.text.WordUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class READ {

	@Test
	public void test_02() throws IOException {
		given().
		get("https://simple-books-api.glitch.me/books").
		
		then().
		log().all().statusCode(200);
		
		String name=given().contentType(ContentType.JSON).log().all()
		.get().then().extract().path("name");
		
		
		
		FileInputStream fis = new FileInputStream("./Data/Testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);//Create() will make the excel file.
		Sheet sh = wb.getSheet("City");//specify sheetname
		Row ro = sh.getRow(0);//specify which row
		Cell cell = ro.createCell(0);//specify create cell
		cell.setCellValue("name");//store the data
		
		FileOutputStream fos = new FileOutputStream("./Data/Testdata.xlsx");
		wb.write(fos);//write the data
		wb.close();//Close the heavy resource
		
		
	
	}

}
