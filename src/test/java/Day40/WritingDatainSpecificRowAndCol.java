package Day40;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDatainSpecificRowAndCol {

	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\myfileRandom.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet =  workbook.createSheet("Data");
		XSSFRow row3=sheet.createRow(3);
		row3.createCell(4).setCellValue("Java");
		
		
		
		workbook.write(file);
		
		workbook.close();
		file.close();
		System.out.println("file created");

		
	}

}
