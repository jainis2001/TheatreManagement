package com.brevitaz.Theatre;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	private int choice;
	private final BookSeat book = new BookSeat();
	private final TheatreManagement theatre = new TheatreManagement();
	private boolean isFirstCall = true;

	//menu() will allow you to take choice and get output according...
	public void menu() {
		Scanner scanner = new Scanner(System.in);
		if (isFirstCall) {
			theatre.initRoom();
		}

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
						book.initSeats(theatre.getRoom());
						break;
					case 3:
						Statistics stat = new Statistics();
						stat.getStatisticDetails(theatre.getRoom());
						break;
					case 0:
						break;
					default:
						System.out.println("Invalid choice:");
				}
			} catch (InputMismatchException i) {
				System.err.println("Something Went Wrong!");
				isFirstCall = false;
				scanner.reset();
				menu();
			}

		} while (choice != 0);

	}
}
