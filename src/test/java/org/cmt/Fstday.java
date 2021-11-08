package org.cmt;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fstday {
private static final int i = 0;

public static void main(String[] args) throws IOException {
	
	WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	WebElement serbr = driver.findElement(By.id("twotabsearchtextbox"));
serbr.sendKeys("iphone",Keys.ENTER);}}
	