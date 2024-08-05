package com.BasicPrograms;

import java.util.Scanner;

public class HCF {
	static int  check(int x,int y) {
		int min=Integer.MIN_VALUE;
		min=x<y?x:y;
		
		for(int i=min;i>=1;i--) {
			if(x%i==0 && y%i==0) {
				return i;
			}
		}
		return -1;
		
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		int y=scan.nextInt();
		
		System.out.println(check(x,y));

	}

}
