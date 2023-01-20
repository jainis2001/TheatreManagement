package com.brevitaz.Theatre;

import java.util.InputMismatchException;
import java.util.Scanner;
public class TheatreManagement {
	private char[][] room;
	private int rowSize,colmSize,row,colm;
	public char[][] getRoom() {
		return room;
	}

	//initRoom() will create cinema hall according the user input
	public void initRoom() {
		Scanner scanner=new Scanner(System.in);
		try{
			System.out.println("Enter the number of rows:");
			rowSize=scanner.nextInt();
			System.out.println("Enter the number of seats in each row:");
			colmSize=scanner.nextInt();

			room = new char[rowSize][colmSize];
			if(rowSize == 0 || rowSize>9 || colmSize == 0 || colmSize >9 ){
				System.err.println("row or seats range must between 1 to 9..");
				initRoom();

			}
			else {
				for (row = 0; row < rowSize ; row++) {
					for (colm = 0; colm <colmSize; colm++) {
						room[row][colm] = 'S';
					}
				}
			}
		}
		catch(InputMismatchException e)
		{
			System.err.println("Only Integer input allowed");
			initRoom();
		}
		catch (Exception e)
		{
			System.out.println("Wrong Input:");
			initRoom();
		}
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
