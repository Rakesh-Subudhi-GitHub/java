package com.rk.array;

public class Array_3D {

	public static void main(String[] args) {
		
		//read inputs
		int[][][]a;
		
		System.out.println("2D array show::::::");

		a= new int[2][2][3];
		a[0][0][0]=10;
		a[0][0][1]=15;
		a[0][0][2]=20;
		
		a[0][1][0]=25;
		a[0][1][1]=30;
		a[0][1][2]=35;
		
		a[1][0][0]=40;
		a[1][0][1]=45;
		a[1][0][2]=50;
		
		a[1][1][0]=55;
		a[1][1][1]=60;
		a[1][1][2]=65;
		
	
	//show 
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=0;j<a[i].length;j++)
			{
				for(int k=0;k<a[i][j].length;k++)
				{
	
					System.out.print(a[i][j][k]+" ");
			
				}//for
				System.out.println();
			}//for
		}//for
		
	}//main

}//class
