package com.brevitaz.stage3;

import com.brevitaz.stage1.TheatreManagement;
import com.brevitaz.stage2.Statistics;

public class Main {
	public static void main(String[] args) {
		int tempRowSize=0,tempColmSize=0;
		TheatreManagement theatre=new TheatreManagement();
		theatre.createHall();
		theatre.showHall();
		BookSeat book=new BookSeat();
		book.getBooked(theatre.getHall());
		theatre.showHall();


	}
}
