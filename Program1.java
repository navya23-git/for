package com.example;

public class Program1 {
 public static void main(String args[]) {
	 System.out.print("Number between 1 and 100 that are divisible by both 3 and 5:");
	 for(int i=1;i<=100;i++) {
		 if(i%3==0 && i%5==0) {
			 System.out.print(i+" ");
		 }
		 
	 }
	 
 }
}
