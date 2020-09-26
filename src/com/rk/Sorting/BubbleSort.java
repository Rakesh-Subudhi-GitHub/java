package com.rk.Sorting;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		
		//read inputs
		int[] a;
		Scanner sc=null;
		int range=0;
		int temp;
		
		System.out.println("Enter elements Range for Sorting  :: ");
		sc= new Scanner(System.in);
		range=sc.nextInt();
		a= new int[range];
		boolean flag=true;
		
		//read the elements
		System.out.println("enter the elements fast:: ");
		for(int i=0;i<range;i++)
		{
			a[i]=sc.nextInt();
			
		}//for

		//main logic
		for(int i=0;i<a.length;i++)// for round take and round is(n-1) 
		{
			
			//Compare all elements 
			//for each round check all elements
			for(int j=0;j<a.length-1-i;j++)  // if round complete then last elements is shorted so take (-i)  
			{
				//swap the elements
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=false;
				}//if
			}//for
			
			if(flag) //if all elements are sorted then break it and show result
			{
				break;
			}
			
		}//for
		
		System.out.println("Sorting for elemets using  BubbleSorting and list is::::: ");
		for(int sort:a)
		{
			System.out.println(sort);
		}
		sc.close();
	}//main

}//class
