package com.brevitaz.stage2;



public class Statistics {
	int total,firstHalfRow,secondHalfRow,firstHalfCount,secondHalfCount;
	public void getTotalIncome(int rowSize,int colmSize)
	{
//		System.out.println(rowSize+" "+colmSize);
		total=rowSize*colmSize;
		if(total>0 &&total<60)
		{
			total=rowSize*(colmSize*10);
		}
		else{
			firstHalfRow=rowSize/2;
			secondHalfRow=rowSize-firstHalfRow;

			firstHalfCount = firstHalfRow *(colmSize*10) ;
			secondHalfCount=secondHalfRow*(colmSize*8) ;
			total=firstHalfCount+secondHalfCount;

		}
		System.out.println("\nTotal Income:\n$"+total);

	}


}
