package Day41;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FDCalculator {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();
		String filePath = System.getProperty("user.dir")+"\\TestData\\caldata.xlsx";
		FileInputStream file = new FileInputStream(filePath);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int maxRow = sheet.getLastRowNum();
		//int maxCol = sheet.getRow(1).getLastCellNum();
		for(int i =1; i<=maxRow;i++)
		{
			XSSFRow currentRow = sheet.getRow(i);
			
			XSSFCell cell1	= currentRow.getCell(0);
				String pric = cell1.toString();
				XSSFCell cell2	= currentRow.getCell(1);
				String rateofinterest = cell2.toString();
				XSSFCell cell3	= currentRow.getCell(2);
				String per1 = cell3.toString();
				XSSFCell cell4	= currentRow.getCell(3);
				String per2 = cell4.toString();
				XSSFCell cell5	= currentRow.getCell(4);
				String frequency = cell5.toString();
				XSSFCell cell6	= currentRow.getCell(5);
				String expectedMaturityValue = cell6.toString();
				driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(pric);
				driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(rateofinterest);
				driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(per1);
				WebElement sel =driver.findElement(By.xpath("//input[@id='tenurePeriod']"));
				Select seloption = new Select(sel);
				seloption.selectByVisibleText(per2);
				Select freoption = new Select(driver.findElement(By.xpath("//input[@id='frequency']")));
				freoption.selectByVisibleText(frequency);
				driver.findElement(By.xpath("//div[@class='CTR PT15']/a[1]/img")).click();
				String displayValue = driver.findElement(By.xpath("//span[@class='gL_27']/strong")).getText();
				if(Double.parseDouble(displayValue)==Double.parseDouble(expectedMaturityValue))
				{
					System.out.println("Test Pass");
					currentRow.createCell(7).setCellValue("Pass");
					
				}
				else
				{
					System.out.println("Test Fail");
					currentRow.createCell(7).setCellValue("Fail");
				}
				
				driver.findElement(By.xpath("//div[@class='CTR PT15']/a[2]/img")).click();
		}

	}

}
