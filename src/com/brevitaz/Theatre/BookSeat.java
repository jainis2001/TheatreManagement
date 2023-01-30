package com.brevitaz.Theatre;

import java.util.Scanner;

public class BookSeat {
	private int rowSize;
	private int colmSize;
	private int ticketPrice;
	private int row, colm;
	private char seats[][];
	private Scanner scan;

	public void initSeats(char[][] seats) {
		this.seats = seats;
		rowSize = seats.length;
		colmSize = seats[0].length;
		getInput();
	}

	public void getInput() {
		scan = new Scanner(System.in);
		try {

			System.out.println("Enter number of row:");
			row = scan.nextInt();
			System.out.println("Enter seat number in " + (row) + " row:");
			colm = scan.nextInt();
			if ((row < 1 || row > 10) || (colm < 1 || colm > 10)) {
				System.err.println("row and seat should be till 1 to " + rowSize + " and " + colmSize);
				System.out.println("Enter again");
				scan.reset();
				getInput();
			} else
				bookTicket();
		} catch (Exception e) {
			System.err.println("Only Integer Input Allowed");
			System.out.println("Enter again");
			scan.reset();
			getInput();
		}

	}

	// getBooked(char[][] seats) will take array and booked the particular seat according the user input
	// according the chosen seat will show ticket price
	public void bookTicket() {
		//inital comment
		int totalRoomSeats, firstHalfRow, priceLS60 = 10, priceGT60FirstHalf = 10, priceGT60SecondHalf = 8;

		firstHalfRow = rowSize / 2;

		totalRoomSeats = rowSize * colmSize;

		if (seats[(row - 1)][(colm - 1)] == 'B') {
			System.err.println("That ticket has already been purchased!");
			scan.reset();
			getInput();
		} else if (totalRoomSeats > 0 && totalRoomSeats < 60) {
			ticketPrice = priceLS60;
		} else if (row <= firstHalfRow) {
			ticketPrice = priceGT60FirstHalf;
		} else {
			ticketPrice = priceGT60SecondHalf;
		}
		seats[(row - 1)][(colm - 1)] = 'B';

		System.out.println("\nTicket Price:\n$" + ticketPrice);


	}
}
