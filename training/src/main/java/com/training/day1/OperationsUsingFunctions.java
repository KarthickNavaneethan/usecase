package com.training.day1;

import java.util.Scanner;

public class OperationsUsingFunctions {
	public static void main(String[] args) {
//		int num1, num2, num3;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the first number:");
//		num1=sc.nextInt();
//		
//		System.out.println("Enter the second number:");
//		num2=sc.nextInt();
//		sc.close();
//		num3=num1+num2;
//		System.out.println("The sum of two numbers is:" +num3);
//	
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("first number is:");
		a=sc.nextInt();
		System.out.println("second number is:");
		b=sc.nextInt();
		sc.close();
		c= calc(a,b);
		System.out.println("Addition of two numbers is:" +c);
		
	}
	public static int calc(int x, int y) {
		int result=x+y;
		return result;
	}

	}


