package com.rk.array;

public class Array_2D_Jagged_Array {

	public static void main(String[] args) {
		
		//read inputs
		int[][]a;
		
		System.out.println("2D array show::::::");

		a= new int[2][];
		a[0]=new int[3];
		a[0][0]=10;
		a[0][1]=20;
		a[0][2]=30;
		
		a[1]=new int[2];
		a[1][0]=40;
		a[1][1]=50;
		//a[1][2]=60;
	
	//show 
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}//main

}//class
