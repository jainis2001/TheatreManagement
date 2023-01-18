package com.brevitaz.stage1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TheatreManagement {
	int hall[][];
	int rowSize,colmSize,row,colm;

	public int[][] getHall() {
		return hall;
	}

	public void createHall() {
		Scanner scanner=new Scanner(System.in);
		try{
			System.out.println("Enter the number of rows:");
			rowSize=scanner.nextInt();
			System.out.println("Enter the number of seats in each row:");
			colmSize=scanner.nextInt();

			hall = new int[(rowSize + 1)][(colmSize + 1)];
			if((rowSize<=0 || rowSize>9) || (colmSize<=0 || colmSize >9) ){
				System.err.println("row or seats range must between 1 to 9..");
				createHall();

			}
			else {
				for (row = 0; row < rowSize + 1; row++) {
					for (colm = 0; colm < (colmSize + 1); colm++) {
						if (row == 0) {
							int temp = (colm == 0) ? ' ' : colm;
							hall[row][colm] = temp;
						} else if (colm == 0) {
							hall[row][colm] = row;
						} else {
							hall[row][colm] = 'S';
						}
					}
				}
			}



		}
		catch(InputMismatchException e)
		{
			System.err.println("Only Integer input allowed");
			createHall();
		}
		catch (Exception e)
		{
			System.out.println("Wrong Input:");
			createHall();
		}
	}
	public void showHall()
	{
		System.out.println("cinema:");
		for (row=0;row<rowSize+1;row++)
		{
			for (colm=0;colm<colmSize+1;colm++)
			{
				if(row==0)
				{
					System.out.print((colm==0)?(char)hall[row][colm] + " ":hall[row][colm] + " ");
				}
				else if(colm==0)
				{
					System.out.print(hall[row][colm] + " ");
				}
				else {
					System.out.print((char) hall[row][colm] + " ");
				}
			}
			System.out.println();
		}
	}
}
