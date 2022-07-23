package day1;

import java.util.Scanner;

public class DecisionMaking {
	public static void doExcercise3()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Nhap n:");
		int n=scan.nextInt();
		if(n%2==0) {
			System.out.println(n+ " là số chẵn");
		}
	}
	public static void doExcercise4()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Nhap n:");
		int n=scan.nextInt();
		if(n%2==0) {
			System.out.println(n+ " là số chẵn");
		} else {
			System.out.println(n+ " la so le");
		}
	}
	public static void doExcercise5()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Nhap n:");
		int n=scan.nextInt();
		if ((n<2) || (n>8)) {
			System.out.println("Nhap sai");
		} else if ((n>=2)&& (n<=6)) {
			System.out.println("thu" +n);
		}else if (n==7) {
			System.out.println("Ngay nghi");
		}else {
			System.out.println("Ngay le");
		}
	}
	public static void doExcercise1a(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Nhap n:");
		int n=scan.nextInt();
		if ((n<0)||(n>1000)) {
			System.out.println("Nhap lai n");
		} else {
			String s=String.valueOf(n);
			int n1 = Integer.parseInt(s.substring(0));
			int n2 = Integer.parseInt(s.substring(1));
			int n3 = Integer.parseInt(s.substring(2));
			int n4 = Integer.parseInt(s.substring(3));
			System.out.println("The sum of " + n +"is " + (n1+n2+n3+n4));
		}
	}
	public static void doExcercise1b()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Input an integer between 0 and 1000:");
		int n=scan.nextInt();
		if ((n<0)||(n>1000)) {
			System.out.println("Nhap lai n");
		} else {
			int n1=n%10;
			int number=n/10;
			int n2=number%10;
			number=number/10;
			int n3=number%10;
			number=number/10;
			int n4=number%10;
			System.out.println("The sum of " + n + " is " + (n1+n2+n3+n4));
		}
	}
	public static void doExcercise2()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Input the number of minutes:");
		int n=scan.nextInt();
		int years=n/(60*24*365);
		int n1=n%(60*24*365);
		int days=n/(60*24);
		System.out.println(n + " minutes is approximately " + years + " years " + days + " days ");
		
	}

}
