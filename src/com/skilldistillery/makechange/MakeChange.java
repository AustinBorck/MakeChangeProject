package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double price = 0;
		double payment = 0;
		double change = 0;
		boolean registerOn = true;
		double total = 0;
		while (registerOn) {
			System.out.println("Enter total price.");
			price = scanner.nextDouble();
			scanner.nextLine();
			System.out.println("Enter the customers payment.");
			payment = scanner.nextDouble();
			scanner.nextLine();
			price = price * 100;
			payment = payment * 100;
			change = payment - price;
				System.out.println("Result: ");

				if ((change / 2000) >= 1) {
					double twenties = change / 2000;
					System.out.println((int) twenties + " twenty dollar bill(s) ");
					change = change % 2000;
				} if ((change / 1000) >= 1) {
					double tens = change / 1000;
					System.out.println((int) tens + " ten dollar bill(s) ");
					change = change % 1000;
				} if ((change / 500) >= 1) {
					double fives = change / 500;
					System.out.println((int) fives + " five dollar bill(s) ");
					change = change % 500;
				} if ((change / 100) >= 1) {
					double ones = change / 100;
					System.out.println((int) ones + " one dollar bill(s) ");
					change = change % 100;
				} if ((change / 25) >= 1) {
					double quarters = change / 25;
					System.out.println((int) quarters + " quarter(s) ");
					change = change % 25;
				} if ((change / 10) >= 1) {
					double dimes = change / 10;
					System.out.println((int) dimes + " dime(s) ");
					change = change % 10;
				} if ((change / 5) >= 1) {
					double nickles = change / 5;
					System.out.println((int) nickles + " nickle(s) ");
					change = change % 5;
				} if ((change / 1) >= 1) {
					double pennies = change / 1;
					System.out.println((int) pennies + " penny/pennies ");
				} if (price == payment) {
					System.out.println("Nothing, thank you for giving exact change!");
				} else if (payment < price){
					System.out.println("The customer has not paid enough.");
				}
		} // register on
		scanner.close();
	}

}
