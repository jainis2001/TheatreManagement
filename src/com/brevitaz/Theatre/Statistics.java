package com.brevitaz.Theatre;


public class Statistics {
	char[][] tempSeats;
	private int firstHalfRow;
	private int rowCount;
	private int colmCount;
	private int currentIncome;
	private int numOfTickets;
	private int totalRoomSeats;
	private  float percentage;

	//getStatisticDetails(char[][] seats) will call the all separates functions which performs separate activity's
	// ex: count number of purchased tickets,percentage,income

	public void getStatisticDetails(char[][] seats)
	{
		tempSeats=seats;
		rowCount=seats.length;
		colmCount= seats[0].length;
		firstHalfRow=rowCount/2;
		totalRoomSeats=rowCount*colmCount;

		getNumOfSoldTickets();
		getCurrentIncome();
		getTotalIncome();
	}

	//getTotalIncome() will count the total income of the particular created hall
	public void getTotalIncome()
	{
		int totalIncome;
		if (totalRoomSeats > 0 && totalRoomSeats < 60) {
				totalIncome = rowCount * (colmCount * 10);
			} else {
				firstHalfRow = rowCount / 2;
			int secondHalfRow = rowCount - firstHalfRow;
			int firstHalfCount = firstHalfRow * (colmCount * 10);
			int secondHalfCount = secondHalfRow * (colmCount * 8);
				totalIncome = firstHalfCount + secondHalfCount;
			}

		System.out.println("Total Income: $" + totalIncome +"\n");
	}

	//getNumOfSoldTickets() will count the total booked seats and booked seat's average
	public void getNumOfSoldTickets(){
		for (int row=0;row<rowCount;row++) {
			for (int colm=0;colm<colmCount;colm++) {
				if(tempSeats[row][colm]=='B'){
					numOfTickets++;
				}
			}
		}
		percentage=((float)numOfTickets*100)/totalRoomSeats;

		System.out.println("Number of purchased tickets $" + numOfTickets);
		System.out.printf("Percentage :%.2f", percentage);
		System.out.println("%");

	}

	//getCurrentIncome() will count the total earned income after booked seats
	public void getCurrentIncome(){
		int priceLS60 = 10;
		int priceGT60FirstHalf = 10;
		int priceGT60SecondHalf = 8;
		for (int row=0;row<rowCount;row++) {
			for (int colm=0;colm<colmCount;colm++) {
				if(tempSeats[row][colm]=='B'){
					if (totalRoomSeats > 0 && totalRoomSeats < 60) {
						currentIncome+= priceLS60;
					} else {
						currentIncome += (row <= firstHalfRow) ? priceGT60FirstHalf : priceGT60SecondHalf;
					}
				}
			}
		}
		percentage=((float)numOfTickets*100)/totalRoomSeats;
		System.out.println("Current Income: $" + currentIncome);

	}

}
