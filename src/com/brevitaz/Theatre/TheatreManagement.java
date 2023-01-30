package com.brevitaz.Theatre;

import java.util.Scanner;
public class TheatreManagement {
	private char[][] room;
	private int rowSize,colmSize,row,colm;
	private Scanner scanner;

	public char[][] getRoom() {
		return room;
	}

	//initRoom() will create cinema hall according the user input
	public char[][] createRoom() {
		scanner = new Scanner(System.in);
		try {
			System.out.println("Enter the number of rows:");
			rowSize = scanner.nextInt();
			if (rowSize < 1 || rowSize > 9) {
				System.err.println("rows range must between 1 to 9..");
				scanner.reset();
				createRoom();
			} else {
				while (true) {
					scanner = new Scanner(System.in);
					try {
						System.out.println("Enter the number of seats in each row:");
						colmSize = scanner.nextInt();
						if (colmSize < 1 || colmSize > 9) {
							System.err.println("seats range must between 1 to 9..");
						} else {
							break;
						}
					} catch (Exception e) {
						System.err.println("Only 1 to 9 input will be allowed");
						scanner.reset();
					}

				}
				room = new char[rowSize][colmSize];
				for (row = 0; row < rowSize; row++) {
					for (colm = 0; colm < colmSize; colm++) {
						room[row][colm] = 'S';
					}
				}
			}
		}
		catch (Exception e) {
			System.err.println("Only 1 to 9 input will be allowed");
			scanner.reset();
			createRoom();
		}
		return room;
	}
	// dispRoom() will display the cinema hall
	public void dispRoom()
	{
		System.out.println("cinema:");
		System.out.print("  ");
		for(row=0;row<colmSize;row++) {
			System.out.print((row+1)+" ");
		}
		System.out.println();
		for (row=0;row<rowSize;row++) {
			System.out.print((row+1)+" ");
			for (colm=0;colm<colmSize;colm++) {
				System.out.print(room[row][colm]+" ");
			}
			System.out.println();
		}
	}
}
