package com.example;

public class Program6 {
public void mul(int num) {
	for(int i=10;i>=1;i--) {
	System.out.println(num+"x"+i+"="+(num*i));
}}
	public static void main(String[] args) {
		Program6 p=new Program6();
		p.mul(6);
	}
}
