package org.cmt;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.page.BookAHotel;
import org.page.BookingConformPage;
import org.page.Loginpage;
import org.page.SelectHotelpage;
import org.page.SerchHotel;

public class Pomdatas extends Basecls {
	public static void main(String[] args) throws IOException {
		Pomdatas p = new Pomdatas();
		WebDriver driver = p.brouserName("chrome");
		p.lodurl("http://adactinhotelapp.com/index.php");
		Loginpage l = new Loginpage();
		SerchHotel sh = new SerchHotel();
		SelectHotelpage shp = new SelectHotelpage();
		BookAHotel bh = new BookAHotel();
		BookingConformPage bcp = new BookingConformPage();
		p.sendkey(l.getTxtuser(), p.dataFromExcel("Sheet1", 1, 0));
		p.sendkey(l.getTxtpass(), p.dataFromExcel("Sheet1", 1, 1));
		p.clikckbtn(l.getCliklogin());
		p.selectbyvisibletxt(sh.getLocation(), p.dataFromExcel("Sheet1", 1, 2));
		p.selectbyvisibletxt(sh.getHotels(), p.dataFromExcel("Sheet1", 1, 3));
		p.selectbyvisibletxt(sh.getRoomtype(), p.dataFromExcel("Sheet1", 1, 4));
		p.selectbyvalue(sh.getRoomno(), p.dataFromExcel("Sheet1", 1, 5));
		p.sendkey(sh.getCheckindate(), p.dataFromExcel("Sheet1", 1, 6));
		p.sendkey(sh.getCheckout(), p.dataFromExcel("Sheet1", 1, 7));
		p.selectbyvalue(sh.getAdultroom(), p.dataFromExcel("Sheet1", 1, 8));
		p.selectbyvalue(sh.getChildroom(), p.dataFromExcel("Sheet1", 1, 9));
		p.clikckbtn(sh.getSubmit());
		p.clikckbtn(shp.getSelhotel());
		p.clikckbtn(shp.getClikcontinue());
		p.sendkey(bh.getFirstname(), p.dataFromExcel("Sheet1", 1, 10));
		p.sendkey(bh.getLastname(), p.dataFromExcel("Sheet1", 1, 11));
		p.sendkey(bh.getAddress(), p.dataFromExcel("Sheet1", 1, 12));
		p.sendkey(bh.getCardno(), p.dataFromExcel("Sheet1", 1, 13));
		p.selectbyvisibletxt(bh.getCardtype(), p.dataFromExcel("Sheet1", 1, 14));
		p.selectbyvisibletxt(bh.getCardexprymonth(), p.dataFromExcel("Sheet1", 1, 15));
		p.selectbyvalue(bh.getCardexpryyer(), p.dataFromExcel("Sheet1", 1, 16));
		p.sendkey(bh.getCcv(), p.dataFromExcel("Sheet1", 1, 17));
		p.clikckbtn(bh.getBooknow());
		p.clikckbtn(bh.getBooknow());
		p.clikckbtn(bh.getBooknow());
		p.clikckbtn(bh.getBooknow());
		p.clikckbtn(bh.getBooknow());

	}

}
