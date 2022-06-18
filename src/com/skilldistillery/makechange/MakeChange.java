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
			System.out.println("Enter the customers payment.");
			payment = scanner.nextDouble();

			price = price * 100;
			payment = payment * 100;
			change = payment - price;
				System.out.println("\nResult: ");

				if (change / 2000 >= 1) {
					double twenties = change / 2000;
					System.out.print((int) twenties + " twenty dollar bill(s) ");
					total = total + twenties;
				} if (change / 1000 >= 1) {
					change = change % 2000;
					double tens = change / 1000;
					System.out.print((int) tens + " ten dollar bill(s) ");
					total = total + tens;
				} if (change / 500 >= 1) {
					change = change % 1000;
					double fives = change / 500;
					System.out.print((int) fives + " five dollar bill(s) ");
				} if (change / 100 >= 1) {
					change = change % 500;
					double ones = change / 100;
					System.out.print((int) ones + " one dollar bill(s) ");
				} if (change / 25 >= 1) {
					change = change % 100;
					double quarters = change / 25;
					System.out.print((int) quarters + " quarter(s) ");
				} if (change / 10 >= 1) {
					change = change % 25;
					double dimes = change / 10;
					System.out.print((int) dimes + " dime(s) ");
				} if (change / 5 >= 1) {
					change = change % 10;
					double nickles = change / 5;
					System.out.print((int) nickles + " nickle(s) ");
				} if (change / 1 >= 1) {
					change = change % 5;
					double pennies = change / 1;
					System.out.print((int) pennies + " penny/pennies ");
				} if (price == payment) {
					System.out.println("Nothing, thank you for giving exact change!");
				} else if (payment < price){
					System.out.println("The customer has not paid enough.");
				}
		} // register on
	}

}
