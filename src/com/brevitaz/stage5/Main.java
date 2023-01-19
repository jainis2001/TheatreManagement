package com.brevitaz.stage5;

import com.brevitaz.stage1.TheatreManagement;
import com.brevitaz.stage2.Statistics;
import com.brevitaz.stage3.BookSeat;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	int choice=0,tempRowSize=0,tempColmSize=0;

	private static BookSeat book=new BookSeat();
	private static Statistics stat=new Statistics();
	private Scanner scanner =null;
	private TheatreManagement theatre=new TheatreManagement();
	private boolean isFirstCall=true;
	public void menu() {
		scanner=new Scanner(System.in);
		if(isFirstCall)
			theatre.createHall();
		while(true){
			try{
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
						book.getBooked(theatre.getHall());
						break;
					case 3:
						Statistics stat=new Statistics();
//					stat.getStatistics();
						stat.getStatisticDetails(book, theatre.getHall());
						break;

					case 0:
						System.exit(0);
					default:
						System.out.println("Invalid choice:");
				}
			}
			catch (InputMismatchException i){
				System.err.println("Somthing Went Wrong!");
				isFirstCall=false;
				menu();
			}

		}

	}

	public static void main(String[] args) {
		new Main().menu();
	}


}
