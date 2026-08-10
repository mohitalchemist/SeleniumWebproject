package Day40;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingFromExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\testdata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
	    XSSFSheet sheet = workbook.getSheet("Sheet1");
	    int maxRow = sheet.getLastRowNum();
	    int maxCol = sheet.getRow(1).getLastCellNum();
	    System.out.println("number of rows :"+maxRow);
	    System.out.println("number of cols :"+maxCol);
	     for(int r=0;r<=maxRow;r++)
	     { 
	    	 XSSFRow currentRow = sheet.getRow(r);
	    	 for(int c=0;c<maxCol;c++)
	    	 {
	    		 XSSFCell cell = currentRow.getCell(c);
	    		 System.out.print(cell.toString()+ "  ");
	    		 
	    	 }
	    	 
	    	 System.out.println();
	    		 
	     }
		
		workbook.close();
		file.close();

	}

}
