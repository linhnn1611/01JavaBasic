package day5HW;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

import org.openqa.selenium.devtools.v101.systeminfo.SystemInfo;

public class JavaBasic {
	public static void doEx1() {
		System.out.println("*****");
		System.out.println();
		System.out.println("*****");
		System.out.println();
		System.out.println("*****");
		System.out.println();
		System.out.println("*****");
		System.out.println();
		System.out.println("*****");
		System.out.println();
	}

	public static void doEx2() {
		int a = 10;
		float b = (float) 12.5;
		String s = "Java programming";
		System.out.println(a + ", " + b + ", and " + s);
	}

	public static void doEx3() {
		String s = "20";
		int a = Integer.parseInt(s); // convert string s to int a
	}

	public static void doEx4() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Price of laptop:");
		double priceLaptop = scan.nextDouble();
		System.out.print("Price of PC:");
		double pricePC = scan.nextDouble();
		System.out.print("Price of project:");
		double priceProject = scan.nextDouble();
		DecimalFormat formatter = new DecimalFormat("###,###,###");
		double avg = (priceLaptop + pricePC + priceProject) / 3;
		System.out.print("The average price of these three products:" + (formatter.format(avg)) + " VND");
	}

	public static void doEx5() {
		int i = 2000;
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
		String s1 = currencyFormat.format(i);
		System.out.println("Convert to string: " + s1);
	}

	public static void doEx6() {
		String s = "Welcome to Java Basic ";
		String s1 = s.trim().replace(" ", "_");
		System.out.println(s1);
	}

	public static void doEx7() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap chuoi s1: ");
		String s1 = scan.next();
		System.out.println("Nhap chuoi s2: ");
		String s2 = scan.next();
		if (s1.equals(s2)) {
			System.out.println("TC passed");
		} else {
			System.out.println("TC failed");
		}
	}

	public static void doEx8() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Your : ");
		int age = scan.nextInt();
		if (age >= 18) {
			System.out.println("You are eligible to vote");
		} else {
			System.out.println("You are not eligible to vote");
		}
	}

	public static void doEx9() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");
		int a = scan.nextInt();
		if (a % 2 == 0) {
			System.out.println("The number is an even number");
		} else {
			System.out.println("The number is an odd number");
		}
	}

	public static void doEx10() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter quiz: ");
		int q = scan.nextInt();
		while (q < 0 || q > 100) {
			System.out.println("Enter quiz again: ");
		}
		System.out.println("Enter mid-term: ");
		int mt = scan.nextInt();
		while (mt < 0 || mt > 100) {
			System.out.println("Enter mid-term again: ");
		}
		System.out.println("Enter final scores: ");
		int fs = scan.nextInt();
		while (fs < 0 || fs > 100) {
			System.out.println("Enter final scores again: ");
		}
		float avg = (float) ((q + mt + fs) / 3);
		if (avg >= 90) {
			System.out.println("Your grade is A");
		} else if (avg < 90 && avg >= 70) {
			System.out.println("Your grade is B");
		} else if (avg < 70 && avg >= 50) {
			System.out.println("Your grade is C");
		} else {
			System.out.println("Your grade is F");
		}
	}

	public static void doEx11() {
		int price = 25;
		System.out.println("The price: " + price);
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter quantily: ");
		int quantily = scan.nextInt();
		if (quantily < 0) {
			System.out.println("Enter quantily again: ");
		} else if (quantily > 0 && quantily <= 100) {
			// int price =25;
			float revenue = (float) (price * quantily);
			System.out.println("The revenue from sale: " + revenue + "$");
			System.out.println("After discount: 0%");
		} else if (quantily > 100 && quantily <= 120) {
			// int price =25;
			float revenue = (float) (price * quantily * 0.9);
			System.out.println("The revenue from sale: " + revenue + "$");
			System.out.println("After discount: " + (float) (price * quantily * 0.1) + "(10%)");
		} else {
			// int price =25;
			float revenue = (float) (price * quantily * 0.85);
			System.out.println("The revenue from sale: " + revenue + "$");
			System.out.println("After discount: " + (float) (price * quantily * 0.15) + "(15%)");
		}
	}

	public static void doEx12() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter: ");
		String a = scan.next();
		switch (a) {
		case "0":
			System.out.println("The number enter: " + a);
			break;
		case "1":
			System.out.println("The number enter: " + a);
			break;
		case "2":
			System.out.println("The number enter: " + a);
			break;
		case "3":
			System.out.println("The number enter: " + a);
			break;
		case "4":
			System.out.println("The number enter: " + a);
			break;
		case "5":
			System.out.println("The number enter: " + a);
			break;
		case "6":
			System.out.println("The number enter: " + a);
			break;
		case "7":
			System.out.println("The number enter: " + a);
			break;
		case "8":
			System.out.println("The number enter: " + a);
			break;
		case "9":
			System.out.println("The number enter: " + a);
			break;
		default:
			System.out.println("Not allowed");
			break;
		}
	}

	public static void doEx13() {
		Scanner scan = new Scanner(System.in);
		String a = "a. int 1x=10";
		String b = "b. int x=10";
		String c = "c. float x=10.0f";
		String d = "d. string x=\"10\"";
		System.out.println("What is the correct way to declare a variable to store an integer value in Java?");
		System.out.println(a + "\n" + b + "\n" + c + "\n" + d);
		System.out.print("Enter your choice:");
		String ans = scan.next();
		switch (ans) {
		case "a":
			System.out.println("Invalid choice");
			break;
		case "b":
			System.out.println("Congratulation");
			break;
		case "c":
			System.out.println("Invalid choice");
			break;
		case "d":
			System.out.println("Invalid choice");
			break;
		default:
			System.out.println("Bad choice!");
			break;
		}
	}

	public static void doEx14(String input) {
		int i, j;
		for (i = 0; i <= 6; i++) {
			for (j = 6; j >= i; j--)
				System.out.print(input);
			System.out.println("");
		}
	}

	public static void doEx15() {
		int i, j, k;
		for (i = 1; i <= 7; i++) {
			for (j = 1; j < i; j++)
				System.out.print(j);
			for (k = 7 - i; k >= 1; k--)
				System.out.print("*");
			System.out.println("");
		}
	}

	public static void doEx18() {
		Scanner scan = new Scanner(System.in);
		String a = "a. int";
		String b = "b. continue";
		String c = "c. break";
		String d = "d. exit";
		System.out.println("What is the command keyword to exit a loop in Java?");
		System.out.println(a + "\n" + b + "\n" + c + "\n" + d);
		System.out.print("Enter your choice:");
		String ans = scan.next();
		do {
			System.out.println("Incorrect!");
			System.out.println("Again? press y to continue: ");
			ans = scan.next();
		} while (ans == c);
		System.out.println("Correct");
	}

	public static void doEx19() {
		int i = 1, count = 0;
		do {
			System.out.print((char) i);
			i++;
			count++;
			if (count == 10) {
				System.out.println();
				count = 0;
			}
		} while (i <= 122);
	}
}
