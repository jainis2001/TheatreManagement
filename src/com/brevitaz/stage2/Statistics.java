package com.brevitaz.stage2;


import com.brevitaz.stage3.BookSeat;

import java.awt.print.Book;

public class Statistics {
	int[][] tempSeats;
	private int firstHalfRow,secondHalfRow,firstHalfCount,secondHalfCount;
	private int total,totalIncome;
	private  float percentage;







	public void getStatisticDetails(BookSeat _book,int[][] seats)
	{
		int rowCount=seats.length-1;
		int colmCount= seats[0].length-1;

		total=rowCount*colmCount;
		if(total>0 &&total<60)
		{
			totalIncome=rowCount*(colmCount*10);
		}
		else{
			firstHalfRow=rowCount/2;
			secondHalfRow=rowCount-firstHalfRow;

			firstHalfCount = firstHalfRow *(colmCount*10) ;
			secondHalfCount=secondHalfRow*(colmCount*8) ;
			totalIncome=firstHalfCount+secondHalfCount;
		}
		percentage=((float)(_book.getNumOfTickets()*100))/total;



		System.out.println("\nnumber of purchased tickets: $"+_book.getNumOfTickets());
		System.out.printf("Percentage: %.2f",percentage);
		System.out.println("%");
		System.out.println("Current Income: $"+_book.getCurrentIncome());
		System.out.println("Total Income: $"+totalIncome);
		System.out.println();

	}
}
