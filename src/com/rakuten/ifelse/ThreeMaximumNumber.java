package com.rakuten.ifelse;

public class ThreeMaximumNumber {
public static void main(String[] args) {
	int num1 = 85;
	int num2 = 67;
	int num3 = 105;
	if(num1>num2 && num1>num3){
		System.out.println("num1 is maximum number");
	}
	else if(num2>num1 && num2>num3){
		System.out.println("num2 is maximum number");
	}
	else{
		System.out.println("num3 is maximum number");
	}
}
}
