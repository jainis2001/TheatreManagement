package com.brevitaz.Theatre;

import static com.brevitaz.Theatre.Main.theatre;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	private int choice;
	private final BookSeat book = new BookSeat();

	Statistics stat = new Statistics();

	//menu() will allow you to take choice and get output according...
	public void menu(char[][] room) {
		Scanner scanner = new Scanner(System.in);

		do {
			try {
				System.out.println("1. Show the seats");
				System.out.println("2. Buy a ticket");
				System.out.println("3. Statistic");
				System.out.println("0. Exit");
				System.out.println("Enter Choice:");
				choice = scanner.nextInt();
				switch (choice) {
					case 1:
						theatre.dispRoom();
						break;
					case 2:
//						book.getInput(room.length,room[0].length);
						book.bookTicket(room);
						break;
					case 3:
						stat.getStatisticDetailsOfRoom(room);
						break;
					default:
						System.err.println((choice != 0) ? "Invalid choice" : "");
				}
			} catch (InputMismatchException i) {
				System.err.println("Something Went Wrong!");
				scanner.reset();
				menu(room);
			}

		} while (choice != 0);

	}
}
