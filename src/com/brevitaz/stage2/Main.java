package com.brevitaz.stage2;

import com.brevitaz.stage1.TheatreManagement;
//comment
public class Main {
	public static void main(String[] args) {

		int tempRowSize=0,tempColmSize=0;
		TheatreManagement theatre=new TheatreManagement();
		theatre.createHall();
		tempRowSize=theatre.getHall().length-1;
		tempColmSize=theatre.getHall()[0].length-1;
		Statistics stat=new Statistics();
		stat.getTotalIncome(tempRowSize,tempColmSize);
	}
}
