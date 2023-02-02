package com.brevitaz.Theatre;

//import static com.brevitaz.Theatre.Main.theatre;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	private int choice;
	private final Book book = new Book();

	Statistics stat = new Statistics();

	//menu() will allow you to take choice and get output according...
	public void menu(Theatre theatre) {
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
						book.bookTicket(theatre);
						break;
					case 3:
						stat.getStatisticDetailsOfRoom(theatre);
						break;
					default:
						System.err.println((choice != 0) ? "Invalid choice" : "");
				}
			} catch (InputMismatchException i) {
				System.err.println("Something Went Wrong!");
				scanner.reset();
				menu(theatre);
			}

		} while (choice != 0);

	}
}
