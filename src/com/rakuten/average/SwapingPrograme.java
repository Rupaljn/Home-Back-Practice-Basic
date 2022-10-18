
package com.rakuten.average;

public class SwapingPrograme {
public static void main(String[] args) {
	int num1 = 45;
	int num2 = 55;
	System.out.println("num1 = " +  num1);
	System.out.println("num2 = " +  num2);
	int num3 = num1;
	num1 = num2;
	num2 = num3;
	System.out.println("num1 = " + num1);
	System.out.println("num2 = " + num2);
}
}
