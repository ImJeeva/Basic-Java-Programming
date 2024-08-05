package com.BasicPrograms;

import java.util.Scanner;

public class PrimeNumbers {
	
	public static boolean check(int x) {
		if(x<=1) {
			return false;
		}
		for(int i=2;i<=x/2;i++) {
			if(x%i==0) {
				return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		int y=scan.nextInt();
		
		//Finding which variable has min and max value.
		int min=x<y?x:y;
		int max=x>y?x:y;
		
		for(int i=min;i<=max;i++) {
			if(check(i)) {
				System.out.println(i);
			}
		}
		
		
		
		

	}

}
