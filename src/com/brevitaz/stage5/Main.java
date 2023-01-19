package com.brevitaz.stage5;

import com.brevitaz.stage1.TheatreManagement;
import com.brevitaz.stage3.BookSeat;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {


		int choice=0,tempRowSize=0,tempColmSize=0;
		Scanner scanner = new Scanner(System.in);
		TheatreManagement theatre=new TheatreManagement();
		theatre.createHall();



		while(true){

			System.out.println("1. Show the seats");
			System.out.println("2. Buy a ticket");
			System.out.println("3. Statistic");
			System.out.println("0. Exit");
			System.out.println("Enter Choice:");
			choice=scanner.nextInt();

			switch (choice) {

				case 1:
					theatre.showHall();
					break;
				case 2:
					BookSeat book=new BookSeat();
					book.getBooked(theatre.getHall());
					break;
				case 3:
//					Statistic _stat=new Statistic();
//					_stat.getStatisticDetails(_book);
					break;
				case 0:
					System.exit(0);

				default:
					System.out.println("Invalid choice:");

			}
		}

	}

}
