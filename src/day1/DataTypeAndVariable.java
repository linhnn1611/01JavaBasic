package day1;

import java.util.Scanner;

public class DataTypeAndVariable {
	public static void doExcercise()
	{
		System.out.print("Hello ");
	}
	public static void doExcercise2()
	{
		System.out.print("++++");
		System.out.println();
		System.out.print("@@@@");
		System.out.println();
		System.out.print("****");
		System.out.println();
		System.out.print("####");
	}
	public static void doExcercise21()
	{
		System.out.print("++++" + "\n\n" + "@@@@" + "\n\n" + "****" + "\n\n" + "####");

	}
	public static void doExcercise3()
	{
		int a=10;
		float b=20.3f, c=3.14785f;
		System.out.println("a=" + a + "\n" + "b=" + b + "\n" + "c=" + c);
		
	}
	public static void doExcercise4()
	{
		boolean a=false;
		if (a==true) {
			System.out.println("True");
		} else
		{
			System.out.println("False");
		}
	} 
	public static void doExcercise6()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap nhiet do F: ");
		float a = sc.nextFloat();
		float b = a/2.12f;
		System.out.println("Nhiets do C la: " + b);
		
	}
	public static void doExcercise7()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so inch: ");
		double a = sc.nextDouble();
		double b = a*0.0254;
		System.out.println("So met la: " + b);
		
	}
	public static void doExcercise22()
	{
		int m=2500, h=5, ph=56, s=23;
		float time=h*3600+ph*60+s;
		double a=(m/1000/time/3600);
		double b=(m/1609/time/3600);
		System.out.println("Your speed in meters/second is:" + (m/time));
		System.out.println("Your speed in km/h is:" + a);
		System.out.println("Your speed in miles/h is:" + b);
	}
	public static void doExcercise32()
	{
		int a=25, b=5;
		System.out.println("Sum of two integers:" +(a+b));
		System.out.println("Difference of two integers" + Math.subtractExact(a,b));
		System.out.println("Product of two integers:" + (a*b));
		System.out.println("Average of two integers:"+ ((a+b)/2));
		System.out.println("Distance of two integers:" + Math.abs(a-b));
		System.out.println("Distance of two integers:" + Math.max(a,b));
		System.out.println("Distance of two integers:" + Math.min(a,b));
	}
	
	



}
	

