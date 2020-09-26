package com.rk.array;

import java.util.Scanner;

public class Array_Test {

	
	public static void main(String[] args) {
		
		//read inputs
		int []a;
		int num=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the limit:::");
		num=sc.nextInt();
		
		
		a= new int[num+1];
		System.out.println(a.length);
		for(int i=0;i<a.length;i++)
		{
			a[i]=i;
			
		}//for
		System.out.println("array size is::: "+a.length);
		for(int x:a)
		{
			System.out.println("count:: "+x);
		}
	}//main
}//class
