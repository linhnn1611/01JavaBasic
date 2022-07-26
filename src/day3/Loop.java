package day3;

import java.text.DecimalFormat;

public class Loop {
	public static void doExcercise1() {
		int sum=0;
		float average;
		for (int i=1; i<=100; i++)
		{
			sum =sum+i;
		}
		System.out.println("The sum is: "+sum);
		average=(float)sum/100;
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		System.out.println("The average is: "+average);
	}
	public static void doExcercise2() {
		int sum=0;
		int count=0;
		float average;
		for (int i=111; i<=8899; i++)
		{
			sum =sum+i;
			count ++;
		}
		System.out.println("The sum is: "+sum);
		average=(float)sum/count;
		DecimalFormat decimalFormat = new DecimalFormat("#.##"); //làm tròn đến 2 chữ số thập phân
		System.out.println("The average is: " +average);
	}
	public static void doExcercise3() {
		int sum=0;
		float average;
		int count=0;
		for (int i=1; i<=100; i++)
		{
			if(i%2==1)
			sum =sum+i;
			count ++;
		}
		System.out.println("The sum is: "+sum);
		average=(float)sum/count;
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		System.out.println("The average is: "+average);
	}
	public static void doExcercise4() {
		int sum=0;
		float average;
		int count =0;
		for (int i=1; i<=100; i++)
		{
			if(i%7==0)
			sum =sum+i;
			count ++;
		}
		System.out.println("The sum is: "+sum);
		average=(float)sum/count;
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		System.out.println("The average is: "+average);
	}
}
