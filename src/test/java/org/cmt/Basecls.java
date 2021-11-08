package org.cmt;

import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basecls {
	public static WebDriver driver;
	static JavascriptExecutor js;

	public WebDriver brouserName(String brouserName) {
		try {
			if (brouserName.equals("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			} else if (brouserName.equals("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			} else if (brouserName.equals("ie")) {
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return driver;
	}

	public void lodurl(String url) {
		try {
			driver.get(url);
		} catch (Exception e1) {
			System.out.println(e1.getMessage());
		}

	}

	public void clear(WebElement clr) {

	}

	public void sendkey(WebElement passtxt, String data) {
		try {
			passtxt.clear();
			passtxt.sendKeys(data);
		} catch (Exception e2) {
			System.out.println(e2.getMessage());
		}
	}

	public void clikckbtn(WebElement click) {
		click.click();
	}

	public void quit(WebDriver driver) {
		driver.quit();
	}

	public void draganddropm(WebElement source, WebElement traget) {
		try {
			Actions a = new Actions(driver);
			a.dragAndDrop(source, traget).perform();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void Movetoelement(WebElement target) {
		try {
			Actions a1 = new Actions(driver);
			a1.moveToElement(target).perform();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void doubleclick() {
		try {
			Actions a2 = new Actions(driver);
			a2.doubleClick().perform();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void contextclick(WebElement target) {
		try {
			Actions a3 = new Actions(driver);
			a3.contextClick(target).perform();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void Selectionbyindex(WebElement element, int vlu) {
		try {
			Select s1 = new Select(element);
			s1.selectByIndex(vlu);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void selectbyvalue(WebElement element, String value) {
		try {
			Select s2 = new Select(element);
			s2.selectByValue(value);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectbyvisibletxt(WebElement element, String Text) {
		try {
			Select s3 = new Select(element);
			s3.selectByVisibleText(Text);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deselectbyindex(WebElement element, int index) {
		try {
			Select s4 = new Select(element);
			s4.deselectByIndex(index);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deselectbyvalue(WebElement element, String value) {
		try {
			Select s5 = new Select(element);
			s5.deselectByValue(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deselectbyvisibletxt(WebElement element, String Text) {
		try {
			Select s6 = new Select(element);
			s6.deselectByVisibleText(Text);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deselectall(WebElement element) {
		try {
			Select s7 = new Select(element);
			s7.deselectAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<WebElement> getoption(WebElement element) {
		List<WebElement> list = null;
		try {
			Select s8 = new Select(element);

			list = s8.getOptions();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return list;
	}

	public List<WebElement> getalloption(WebElement element) {
		List<WebElement> allSelectedOptions = null;
		try {
			Select s9 = new Select(element);
			allSelectedOptions = s9.getAllSelectedOptions();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return allSelectedOptions;
	}

	public void getfirstselect(WebElement element, String text) {
		try {
			Select s10 = new Select(element);

			s10.getFirstSelectedOption();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public boolean ismultiply(WebElement element) {
		boolean multiple = false;
		try {
			Select s11 = new Select(element);

			multiple = s11.isMultiple();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return multiple;
	}

	public void keypress(int KeyEvent) {
		try {
			Robot r1 = new Robot();
			r1.keyPress(KeyEvent);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void keyrelease(int KeyEvent) {
		try {
			Robot r2 = new Robot();
			r2.keyRelease(KeyEvent);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public TargetLocator switchto() {
		TargetLocator switchTo = null;
		try {
			switchTo = driver.switchTo();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return switchTo;
	}

	public Alert alartswitchto() {
		Alert alert = null;
		try {
			alert = switchto().alert();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return alert;
	}

	public void acceptalert() {
		try {
			alartswitchto().accept();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void dissmisal() {
		try {
			alartswitchto().dismiss();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void sendkeysalert(String txt) {
		try {
			alartswitchto().sendKeys(txt);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public String gettxt() {
		String text = null;
		try {
			text = alartswitchto().getText();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}

	public void framesid(int id) {
		try {
			switchto().frame(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void framesname(String name) {
		try {
			switchto().frame(name);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void frameswebele(WebElement element) {
		try {
			switchto().frame(element);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void framesint(int number) {
		try {
			switchto().frame(number);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void javascript() {
		try {
			js = (JavascriptExecutor) driver;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void javascriptexc(String data, WebElement ele) {
		try {
			js.executeScript("arguments[0].setAttribute('value''\"+data+\"',)\"", ele);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void javascclick(String data, WebElement el) {
		js.executeScript("arguments[0].click", el);
	}

	public void scrolldown(String data, WebElement el) {
		try {
			js.executeScript("arguments[0].scrollIntoView(true)", el);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void scrollup(String data, WebElement el) {
		try {
			js.executeScript("arguments[0].scrollIntoView(true)", el);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public Navigation navication() {
		Navigation navigation = null;
		try {
			navigation = driver.navigate();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return navigation;
	}

	public void navigateto(String url) {
		try {
			navication().to(url);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void navigateback() {
		try {
			navication().back();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void navigateforwad() {
		try {
			navication().forward();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void navigaterefresh() {
		try {
			navication().refresh();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	static WebElement wb;

	public void WebElement() {
		try {
			wb = (WebElement) driver;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public boolean isdisplay() {
		boolean displayed = false;
		try {
			displayed = wb.isDisplayed();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return displayed;
	}

	public boolean isselect() {
		boolean selected = false;
		try {
			selected = wb.isSelected();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return selected;
	}

	public boolean iselnable() {
		boolean enabled = false;
		try {
			enabled = wb.isEnabled();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return enabled;
	}

	public String dataFromExcel(String sheetname, int row, int cell) throws IOException {

		String value = null;
		File f = new File("C:\\Users\\Gopi\\eclipse-workspace\\FrameworkProject\\Excel\\datasheet.xlsx");
		FileInputStream stream = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(stream);
		Sheet sheet = book.getSheet(sheetname);
		Row r = sheet.getRow(row);
		Cell c = r.getCell(cell);

		if (c.getCellType() == 1) {
			value = c.getStringCellValue();
		}
		if (c.getCellType() == 0) {
			if (DateUtil.isCellDateFormatted(c)) {
				Date dte = c.getDateCellValue();
				SimpleDateFormat d = new SimpleDateFormat("dd-MM-yyyy");
				value = d.format(dte);
			} else {
				double nv = c.getNumericCellValue();
				long l = (long) nv;
				value = String.valueOf(l);
			}
		}
		return value;

	}

}
