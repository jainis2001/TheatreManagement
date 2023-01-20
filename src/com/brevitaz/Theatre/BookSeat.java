package com.brevitaz.Theatre;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BookSeat{
	private int rowSize;
	private int colmSize;
	private int ticketPrice;

	// getBooked(char[][] seats) will take array and booked the particular seat according the user input
	// according the chosen seat will show ticket price
	public void getBooked(char[][] seats)
	{
		int totalRoomSeats,firstHalfRow,priceLS60=10,priceGT60FirstHalf=10,priceGT60SecondHalf=8;
		Scanner scan = new Scanner(System.in);
		try{

			System.out.println("Enter number of row:");
			int row = scan.nextInt();
			System.out.println("Enter seat number in "+(row)+" row:");
			int colm = scan.nextInt();

			rowSize=seats.length;
			colmSize=seats[0].length;
			firstHalfRow=rowSize/2;

			totalRoomSeats=rowSize*colmSize;
			if(seats[(row -1)][(colm -1)]=='B'){
				System.err.println("That ticket has already been purchased!");
				scan.reset();
				getBooked(seats);
			}
			else if(totalRoomSeats>0 &&totalRoomSeats<60) {
				ticketPrice=priceLS60;
			}
			else if(row <=firstHalfRow) {
				ticketPrice=priceGT60FirstHalf;
			}
			else{
			ticketPrice=priceGT60SecondHalf;
			}
			seats[(row -1)][(colm -1)]='B';

			System.out.println("\nTicket Price:\n$"+ticketPrice);

		}
		catch (InputMismatchException i)
		{
			System.err.println("Only Integer Input Allowed");
			System.out.println("Enter again");
			scan.reset();
			getBooked(seats);
		}
		catch (IndexOutOfBoundsException bound)
		{
			System.err.println("row and seat should be till "+rowSize+" and "+colmSize);
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
