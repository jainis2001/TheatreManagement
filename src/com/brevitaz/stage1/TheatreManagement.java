package com.brevitaz.stage1;

public class TheatreManagement {
	int hall[][];

	int rowSize,colmSize,row,colm;

	public void createHall() {
		rowSize=7;
		colmSize=8;

		hall = new int[(rowSize + 1)][(colmSize + 1)];

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
