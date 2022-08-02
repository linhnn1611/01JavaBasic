package day5HW;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

import org.openqa.selenium.devtools.v101.systeminfo.SystemInfo;

public class JavaBasic {
	public static void doEx1()
	{
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
	public static void doEx2()
	{
		int a=10;
		float b= (float) 12.5;
		String s="Java programming";
		System.out.println(a+", "+b+", and "+s);
	}
	public static void doEx3()
	{
		String s="20";
		int a=Integer.parseInt(s); //convert string s to int a
	}
	public static void doEx4()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Price of laptop:");
		double priceLaptop=scan.nextDouble();
		System.out.print("Price of PC:");
		double pricePC=scan.nextDouble();
		System.out.print("Price of project:");
		double priceProject=scan.nextDouble();
		DecimalFormat formatter= new DecimalFormat("###,###,###");
		double avg=(priceLaptop+pricePC+priceProject)/3;
		System.out.print("The average price of these three products:"+(formatter.format(avg))+" VND");
	}
	public static void doEx5()
	{
		int i=2000;
		NumberFormat currencyFormat=NumberFormat.getCurrencyInstance();
		String s1=currencyFormat.format(i);
		System.out.println("Convert to string: "+s1);
	}
	public static void doEx6()
	{
		String [] s={"Welcome to Java Basic"};
		String count = "_";
		for (int i=0; i<s.length-1;i++)
		{
			if (s[i]==" ")
			{
				s[i]=count;
			}
			if (i==s.length)
			{
				s[i]="";
			}
		}
		System.out.println(s);
	}
	public static void doEx7()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap chuoi s1: ");
		String s1=scan.next();
		System.out.println("Nhap chuoi s2: ");
		String s2=scan.next();
		if(s1.equals(s2))
		{
			System.out.println("TC passed");
		} else
		{
			System.out.println("TC failed");
		}
	}
	public static void doEx8()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Your : ");
		int age=scan.nextInt();
		if(age>=18)
		{
			System.out.println("You are eligible to vote");
		} else
		{
			System.out.println("You are not eligible to vote");
		}
	}
	public static void doEx9()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");
		int a=scan.nextInt();
		if(a%2==0)
		{
			System.out.println("The number is an even number");
		} else
		{
			System.out.println("The number is an odd number");
		}
	}
	public static void doEx10()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter quiz: ");
		int q=scan.nextInt();
		System.out.println("Enter mid-term: ");
		int mt=scan.nextInt();
		System.out.println("Enter final scores: ");
		int fs=scan.nextInt();
		float avg=(float)((q+mt+fs)/3);
		if(avg>=90)
		{
		System.out.println("Your grade is A");
		}else if(avg<90 && avg>=70)
		{
		System.out.println("Your grade is B");
		}else if(avg<70 && avg>=50)
		{
		System.out.println("Your grade is C");
		}else
		{
		System.out.println("Your grade is D");
		}
	}
	
}
