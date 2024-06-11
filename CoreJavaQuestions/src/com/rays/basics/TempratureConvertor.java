package com.rays.basics;

import java.util.Scanner;

public class TempratureConvertor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose the conversion type");
		System.out.println("1. celsius To Fahrenheit");
		System.out.println("2. fahrenheit To Celsius");
		System.out.println("choose 1 or 2");
		int c = sc.nextInt();

		double temprature;
		double covertedTemprature;

		if (c == 1) {
			System.out.println("Enter the temprature");
			double celcuis = sc.nextDouble();
			covertedTemprature = celsiusToFahrenheit(celcuis);
			System.out.println(covertedTemprature);

		} else if (c == 2) {
			System.out.println("Enter the temprature");
			double fahrenheit = sc.nextDouble();
			covertedTemprature = fahrenheitToCelsius(fahrenheit);
			System.out.println(covertedTemprature);

		} else {

		}

	}

	public static double celsiusToFahrenheit(double celcuis) {
		return (celcuis * 9 / 5) + 32;
	}

	public static double fahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit - 32) * 5 / 9;
	}
}
