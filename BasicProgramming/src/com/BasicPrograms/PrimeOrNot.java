package com.BasicPrograms;

import java.util.Scanner;

public class PrimeOrNot {
	
	public static String  check(int n) {
		if(n<=1) {
			return "Given number is not Prime Number.";
		}
		
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return "Given number is not Prime Number.";
			}
		}
		
		return "Given number is Prime Number.";
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println(check(n));

	}

}
