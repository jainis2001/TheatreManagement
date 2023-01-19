package com.brevitaz.stage3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BookSeat{
	int ticketPrice;
	private int row,colm,total,firstHalfRow,secondHalfRow,rowSize,colmSize;
	private int pricels60=10,pricegt60firsthalf=10,pricegt60fscndhalf=8;

	public int getPricels60() {
		return pricels60;
	}

	public void setPricels60(int pricels60) {
		this.pricels60 = pricels60;
	}

	public int getPricegt60firsthalf() {
		return pricegt60firsthalf;
	}

	public void setPricegt60firsthalf(int pricegt60firsthalf) {
		this.pricegt60firsthalf = pricegt60firsthalf;
	}

	public int getPricegt60fscndhalf() {
		return pricegt60fscndhalf;
	}

	public void setPricegt60fscndhalf(int pricegt60fscndhalf) {
		this.pricegt60fscndhalf = pricegt60fscndhalf;
	}

	Scanner scan=null;

	public void getBooked(int[][] seats)
	{
		scan=new Scanner(System.in);
		try{

			System.out.println("Enter number of row:");
			row =scan.nextInt();
			System.out.println("Enter seat number in "+(row)+" row:");
			colm =scan.nextInt();
			rowSize=seats.length-1;
			colmSize=seats[0].length-1;
			total=rowSize*colmSize;
			if((row>0 && row<=rowSize) && (colm>0 && colm<=colmSize))
			{
				if(total>0 &&total<60)
				{
					ticketPrice=pricels60;
				}
				else{
					firstHalfRow=rowSize/2;
					secondHalfRow=rowSize-firstHalfRow;

					if(row<=firstHalfRow)
					{
						ticketPrice=pricegt60firsthalf;
					}
					else if(row>firstHalfRow) {
						ticketPrice=pricegt60fscndhalf;
					}
				}
				System.out.println("\nTicket Price:\n$"+ticketPrice);

			}
			else{
				System.err.println("row and seat should be till "+rowSize+" and "+colmSize);
				scan.reset();
				getBooked(seats);
			}
			seats[row][colm]='B';
		}
		catch (InputMismatchException i)
		{
			System.err.println("Only Integer Input Allowed");
			System.out.println("Enter again");
			scan.reset();
			getBooked(seats);
		}
		catch (Exception e)
		{
			System.err.println("Something went wrong..");
			System.out.println("Enter again");
			scan.reset();
			getBooked(seats);
		}
	}
}
