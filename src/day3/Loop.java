package day3;

import java.text.DecimalFormat;

public class Loop {
	public static void doExcercise1() {
		int sum = 0;
		float average;
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println("The sum is: " + sum);
		average = (float) sum / 100;
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		System.out.println("The average is: " + average);
	}

	public static void doExcercise2() {
		int sum = 0;
		int count = 0;
		float average;
		for (int i = 111; i <= 8899; i++) {
			sum = sum + i;
			count++;
		}
		System.out.println("The sum is: " + sum);
		average = (float) sum / count;
		DecimalFormat decimalFormat = new DecimalFormat("#.##"); // làm tròn đến 2 chữ số thập phân
		System.out.println("The average is: " + average);
	}

	public static void doExcercise3() {
		int sum = 0;
		float average;
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1)
				sum = sum + i;
			count++;
		}
		System.out.println("The sum is: " + sum);
		average = (float) sum / count;
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		System.out.println("The average is: " + average);
	}

	public static void doExcercise4() {
		int sum = 0;
		float average;
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0)
				sum = sum + i;
			count++;
		}
		System.out.println("The sum is: " + sum);
		average = (float) sum / count;
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		System.out.println("The average is: " + average);
	}

	public static void doExcercise5() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum = (int) (sum + (Math.pow(i, i)));
		}
		System.out.println("The sum is: " + sum);
	}

	public static void doExcercise6() {
		double sum = 0, sum2 = 0;
		for (int i = 1; i <= 50000; i++) {
			sum = (double) (sum + (1 / i));
		}
		System.out.println("The sum is: " + sum);
		for (int i = 50000; i < 0; i--) {
			sum2 = (double) (sum + (1 / i));
		}
		System.out.println("The sum is: " + sum2);
	}

	public static void print(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
	}

	public static void SquareBoard(String input) {
		String[][] a = new String[5][5];
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(input);
				count++;
				if (count < a[0].length) {
					System.out.print(" ");
				}
			}
			System.out.println();	
		}
	}
	public static void CheckerBoard(String input) {
		String[][] a = new String[7][7];
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			if(i%2==0)
			{
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(input);
				count++;
				if (count < a[0].length) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}else
		{
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(" ");
				count++;
				if (count < a[0].length) {
					System.out.print(input);
				}
			}
			System.out.println();
		}
		}
	}

	public static void timKiemKyTu() {
		String s = "Hello World";
		int pos = s.lastIndexOf("r");
		if (pos > 0 && pos < s.length()) {
			System.out.println("Vi tri cua ky tu r la " + pos);
		} else {
			System.out.println("Khong tim thay");
		}
	}

}
