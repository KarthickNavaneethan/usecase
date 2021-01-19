package com.training.day1;

public class Factorial {
public static void main(String[] args) {
	int a=8;
	System.out.println(factorial(a));
}

static int factorial(int a) {
	if(a==0) 
		return 1;
	
	return a*factorial(a-1);
}

}
