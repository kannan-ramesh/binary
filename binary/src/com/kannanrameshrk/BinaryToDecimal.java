package com.kannanrameshrk;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the binary digit:");
		
		int n = input.nextInt();
		
		int temp = n;
		int decimalNum = 0;
		int base =1;
		while(temp > 0) {
			int lastDigit = temp % 10;
			temp /=10;
			
			decimalNum+=lastDigit*base;
			base = base*2;
		}
		
		System.out.println(decimalNum);
		
	}

}
