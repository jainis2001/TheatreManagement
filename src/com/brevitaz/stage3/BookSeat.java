package com.brevitaz.stage3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BookSeat{
	int ticketPrice;
	private int row,colm,total,firstHalfRow,secondHalfRow,rowSize,colmSize,seatRow,seatColm,numOfTickets,currentIncome;
	private int pricels60=10,pricegt60firsthalf=10,pricegt60scndhalf=8;

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

	public int getPricegt60scndhalf() {
		return pricegt60scndhalf;
	}

	public void setPricegt60scndhalf(int pricegt60scndhalf) {
		this.pricegt60scndhalf = pricegt60scndhalf;
	}

	public int getNumOfTickets() {
		return numOfTickets;
	}

	public int getCurrentIncome() {
		return currentIncome;
	}

	Scanner scan=null;



	public void getBooked(int[][] seats)
	{
		Scanner scan=new Scanner(System.in);

		try{

			System.out.println("Enter number of row:");
			row =scan.nextInt();
			System.out.println("Enter seat number in "+(row)+" row:");
			colm =scan.nextInt();

			rowSize=seats.length-1;
			colmSize=seats[0].length-1;

			total=rowSize*colmSize;
			if(seats[row][colm]=='B'){
				System.err.println("That ticket has already been purchased!");
				getBooked(seats);
			}
			else if((row>0 && row<=rowSize) && (colm>0 && colm<=colmSize))
			{
				if(total>0 &&total<60)
				{
					ticketPrice=pricels60;
					currentIncome+=pricels60;
				}
				else{

					firstHalfRow=rowSize/2;
					secondHalfRow=rowSize-firstHalfRow;

					if(row<=firstHalfRow)
					{
						ticketPrice=pricegt60firsthalf;
						currentIncome+=pricegt60firsthalf;
					}
					else if(row>firstHalfRow) {
						ticketPrice=pricegt60scndhalf;
						currentIncome+=pricegt60scndhalf;
					}

				}
				System.out.println("\nTicket Price:\n$"+ticketPrice);
				seats[row][colm]='B';
				numOfTickets++;
			}
			else{
				System.err.println("row and seat should be till "+rowSize+" and "+colmSize);
				getBooked(seats);
			}



		}
		catch (InputMismatchException i)
		{
			System.err.println("Only Integer Input Allowed");
			System.out.println("Enter again");
			getBooked(seats);
		}
		catch (IndexOutOfBoundsException bound)
		{
			System.err.println("row and seat should be till "+rowSize+" and "+colmSize);
			System.out.println("Enter again");
			getBooked(seats);
		}
		catch (Exception e)
		{
			System.err.println("Something went wrong..");
			System.out.println("Enter again");
			getBooked(seats);

		}


	}
}
