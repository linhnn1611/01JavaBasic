package day3;

import java.util.Scanner;

public class Array {
		public static void doExcercise1()
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the number of students:");
			int n=scan.nextInt();
			int grades;
			int sum=0;
			for(int i=1; i<=n; i++)
			{
				System.out.println("Enter the grade for student " + i +" :");
				grades=scan.nextInt();
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
		public static void printArray(int[] a)
		{
			if(a.length>0) {
				System.out.print("{");
				for (int i=0; i<a.length; i++)
				{
					System.out.print(a[i]);
					if(i<a.length-1) {
						System.out.print(",");
					}
				}
				System.out.println("}");
			} else
			{
				System.out.println("Mang rong");
			}	
		}
		public static String arrayToString(String[] b)
		{
			if(b.length>0) {
				System.out.print("{");
				for (int i=0; i<b.length; i++)
				{
					System.out.print(b[i]);
					if(i<b.length-1) {
						System.out.print(",");
					}
				}
				System.out.println("}");
				System.out.print("Mang co " + b.length + " phan tu");
			} else
			{
				System.out.println("Mang rong");
			}
			return null;	
		}

}
