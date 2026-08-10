package Day40;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDynamicDataIntoExcel {

	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\myfile_dynamic.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet =  workbook.createSheet("Dynamic Data");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter many rows do you want to have :");
		int noOfRows=sc.nextInt();
		int noOfCol = sc.nextInt();
		for (int r= 0; r<noOfRows;r++)
			
		{
			XSSFRow currentRow=sheet.createRow(r);
			for (int c=0; c<noOfCol; c++)
			{ XSSFCell col= currentRow.createCell(c);
			col.setCellValue(sc.next());
			
				
			}
		}
		
		workbook.write(file);
		workbook.close();
		file.close();
		System.out.println("file created");

		
	}

}
