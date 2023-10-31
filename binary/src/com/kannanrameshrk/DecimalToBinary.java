package com.kannanrameshrk;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter decimal value:");
		int n = input.nextInt();
		
		String binaryVal ="";
		
		while(n > 0) {
			int remain=0;
			remain = n%2;
			binaryVal = remain + binaryVal;
			n=n/2;
		}
		
		System.out.println(binaryVal);
	}

}
