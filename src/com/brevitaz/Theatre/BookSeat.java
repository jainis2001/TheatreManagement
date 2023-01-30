package com.brevitaz.Theatre;

import java.util.Scanner;

public class BookSeat {
	private int rowSize;
	private int colmSize;
	private int ticketPrice;
	private int row, colm;
	private char room[][];
	private Scanner scanner;

//	public void getRoom(char[][] room) {
//		this.room = room;
//		rowSize = room.length;
//		colmSize = room[0].length;
//		getInput();
//	}

	public void getInput(int rowSize, int colmSize) {
		this.rowSize = rowSize;
		this.colmSize = colmSize;
		scanner = new Scanner(System.in);
		try {
			System.out.println("Enter the number of row:");
			row = scanner.nextInt();
			if (row < 1 | row > rowSize) {
				System.err.println("rows range must between 1 to " + rowSize);
				scanner.reset();
				getInput(rowSize, colmSize);
			} else {
				while (true) {
					scanner = new Scanner(System.in);
					try {
						System.out.println("Enter the number of seat ");
						colm = scanner.nextInt();
						if (colm < 1 || colm > colmSize) {
							System.err.println("seats range must between 1 to " + colmSize);
						} else {
							break;
						}
					} catch (Exception e) {
						System.err.println("Only 1 to " + colmSize + " input will be allowed");
						scanner.reset();
					}

				}

			}
		} catch (Exception e) {
			System.err.println("Only 1 to " + rowSize + " input will be allowed");
			scanner.reset();
			getInput(rowSize, colmSize);
		}

	}

	public void bookTicket(char[][] room) {
		getInput(room.length, room[0].length);
		int totalRoomSeats, firstHalfRow, priceLS60 = 10, priceGT60FirstHalf = 10, priceGT60SecondHalf = 8;
		firstHalfRow = rowSize / 2;

		totalRoomSeats = rowSize * colmSize;

		if (room[(row - 1)][(colm - 1)] == 'B') {
			System.err.println("That ticket has already been purchased!");
			scanner.reset();
			getInput(rowSize, colmSize);
		} else if (totalRoomSeats > 0 && totalRoomSeats < 60) {
			ticketPrice = priceLS60;
		} else if (row <= firstHalfRow) {
			ticketPrice = priceGT60FirstHalf;
		} else {
			ticketPrice = priceGT60SecondHalf;
		}
		room[(row - 1)][(colm - 1)] = 'B';
		System.out.println("\nTicket Price:\n$" + ticketPrice);

	}
}
