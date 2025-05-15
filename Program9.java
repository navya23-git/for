package com.example;

public class Program9 {
	public void div(int num) {
		for(int i=1;i<=num;i++)
		{
			if(i%4==0) {
				System.out.println(i);
			}
			
			}
		}
public static void main(String args[]) {
	Program9 p=new Program9();
	p.div(50);
}
}
