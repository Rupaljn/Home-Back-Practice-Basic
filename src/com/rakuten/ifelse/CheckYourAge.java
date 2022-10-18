package com.rakuten.ifelse;

public class CheckYourAge {
public static void main(String[] args) {
	int age = 85;
	if(age<18){
		System.out.println("you are child");
	}
	else if(age>=18 && age<=60){
		System.out.println("you are young");
	}
	else{
		System.out.println("you are old");
	}
}
}
