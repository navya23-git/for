package com.example;

public class Program7 {
public void divisible(int num) {
	for(int i=1;i<=100;i++) {
		if(i%4!=0) {
			System.out.println(i);
		}
	}
}
public static void main(String args[]){
	Program7 p=new Program7();
	p.divisible(4);
}
}
