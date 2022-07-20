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
		boolean a=true;
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
		System.out.println("Nhiet do C la: " + b);
		
	}
	public static void doExcercise7()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so inch: ");
		double a = sc.nextDouble();
		double b = a*0.0254;
		System.out.println("So met la: " + b);
		
	}
	
	

}
	

