package org.bsc;

import java.awt.event.KeyEvent;

import org.cmt.Basecls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Exqcls {
 public static void main(String[] args) throws Exception {
	Basecls b=new Basecls();
WebDriver driver = b.brouserName("chrome");
b.lodurl("http://adactinhotelapp.com/index.php");
WebElement txtuser = driver.findElement(By.id("username"));
b.sendkey(txtuser, b.dataFromExcel("Sheet1",1,0));
WebElement txtpass = driver.findElement(By.xpath("//input[@type='password']"));
b.sendkey(txtpass, b.dataFromExcel("Sheet1",1,1));
 WebElement cliklgbtn = driver.findElement(By.id("login"));
 b.clikckbtn(cliklgbtn);
 WebElement sercbtn = driver.findElement(By.id("Submit")); 
b.clikckbtn(sercbtn);
WebElement loc = driver.findElement(By.id("location"));
b.selectbyvisibletxt(loc, b.dataFromExcel("Sheet1", 1, 2));
WebElement selhotl = driver.findElement(By.id("hotels"));
b.selectbyvisibletxt(selhotl, b.dataFromExcel("Sheet1", 1, 3));
WebElement roomtype = driver.findElement(By.id("room_type"));
b.selectbyvisibletxt(roomtype, b.dataFromExcel("Sheet1", 1, 4));
WebElement roomno = driver.findElement(By.id("room_nos"));
b.selectbyvalue(roomno, b.dataFromExcel("Sheet1", 1, 5));
WebElement indate = driver.findElement(By.id("datepick_in"));
b.sendkey(indate, b.dataFromExcel("Sheet1", 1, 6));
WebElement outdate = driver.findElement(By.id("datepick_out"));
b.sendkey(outdate, b.dataFromExcel("Sheet1", 1, 7));
WebElement adltrm = driver.findElement(By.id("adult_room"));
b.selectbyvalue(adltrm, b.dataFromExcel("Sheet1",1 ,8 ));
WebElement childno = driver.findElement(By.id("child_room"));
b.selectbyvalue(childno, b.dataFromExcel("Sheet1",1 ,9 ));
WebElement selbtn = driver.findElement(By.name("Submit"));
b.clikckbtn(selbtn);
WebElement selradiobtn = driver.findElement(By.id("radiobutton_0"));
b.clikckbtn(selradiobtn);
WebElement clikcontinue = driver.findElement(By.id("continue"));
b.clikckbtn(clikcontinue);
WebElement fstname = driver.findElement(By.id("first_name"));
b.sendkey(fstname, b.dataFromExcel("Sheet1", 1	, 10));
WebElement lastname = driver.findElement(By.id("last_name"));
b.sendkey(lastname, b.dataFromExcel("Sheet1", 1, 11));
WebElement addres = driver.findElement(By.id("address"));
b.sendkey(addres, b.dataFromExcel("Sheet1", 1, 12));
 WebElement cardno = driver.findElement(By.name("cc_num"));
 b.sendkey(cardno, b.dataFromExcel("Sheet1", 1, 13));
 WebElement cardtype = driver.findElement(By.id("cc_type"));
 b.selectbyvisibletxt(cardtype, b.dataFromExcel("Sheet1", 1, 14));
 WebElement cardexpmonth = driver.findElement(By.id("cc_exp_month"));
 b.selectbyvisibletxt(cardexpmonth, b.dataFromExcel("Sheet1", 1, 15));
 WebElement expyer = driver.findElement(By.id("cc_exp_year"));
 b.selectbyvisibletxt(expyer, b.dataFromExcel("Sheet1", 1, 16));
 WebElement ccvno = driver.findElement(By.name("cc_cvv"));
 b.sendkey(ccvno, b.dataFromExcel("Sheet1", 1, 17));
 WebElement clikbooknow = driver.findElement(By.id("book_now"));
 b.clikckbtn(clikbooknow);
 WebElement orderid = driver.findElement(By.id("order_no"));
 String value = orderid.getAttribute("value");
 System.out.println(value);
 driver.quit();
 System.out.println("abcd");
 System.out.println("abcd");
 System.out.println("abcd");
 System.out.println("abcd");
 System.out.println("abcd");
 System.out.println("abcd");
 System.out.println("abcd");
 
 
 System.out.println(2141);
 System.out.println(2141);
 System.out.println(2141);
 System.out.println(2141);
 System.out.println(2141);
 System.out.println(2141);
System.out.println("zxy"); 
System.out.println("zxy"); 
System.out.println("zxy"); 
System.out.println("zxy"); 
System.out.println("zxy"); 
System.out.println("zxy"); 
System.out.println("zxy"); 
System.out.println("zxy"); 
 
 
 
 
 
 
 }

}
