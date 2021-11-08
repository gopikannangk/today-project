package org.cmt;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.print.DocFlavor.INPUT_STREAM;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testlinks {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		List<WebElement> Nooflink = driver.findElements(By.tagName("img"));
		System.out.println(Nooflink.size());
		int count = 0;
		int counts = 0;
		for (int i = 0; i < Nooflink.size(); i++) {
			WebElement getlink = Nooflink.get(i);
			String links = getlink.getAttribute("src");

			try {
				if (links != null) {
					URL url = new URL(links);
					URLConnection openConnection = url.openConnection();
					HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
					int responseCode = httpURLConnection.getResponseCode();
					if (responseCode == 200) {
						count++;
						System.out.println("Sucesses" + links);
					}

					else {
						counts++;
						System.out.println("fail links" + links);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		driver.quit();
		System.out.println("Totalsucess" + count);
		System.out.println(counts);

//		File f = new File("C:\\Users\\Gopi\\eclipse-workspace\\FrameworkProject\\Excel\\amazonlinks.xlsx");
//		Workbook book=new XSSFWorkbook();
//		Sheet sheet = book.createSheet("orderDetails");
//		Row row = sheet.getRow(0);
//		Cell cell = row.getCell(0);
//		cell.setCellValue(count);
//		FileOutputStream stream=new FileOutputStream(f);
//		book.write(stream);
		
	}
}