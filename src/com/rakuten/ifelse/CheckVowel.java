package com.rakuten.ifelse;

public class CheckVowel {
public static void main(String[] args) {
	char alpha = 'a';
	if((alpha>='a' && alpha<='z')||(alpha>='A' && alpha<='Z')){
		System.out.println("charater is alphabet");
	}
	else{
		System.out.println("charater is not alphabet");
	}
}
}
