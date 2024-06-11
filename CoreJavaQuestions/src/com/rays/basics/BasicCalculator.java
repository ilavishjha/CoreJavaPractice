package com.rays.basics;

import java.util.Scanner;

public class BasicCalculator {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Number");
		int a=sc.nextInt();
		System.out.println("Enter the second Number");
		int b=sc.nextInt();
		
		int add=a+b;
		int subtract;
		if (a>b) {
			 subtract=a-b;
		}else {
			 subtract =b-a;
		}
		int multiply=a*b;
		
		int divide;
		if (a>b) {
			 divide=a/b;
		}else {
	 divide =b/a;
		}
		
		System.out.println(add);

		System.out.println(subtract);

		System.out.println(multiply);

		System.out.println(divide);
	}

}
