package com.example;

public class Program2 {
public void mul(int num) {
  for(int i=1;i<=10;i++) {
	 System.out.print(num*i+" "); 
  }
}
public static void main(String[] args) {
	Program2 p=new Program2();
	p.mul(7);
}
}
