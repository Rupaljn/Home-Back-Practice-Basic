package com.rakuten.loop;

public class EvenNumber {
public static void main(String[] args) {
	int num = 1;
	while(num<=25){
		if(num%2==0){
			System.out.println(num);
		}
		num = num+1;
	}
}
}
