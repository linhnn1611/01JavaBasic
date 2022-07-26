package day3;

import java.util.Scanner;

public class Array {
		public static void doExcercise1()
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the number of students:");
			int n=scan.nextInt();
			int sum=0;
			for(int i=1; i<=n; i++)
			{
				System.out.println("Enter the grade for student " + i +" :");
				int grades=scan.nextInt();
				sum += grades;
				if (grades>100 || grades<0) {
					System.out.println("Invalid grade, try again");
					break;
				}
			}
			float average = sum/n;
			System.out.println("The number of students: " +n);
			System.out.println("The average is " + average);
		}
		public static void doExcercise2()
		{}

}
