package com.example;

public class Program10 {
	public void  div(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(i%9==0) {
				count++;
			}
		}
		System.out.println(count);
	}
public static void main(String[] args) {
	Program10 p=new Program10();
	p.div(100);
}
}
