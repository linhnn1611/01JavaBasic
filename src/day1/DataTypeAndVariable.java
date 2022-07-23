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
		Scanner scan=new Scanner(System.in);
		System.out.println("Input distance in meters:");
		int m=scan.nextInt();
		System.out.println("Input hour:");
		int h=scan.nextInt();
		System.out.println("Input minutes:");
		int ph=scan.nextInt();
		System.out.println("Input seconds:");
		int s=scan.nextInt();
		float time=(h*3600)+(ph*60)+s;
		float c= (float)(m/time);
		float a= (float)((m/1000)/(time/3600));
		float b= (float)((m/1609)/(time/3600));
		System.out.println("Your speed in meters/second is:" + c);
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
		System.out.println("Max of two integers:" + Math.max(a,b));
		System.out.println("Min of two integers:" + Math.min(a,b));
	}
	public static void doExcercise42()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Input six non-negative digits:");
		int n=scan.nextInt();
		int a=n/100000;
		int b=(n%100000)/10000;
		int c=(n%10000)/1000;
		int d=(n%1000)/100;
		int e=(n%100)/10;
		int f=n%10;
		System.out.println(a+ " " +b +" " +c+ " " +d+" " +e+" " +f);
	}
	



}
	

