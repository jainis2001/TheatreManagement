package com.brevitaz.stage4;

import com.brevitaz.stage1.TheatreManagement;
import com.brevitaz.stage3.BookSeat;

import java.util.Scanner;

public class Main {

	private Scanner scanner=new Scanner(System.in);
	private TheatreManagement theatre=new TheatreManagement();
	private boolean trigger=true;
	void menu(){
		//comment
		int choice=0;
		scanner=new Scanner(System.in);
		if(trigger)
			theatre.createHall();
		while(true){
			try{
				System.out.println("\n1. Show the seats");
				System.out.println("2. Buy a ticket");
				System.out.println("0. Exit");
				System.out.print("Enter choice: ");
				choice=scanner.nextInt();

				switch(choice){
					case 1:
						theatre.showHall();
						break;
					case 2:
						BookSeat book=new BookSeat();
						book.getBooked(theatre.getHall());
						break;
					case 0:
						System.exit(0);
					default:
						System.out.println("Invalid choice");
				}
			}
			catch (Exception e){
				System.out.println("Something Went Wrong");
				scanner.reset();
				trigger=false;
				menu();
			}
		}
	}
	public static void main(String[] args) {

		Main main=new Main();
		main.menu();
	}
}
