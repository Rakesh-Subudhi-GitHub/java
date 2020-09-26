package com.rk.array;

public class Anonymous_Array {

	static int total=0;
		
		public Anonymous_Array(int []arry)
		{
			System.out.println("param constructor::::::");
			for(int sum:arry)
			{
				total=total+sum;
			}
			//return total;
		}
		
		public int sum(int []arry)
		{
			for(int sum:arry)
			{
				total=total+sum;
			}
			return total;
		
	}//method
	
	public static void main(String[] args) {
		
	new Anonymous_Array(new int[] {10,20,30});//this is called anonymous array also calling constructor
	
	//ano.sum(new int[] {10,20,30});//this is called anonymous array there are no name is taken
    
	System.out.println("total is::"+total);
	}//main

}//class
